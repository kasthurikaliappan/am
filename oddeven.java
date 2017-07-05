package kas;
import java.util.*;
public class oddeven {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String");
		String n=s.nextLine();
		char m = 0;
		for(int i=0; i<n.length(); i=i+2){
			m=(char) (m+n.charAt(i+1)+n.charAt(i));
		}
		if(n.length()%2==0){
			m=(char) (m+n.charAt(n.length()-1));
			System.out.println(m);
			
		}
			
		
		

}}
