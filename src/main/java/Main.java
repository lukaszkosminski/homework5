import java.time.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        int[] inputInt = {45, 0, -3, -2, -1, 0, 1, 2, 3, 4, 5, -3, 10, 11, -500, 1000};
        String[] inputString = {"Andrzej", "Romuald", "Lukasz", "Michal", "Jaroslaw"};

//        exA(inputInt);
//        exB(inputInt);
//        exC(inputString);
//        exD();
//        exE("Tomek");
    }

    public static int[] exA(int[] input) {
        int[] output = new int[2];
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                output[0]++;
            } else {
                output[1] += input[i];
            }
        }
        System.out.println("number of negative numbers: " + output[0] + "\nsum of positive numbers: " + output[1]);
        return output;
    }

    public static Map exB(int[] input) {
        Map<String, Integer> calcSummary = new TreeMap<>();
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
        calcSummary.put("number of negative numbers", output[0]);
        calcSummary.put("number of positive numbers", output[1]);
        calcSummary.put("number of zeros", output[2]);
        calcSummary.put("sum of negative numbers", output[3]);
        calcSummary.put("sum of positive numbers", output[4]);
        System.out.println(calcSummary);
        return calcSummary;
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
    }

    public static void exD() {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.of(2021, 04, 11, 14, 00);
        Duration duration = Duration.between(today, end);

        int day = (int) TimeUnit.SECONDS.toDays(duration.getSeconds());
        long hours = TimeUnit.SECONDS.toHours(duration.getSeconds()) - (day * 24);
        long minute = TimeUnit.SECONDS.toMinutes(duration.getSeconds()) - (TimeUnit.SECONDS.toHours(duration.getSeconds()) * 60);
        long second = TimeUnit.SECONDS.toSeconds(duration.getSeconds()) - (TimeUnit.SECONDS.toMinutes(duration.getSeconds()) * 60);

        System.out.println("do końca kursu pozostało: " + day + " dni " + hours + " godzin " + minute + " minut " + second + " sekund ");
    }

    public static void exE(String name) {

        Map<String, Integer> students = new TreeMap<>();
        students.put("Andrzej", 5);
        students.put("Jaroslaw", 1);
        students.put("Roman", 3);
        students.put("Lech", 2);
        students.put("Tomek", null);

        boolean containskey = students.containsKey(name);
        System.out.println(containskey);

        if (!students.containsKey(name)) {
            System.out.println("Nie znaleziono kursanta o imieniu " + name);
        } else {
            Optional<Integer> gradeOptional = getGrade(students, name);
            if (gradeOptional.isPresent()) {
                System.out.println(name + "za zadanie domowe otrzymal: " + gradeOptional.get() + " pkt");
            } else {
                System.out.println(name + " nie wykonal jeszcze zadania");
            }
        }
    }

    public static Optional<Integer> getGrade(Map<String, Integer> students, String imie) {
        return Optional.ofNullable(students.get(imie));
    }
}

