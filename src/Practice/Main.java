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

        for(int i =0; i <randInts.length; i++){
            if (max < randInts[i]){
                max = randInts[i];
            }
        }return max;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(randInts()));
        System.out.println(randMax(randInts()));
    }
}
