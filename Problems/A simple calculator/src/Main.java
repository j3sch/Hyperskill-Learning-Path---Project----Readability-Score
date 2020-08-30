import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long first = Long.parseLong(sc.next());
        String oper = sc.next();
        long second = Long.parseLong(sc.next());



        if (oper.equals("/") && second == 0) {
            System.out.println("Division by 0!");
        } else {

            long addi = first + second;
            long sub = first - second;
            long div = first / second;
            long mul = first * second;
            if (oper.equals("+")) {
                System.out.println(addi);
            } else if (oper.equals("-")) {
                System.out.println(sub);
            } else if (oper.equals("/")) {
                System.out.println(div);
            } else if (oper.equals("*")) {
                System.out.println(mul);
            } else {
                System.out.println("Unknown operator");
            }
        }
    }
}