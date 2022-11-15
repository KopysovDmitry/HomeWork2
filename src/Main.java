package ru.skyeng;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //task 1//

        int[] numbers = new int[3];
        int i = 0;
        while (i < numbers.length - 1) {
            i = i + 1;
            numbers[i] = i;
            System.out.print(numbers[i] + ",");
        }
        System.out.print(numbers.length);
        System.out.println(" ");

        //task 2//

        double[] num = {1.57, 7.654, 9.986};
        int d = -1;
        while (d < num.length - (num.length - 1)) {
            d = d + 1;
            System.out.print(num[d] + ",");
        }
        System.out.print(num[num.length - 1]);
        System.out.println(" ");

        //task 3//

        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int ii = 0; ii < integers.length - 1; ii++) {
            System.out.print(integers[ii] + ",");
        }
        System.out.println(integers[9]);

        //task 4//

        int[] numbers_1 = {1, 2, 3};
        for (int i_1 = numbers_1.length - 1; i_1 >= 0; i_1 = i_1 - 1) {
            System.out.print(numbers_1[i]);
            if (i_1 != 0) {
                System.out.print(", ");
            }
            System.out.println(" ");

        }

        //task 5//

        double[] num_1 = {1.57, 7.654, 9.986};
        int d_1 = num_1.length;
        while (d_1 > 1) {
            d_1 = d_1 - 1;
            System.out.print(num_1[d_1] + ",");
        }
        System.out.print(num_1[0]);
        System.out.println(" ");

        //task 6//

        int[] integers_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ii = integers_1.length;
        while (ii > 1) {
            ii = ii - 1;
            System.out.print(integers_1[ii] + ",");
        }
        System.out.print(integers_1[0]);
        System.out.println(" ");

        //task 7//

        int[] arr = {1, 2, 3};
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1] % 2 != 0) {
                arr[i] += 1;
            }
        }
            System.out.println(Arrays.toString(arr));
            System.out.println(" ");

    }
}
