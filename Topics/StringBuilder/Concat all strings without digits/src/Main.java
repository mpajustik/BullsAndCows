import java.util.Scanner;

class ConcatenateStringsProblem {

    
    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder sb = new StringBuilder();
        for (String a: strings) {
            sb.append(a);
        }
        /*
        for(int i = 0; i<sb.length(); i++){
            if(Character.isDigit(sb.charAt(i)) ){
                sb.deleteCharAt(i);
            }
        }

         */

        return sb.toString().replaceAll("\\d+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}