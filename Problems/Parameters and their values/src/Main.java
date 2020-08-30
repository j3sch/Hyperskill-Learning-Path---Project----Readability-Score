class Problem {

    public static void main(String[] args) {
        int len = args.length;
        try {
            for (int i = 0; i < len; i++) {
                System.out.println(args[i] + "=" + args[i + 1]);
                i++;
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}


