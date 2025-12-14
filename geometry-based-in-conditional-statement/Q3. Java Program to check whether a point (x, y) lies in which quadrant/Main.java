import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    if(x>0 && y>0){
	        System.out.println("First quardant");
	    }
	    else if(x<0 && y>0){
	        System.out.println("Second quardant");
	    }
	    else if(x<0 && y<0){
		System.out.println("Third quardant");
	    }
	    else{
	        System.out.println("Fourth quardant");
	    }
	}
}
