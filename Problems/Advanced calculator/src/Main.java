/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        if (operator.equals("MAX")) {
            int max = Integer.parseInt(args[1]);
            for (int i = 2; i < args.length; i++) {
                if (max < Integer.parseInt(args[i])) {
                    max = Integer.parseInt(args[i]);
                }
            }
            System.out.println(max);
        }
        if (operator.equals("MIN")) {
            int min = Integer.parseInt(args[1]);
            for (int i = 2; i < args.length; i++) {
                if (min > Integer.parseInt(args[i])) {
                    min = Integer.parseInt(args[i]);
                }
            }
            System.out.println(min);
        }
        if (operator.equals("SUM")) {
            int sum = 0;
            for (int i = 1; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println(sum);
        }
    }
}