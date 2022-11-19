import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int minNum = scanner.nextInt();
        int maxNum = scanner.nextInt();
        int howManyTimes = scanner.nextInt();
        int maxRandomNumber = scanner.nextInt();

        int createdMaxNumberInSequence = 0;
        int createdRandomNumber;
        int smallestMaximum = maxRandomNumber;
        int smallestMaximumKey = 0;
        Map<Integer, Integer> randomNumberValues = new HashMap<Integer, Integer>();


        for (int i = minNum; i <= maxNum; i++) {
            createdMaxNumberInSequence = 0;
            Random num = new Random(i);
            randomNumberValues.put(i, 0);
            for (int j = 0; j < howManyTimes; j++) {
                createdRandomNumber = num.nextInt(maxRandomNumber);
                if (createdMaxNumberInSequence < createdRandomNumber) {
                    createdMaxNumberInSequence = createdRandomNumber;
                    randomNumberValues.put(i, createdRandomNumber);
                }
            }

        }

        for (int i = minNum; i < maxNum; i++) {
            if (smallestMaximum > randomNumberValues.get(i)) {
                smallestMaximum = randomNumberValues.get(i);
                smallestMaximumKey = i;

            }
        }
        System.out.println(smallestMaximumKey);
        System.out.println(smallestMaximum);
    }
}