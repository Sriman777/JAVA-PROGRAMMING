import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        double hra = sc.nextDouble();
        double allow = sc.nextDouble();
        double total = basic + hra + allow;
        System.out.println(total);
    }
}
