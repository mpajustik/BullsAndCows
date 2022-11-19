import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double disc = Math.pow(b, 2) - 4 * a * c;

        double root1 = (-b + Math.sqrt(disc)) / (2 * a);
        double root2 = (-b - Math.sqrt(disc)) / (2 * a);

        double x1, x2;
        if (root1 < root2) {
            x1 = root1;
            x2 = root2;
        } else {
            x2 = root1;
            x1 = root2;
        }
        System.out.printf("%f %f", x1, x2);

    }
}