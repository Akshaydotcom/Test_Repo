import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionBS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
		int i=0, k=0;
        int[] a = new int[n];
		int[] fa=new int[1000];
		int[] fb = new int[1000];
		int b_i=0, a_i=0, j=1;
        for(a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(b_i=0; b_i < m; b_i++)
		{
            b[b_i] = in.nextInt();//elements of set b
        	
		}
		for(i=0;i<n;i++)//factors of set a
		{
			for(j=1;j<n;j++)
			{
				if(a[i]%j==0)
					fa[k]=j;
				k++;
			}	
		}
		k=0;
		for(i=0;i<n;i++)//factors of set b
		{
			for(j=1;j<n;j++)
			{
				if(b[i]%j==0)
					fb[k]=j;
				k++;
			}	
		}
		int flag=0;
		k=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			if(fa[k]==fb[k])
				flag++;
				System.out.println(fa[k]+" "+fb[k]);
				k++;
			}
		}
		System.out.println(flag);
    }
}
