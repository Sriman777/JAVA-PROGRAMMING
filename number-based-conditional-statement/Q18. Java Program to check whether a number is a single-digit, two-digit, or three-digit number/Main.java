import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0 && n <= 9)
            System.out.println("Single Digit");
        else if (n >= 10 && n <= 99)
            System.out.println("Two Digit");
        else if (n >= 100 && n <= 999)
            System.out.println("Three Digit");
        else
            System.out.println("More than 3 Digits");
    }
}
