import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] inputInt = {45, 0, -3, -2, -1, 0, 1, 2, 3, 4, 5, -3, 10, 11, -500, 1000};
        String[] inputString = {"Andrzej", "Romuald", "Lukasz", "Michal", "Jaroslaw"};
        //  exA(inputInt);
        //  exB(inputInt);
        //  exC(inputString);
        exD();

    }

    public static void exA(int[] input) {
        int[] output = new int[2];
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                output[0]++;
            } else {
                output[1] += input[i];
            }
        }
        System.out.println(output[0]);
        System.out.println(output[1]);
    }

    public static void exB(int[] input) {
        int[] output = new int[5];


        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                output[0]++;
                output[3] += input[i];
            }
            if (input[i] >= 0) {
                output[1]++;
                output[4] += input[i];

            }
            if (input[i] == 0) {
                output[2]++;
            }
        }
        System.out.println("number of negative numbers = " + output[0]);
        System.out.println("number of positive numbers = " + output[1]);
        System.out.println("number of zeros = " + output[2]);
        System.out.println("sum of negative numbers = " + output[3]);
        System.out.println("sum of positive numbers = " + output[4]);
    }

    public static void exC(String[] stringArray) {
        System.out.println("podaj litere");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine().toLowerCase();
        LinkedHashMap<String, Boolean> maps = new LinkedHashMap<>();

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].toLowerCase().contains(letter)) {
                maps.put(stringArray[i], true);
                System.out.println(stringArray[i] + ", " + true);
            } else if (!stringArray[i].toLowerCase().contains(letter)) {
                maps.put(stringArray[i], false);
                System.out.println(stringArray[i] + ", " + false);
            }
        }

    }public static void exD(){
        Instant now = Instant.now();
        System.out.println(now);

        LocalDateTime now2 = LocalDateTime.now();

        System.out.println(now2.plus(60, ChronoUnit.SECONDS));
        System.out.println();

    }
}

