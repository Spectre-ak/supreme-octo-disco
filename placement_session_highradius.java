package leet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class fgs {
	public static void main(String[] args) {
		List<String> inputByLine = new ArrayList<>();
		try {
			InputStreamReader isr=new InputStreamReader(System.in, "UTF-8");
			BufferedReader br=new BufferedReader(isr);
			String line = "";
			String no="";
			no = br.readLine().toString();
			char arr[]=no.toCharArray();
			HashMap<String, Boolean> hm=new HashMap<>();
			long ans=0;
			for(int i=0;i<arr.length;i++) {
				String pm="";
				for(int j=i;j<arr.length;j++) {
					pm=pm+arr[j];
					if(hm.getOrDefault(pm, false))continue;
					long num = Long.parseLong(pm);
					if(isPrime(num)) {
						ans=ans+num;
						hm.put(pm,true);
					}
				}
			}
			System.out.println(ans);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	static boolean isPrime(long n){
        if (n<=1)
            return false;
        if (n<=3)
            return true;
        if (n%2==0 || n%3==0)
            return false;
        for (long i=5; i*i<=n; i=i+6)
            if (n%i==0 || n% (i+2)==0)
                return false;
        return true;
    }
}
