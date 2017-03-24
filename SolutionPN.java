import java.io.*;
import java.util.*;

public class SolutionPN {

    public static void main(String[] args) {
        int n = 0, i=0;
        float pos=0, nev=0,noz=0;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int[] a = new int[n];
        for(i=0;i<n;i++)
            {
            a[i]=s.nextInt();
            if(a[i]>0)
                {
                pos++;
            }
            else if(a[i]<0)
                {
                nev++;
            }
            else if(a[i]==0)
                {
                noz++;
            }
        }
        System.out.println((pos/n));
        System.out.println((nev/n));
		System.out.println((noz/n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}