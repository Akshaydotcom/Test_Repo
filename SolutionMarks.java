import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionMarks{

	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int j = in.nextInt();
	int i=0;
	int[] mark = new int[j];
	int[] round = new int[j];
	for(i=0;i<j;i++){
	mark[i]=in.nextInt();
	round[i]=(mark[i])/5;
	if(mark[i]>=38)
		{
			if((round[i]+1)*5-mark[i]<3)
			{
			mark[i]=(round[i]+1)*5;
			}
		}
	}
	for(i=0;i<j;i++)
	System.out.println(mark[i]);
	
	}
}