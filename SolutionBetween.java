import java.io.*;
import java.util.*;
import java.util.Arrays;
public class SolutionBetween{

	public static void main(String[] args){
	int[] a=new int[10];
	int[] b = new int[10];
	Scanner in = new Scanner(System.in);
	int i=0, n=0, m=0, temp=0, s = 0, u = 0, f1=0;
	boolean flag;
	n=in.nextInt();
	m=in.nextInt();
	for(i=0;i<n;i++)//getting elements of set a
	{
	a[i]=in.nextInt();
	}
	for(i=0;i<m;i++)//getting elements of set b
	{
	b[i]=in.nextInt();
	}
	for ( s = 0; s < m; s++) //sorting array b
	{
		for (u = s + 1; u < m; u++) 
            {
                if (b[s] > b[u]) 
                {
                    temp = b[s];
                    b[s] = b[u];
                    b[u] = temp;
				}
			}
	}
	for ( s = 0; s < n; s++) //sorting array a
	{
		for (u = s + 1; u < n; u++) 
            {
                if (a[s] < a[u]) 
                {
                    temp = a[s];
                    a[s] = a[u];
                    a[u] = temp;
				}
			}
	}
	int amax=a[0];
	int bmin=b[0];
	for(i=amax;i<=bmin;i++)
	{flag=true;
		for(int j=0;j<=m;j++)
		{
			if(b[j]%i!=0)
				{
					flag=false;
					break;
				}
			
		}
		for(int j=0;j<n;j++)
		{
			if(i%a[j]!=0)
				{
					flag=false;
					break;
				}
		}
		if(flag)
			f1++;
	}
	System.out.println(f1);
	}
}