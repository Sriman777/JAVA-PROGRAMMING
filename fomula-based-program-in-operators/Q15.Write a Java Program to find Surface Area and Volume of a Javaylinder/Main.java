import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(2*3.14*r*(r+h));
        System.out.println(3.14*r*r*h);  
    }
}
