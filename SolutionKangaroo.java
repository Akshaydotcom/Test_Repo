import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionKangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
		int flag=0;
		int k1=0, k2=0;
		for(int i =0;i<10000;i++)
		{
		k1=x1+i*(v1);
		k2=x2+i*(v2);
		if(k1==k2)
		{
			flag++;
		}
		}
		if(flag>0)
		{
			System.out.println("YES");
        }
		else
		{
			System.out.println("NO");
		}
    }
}
