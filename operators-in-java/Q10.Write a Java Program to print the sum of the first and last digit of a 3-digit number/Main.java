import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = (num / 100) + (num % 10); 
        System.out.println(sum);
    }
}
