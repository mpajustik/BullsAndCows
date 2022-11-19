import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();
        double q1 = scanner.nextDouble();
        double q2 = scanner.nextDouble();

        double ylemine = p1 * q1 + p2 * q2;
        double pSkalaar = Math.sqrt(Math.pow(p1,2)+Math.pow(p2,2));
        double qSkalaar = Math.sqrt(Math.pow(q1,2)+Math.pow(q2,2));
        double cosA = ylemine/(pSkalaar*qSkalaar);

        double nurk = Math.acos(cosA)*180/Math.PI;
        System.out.println(nurk);


    }
}