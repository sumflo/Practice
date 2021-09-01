package Practice;

import java.util.Arrays;

public class Main {

    public static int[] randInts(){
        int[] randInts = new int[20];

        for (int i = 0; i < randInts.length; i++) {
            randInts[i] = (int) ((Math.random() * (101 - 1)) + 1);
        }

        return randInts;
    }

    public static int randMax(int[] randInts){
        int max = randInts[0];

        for(int i = 0; i <randInts.length; i++){
            if (max < randInts[i]){
                max = randInts[i];
            }
        }return max;
    }

    public static int randMin(int[] randInts){
        int min = randInts[0];

        for(int i = 0; i <randInts.length; i++){
            if (min > randInts[i]){
                min = randInts[i];
            }
        }return min;
    }

    public static int oddNums(int[] randInts){
        int counter = 0;

        for(int i = 0; i <randInts.length; i++){
            if (randInts[i] % 2 != 0){
                counter++;
            }
        }return counter;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(randInts()));
        System.out.println(randMax(randInts()));
        System.out.println(oddNums(randInts()));
    }
}
