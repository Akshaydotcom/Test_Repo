import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionApple {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int i=0;
        int[] afh = new int[m];
        int[] ofh = new int[n];
        int[] apple = new int[m];
		int oi=0;
		int ai=0;
        for(ai=0; ai < m; ai++){//Get apple array
            apple[ai] = in.nextInt();
        }
        int[] orange = new int[n];
        for(oi=0; oi < n; oi++){ //Get orange array
            orange[oi] = in.nextInt();
        }
        int coa=0;
        int coo=0;
        for(ai=0;ai<m;ai++)
        {
            afh[ai]=apple[ai]+a;//Adds m + a for each fallen apple
			if(s<=afh[ai] && afh[ai]<=t)
                coa++;
        }
        for(oi=0;oi<n;oi++)
        {	
			ofh[oi]=orange[oi]+b;//Adds n + o for each fallen orange
			if(s<=ofh[oi] && ofh[oi]<=t)
                coo++;
        }
        System.out.println(coa);
        System.out.println(coo);
        }
    }

