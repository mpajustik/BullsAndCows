import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double x = scanner.nextDouble();
        double y = x*x*x + x*x + x +1;
        System.out.println(y);
    }
}