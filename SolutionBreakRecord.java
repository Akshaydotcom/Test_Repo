import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionBreakRecord{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=0;
		int[] score = new int[n];
        for(i=0; i < n; i++){
            score[i] = in.nextInt();
        }
        int highest=score[0], lowest=score[0], count_h=0, count_l=0;
		for(i=1;i<n;i++)
		{
			if(score[i]>highest)
			{
			count_h++;
			highest=score[i];
			}
			else if(score[i]<lowest)
			{
			count_l++;
			lowest=score[i];
			}
		}
		System.out.println(count_h+" "+count_l);
    }
}
