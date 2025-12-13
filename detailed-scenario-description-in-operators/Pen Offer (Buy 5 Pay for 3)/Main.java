import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int bought = sc.nextInt();
        int groups = bought / 5;
        int paidPens = groups * 3 + (bought % 5);
        int totalCost = paidPens * price;
        System.out.println(paidPens);
        System.out.println(totalCost);
    }
}
