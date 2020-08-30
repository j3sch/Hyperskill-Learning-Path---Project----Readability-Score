import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code he

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            try {
                int num = Integer.parseInt(input);
                if (num != 0) {
                    System.out.println(num * 10);
                } else {
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("Invalid user input: " + input);
            }

        }
    }
}