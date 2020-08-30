import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vx = sc.nextInt();
        int vy = sc.nextInt();
        int ux = sc.nextInt();
        int uy = sc.nextInt();

        System.out.println(Math.toDegrees(Math.acos((ux * vx + vy * uy) / (Math.hypot(ux, uy) * Math.hypot(vx, vy)))));
    }
}