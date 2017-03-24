import java.io.*;
import java.util.*;

public class Solution {
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            int t=a.nextInt();
            Scanner n = new Scanner(System.in);
            String mystring= n.nextLine(); 
			String mystring2= n.nextLine();
			char[] myarray1=mystring.toCharArray();
            char[] myarray2=mystring2.toCharArray();
			char[] odd1 =new char[mystring.length()];
            char[] even1 =new char[mystring.length()];
			char[] odd2 =new char[mystring2.length()];
            char[] even2 =new char[mystring2.length()];
			for(int q=0;q<t;q++){
            int j=0;
			System.out.println("Worked Till 1");
            for(int i = 0; i < 1000; i++)
            {
				System.out.println("Entered Second Loop");
                if(i%2==0)
                {
                    myarray[i]=even2[j];
                    j++;
					System.out.println("Entered if");
                }
                else
                {
                    myarray[i]=odd1[j];
                    j++;
					System.out.println("Entered Else");
                }
            }
        }
		System.out.println(even2 +" "+ odd1);
    }   
}