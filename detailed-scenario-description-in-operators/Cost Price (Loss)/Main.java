import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sp = sc.nextDouble();
        double loss = sc.nextDouble();
        double cp = sp + loss;
        System.out.println(cp);
    }
}
