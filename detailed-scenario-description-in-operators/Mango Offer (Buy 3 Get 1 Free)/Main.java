import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int bought = sc.nextInt();
        int free = bought / 3;
        int totalMangoes = bought + free;
        int amount = bought * price;
        System.out.println(totalMangoes);
        System.out.println(amount);
    }
}
