class Problem {

    public static void main(String[] args) {
            if (args[0].equals("+")) {
                System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
            } else if (args[0].equals("-")) {
                System.out.println(Integer.parseInt(args[1]) - Integer.parseInt(args[2]));
            } else if (args[0].equals("*")) {
                System.out.println(Integer.parseInt(args[1]) * Integer.parseInt(args[2]));
            } else {
            System.out.println("Unknown operator");
        }
    }
}