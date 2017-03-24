import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a= new int[3];
        int[] b= new int[3];
        int i = 0;
        for(i=0;i<3;i++)
            {
            a[i]=in.nextInt();
        }
        for(i=0;i<3;i++)
            {
            b[i]=in.nextInt();
        }
		int alice = 0;
        int bob=0;
        {
			if(a[0]>b[0])
				alice++;
			else if(b[0]>a[0])
				bob++;
		}
		{
			if(a[1]>b[1])
				alice++;
			else if(b[1]>a[1])
				bob++;
		}
		{
			if(a[2]>b[2])
				alice++;
			else if(b[2]>a[2])
				bob++;
		}
        System.out.println(alice+" "+bob);
    }
}
