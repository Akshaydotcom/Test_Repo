//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


class SolutionDay8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		int phonenumber =0;
		String s=" ";
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);// Write code here
        }
        while(in.hasNext()){
            s = in.next();
			// Write code here
        }
		for(int j=1;j<n;j++)
		{
			phonenumber=phoneBook.get(s);
			System.out.println(s+"="+phonenumber);
		}
        in.close();
    }
}
