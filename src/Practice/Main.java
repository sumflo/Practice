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

    public static void main(String[] args) {

        System.out.println(Arrays.toString(randInts()));

    }
}
