import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp = sc.nextDouble();
        double profit = sc.nextDouble();
        double sp = cp + profit;
        System.out.println(sp);
    }
}
