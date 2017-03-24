import java.io.*;
import java.util.*;
public class SolutionDiagDif{

	public static void main(String[] args){
	int n=0, i=0, j=0;
	Scanner s = new Scanner(System.in);
	n=s.nextInt();
	int[][] a=new int[n][n];	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	int sumopd=0, sumosd=0;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i==j)
			{
				sumopd=sumopd+a[i][j];
			}
		}
	}
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i==(n-1)-j)
			{
				sumosd=sumosd+a[i][j];			
			}
		}		
	}
	int diff=(sumopd-sumosd);
	if(diff<=0)
	{
		diff=diff*-1;
	}
	System.out.println(diff);
	}
	
}