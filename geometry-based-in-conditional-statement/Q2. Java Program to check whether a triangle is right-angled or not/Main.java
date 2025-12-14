import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)){
	        System.out.println("Right angled triangle");
	    }
		else{
		    System.out.println("not aright angled triangle");
		}
	}
}
//pathogen theorem a^2+b^2+c^2