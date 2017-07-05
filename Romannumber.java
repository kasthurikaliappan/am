package kas;
import java.util.*;
public class Romannumber {
	public static void main(String argd[]){
		System.out.println("Enter a number");
		Decimal12Roman();
		}

	private static void Decimal12Roman() {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 if(n>0&&n<4000){
			 String thou[]={"","M","MM","MMM"};
			 String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
			 String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
			 String unit[]={"","I","II","III","IV","VII","VIII","IX"};
			 int th=n/1000;
			 int h=(n/100)%10;;
			 int t=(n/10)%10;
			 int u=n%10;
			 System.out.println("the roman number of"+ n +"is"+thou[th]+hund[h]+ten[t]+unit[u]);
			 }
		 else
		 {
			 System.out.println("\n you entered a number out of range");
			 
		 }
	}

	
		
	}


