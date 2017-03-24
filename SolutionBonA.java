import java.io.*;
import java.util.*;

public class SolutionBonA{

	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n= in.nextInt();
	int i=in.nextInt();
	int j=0, sum=0, chargedcost=0, answer=0;
	int[] item = new int[n];
	for(j=0;j<n;j++)//to get cost of items in array
	{
		item[j]=in.nextInt();
	}
	chargedcost=in.nextInt();
	in.close();
	// to find total cost
	for(j=0;j<n;j++)
	{
	sum=sum+item[j];
	}
	int actualcost=(sum-item[i])/2;
	if(chargedcost!=actualcost)
	{
		answer=chargedcost-actualcost;
		if(answer<0)
		{
			answer=answer*-1;
		}
		System.out.println(answer);
	}
	else if(chargedcost==actualcost)
	{
		System.out.println("Bon Appetit");
	}
	
	}
}