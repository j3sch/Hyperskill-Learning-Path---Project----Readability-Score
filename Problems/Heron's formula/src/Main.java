import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double p = (a + b + c) / 2;
        double res = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(res);
    }
}