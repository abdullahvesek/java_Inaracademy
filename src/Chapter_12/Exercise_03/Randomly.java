package Chapter_12.Exercise_03;

import java.util.Scanner;

public class Randomly {
    public static void main(String[] args) {
        int[] list = new int[100];
        for (int i = 0; i < 100; i++) {
            list[i] = (int) (Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);

        boolean okey = true;
        do {
            System.out.println("enter an index ");

            try {
                int index = input.nextInt();
                System.out.println("the element is " + list[index]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("out of bounds ");
                okey = false;
            }

        } while (okey);
    }
}