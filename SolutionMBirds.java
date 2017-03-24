import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionMBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] type = new int[n];
		int c1=0,c2=0,c3=0,c4=0,c5=0;
        for(int i=0; i < n; i++){
            type[i] = in.nextInt();
			if(type[i]==1)
			{
				c1++;
			}
			else if(type[i]==2)
			{
				c2++;
			}
			else if(type[i]==3)
			{
				c3++;
			}
			else if(type[i]==4)
			{
				c4++;
			}
			else if(type[i]==5)
			{
				c5++;
			}
		}
		int max=Math.max(c1,Math.max(c2,Math.max(c3, Math.max(c4,c5))));
		
		if(max==c1)
			System.out.println("1");
		else if(max==c2)
			System.out.println("2");
		else if(max==c3)
			System.out.println("3");
		else if(max==c4)
			System.out.println("4");
		else if(max==c5)
			System.out.println("5");
        // your code goes here
    }
}
