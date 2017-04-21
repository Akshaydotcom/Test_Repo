import java.io.*;
import java.util.*;
import java.lang.*;
public class Alarm{

public static void main(String args[])throws IOException{
	Scanner b =new Scanner(System.in);
	int h=b.nextInt();
	int m=b.nextInt();
	int s=b.nextInt();
	int sleeptime=(h*60*60*1000)+(m*60*1000)+(s*1000);
	try	{
			Thread.sleep(sleeptime);
			Runtime runtime = Runtime.getRuntime();
			String[] a = new String[] {"C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe","C:\\Users\\Akshay Bhandary\\Desktop\\Awesome NS.xspf"};
			Process process = runtime.exec(a);
		}
	catch(InterruptedException e) {System.out.println(e);}
	}
}