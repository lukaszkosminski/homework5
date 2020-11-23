public class Main {

    public static void main(String[] args) {
        int[] input = {45, -3, -2, -1, 0, 1, 2, 3, 4, 5, -3, 10, 11, -500, 1000};
        exA(input);

    }

    public static void exA(int[] input) {
        int [] wynik = new int[2];
        for (int i = 0; i <input.length; i++){
            if (input[i]<0) {
                wynik[0]++;
            }
            else{
                wynik[1] += input[i];
            }
        }
        System.out.println(wynik[0]);
        System.out.println(wynik[1]);
    }
    public static void exB(int[]input){
        int[]wynik = new int[5];

        for (int i = 0; i < input.length;i++){

        }


    }
}
