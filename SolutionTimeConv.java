import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class SolutionTimeConv{

	public static void main(String[] args){
		int hour=0;
		char am;
		Scanner in = new Scanner(System.in);
		String d1=in.next();
		String pattern="(.*)(A|P)";
		String pattern2 ="(\\d+)(\\D)(\\d+)(\\D)(\\d+)(\\w+)";
		Pattern r = Pattern.compile(pattern);
		Pattern s = Pattern.compile(pattern2);
		Matcher m = r.matcher(d1);
		Matcher m2 = s.matcher(d1);
		if(m2.find()){
			hour=Integer.parseInt(m2.group(1));
			if(m.find()){
				am = (m.group(2)).charAt(0);
				if(am=='P')
				{
					if(hour==12)
					{
						System.out.println(m2.group(1)+":"+m2.group(3)+":"+m2.group(5));
					}
					else
					{
						hour=hour+12;
						System.out.println(hour+":"+m2.group(3)+":"+m2.group(5));
					}
				}
				else if(am=='A')
				{
					if(hour==12)
					{
						System.out.println("00"+":"+m2.group(3)+":"+m2.group(5));
					}
					else
					{
						System.out.println(m2.group(1)+":"+m2.group(3)+":"+m2.group(5));
					}
				}
			}
		}
	}
}