import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionDivisibleSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
		int i=0, flag=0, j=0;
        for(i=0; i < n; i++){
            a[i] = in.nextInt();
        }
		for(i=0;i<n;i++)
		{
			for(j=i+1;i<j;j++)
			{
				if(j<n && (a[i]+a[j])%k==0)
				{	
					flag++;
				}
				
			}
		}
		System.out.println(flag);
		
    }
}
