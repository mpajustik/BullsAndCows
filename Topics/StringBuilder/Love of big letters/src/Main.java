import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        // write your code here
        StringBuilder msg = new StringBuilder(message);
        for(int i = 0; i<msg.length(); i+=2){
            msg.setCharAt(i,Character.toUpperCase(msg.charAt(i)));
            /*
            System.out.println(msg.charAt(i));
            Character.toUpperCase(msg.charAt(i));

             */
        }
        return msg.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}