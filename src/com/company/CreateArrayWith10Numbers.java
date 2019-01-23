package com.company;

public class CreateArrayWith10Numbers {

    public static void main(String[] args) {

        // Arrays can only have one data type (e.g. int, String, double, float)
        // Arrays need to have the number of elements set
            /* This is an example of an array named numbers10, the data type is int, and the number
                elements is 10 */
        int[] numbers10 = new int[10];
        numbers10[0] = 1;
        numbers10[1] = 2;
        numbers10[2] = 3;
        numbers10[3] = 4;
        numbers10[4] = 5;
        numbers10[5] = 6;
        numbers10[6] = 7;
        numbers10[7] = 8;
        numbers10[8] = 9;
        numbers10[9] = 10;
        // Printing the array
        for (int index = 0; index < numbers10.length; index++) {
            //
            //[index] Get me the value in the1

            // numbers10 with an index of _(0,1,2,3,4,5,6,7,8)
            //
            if (numbers10[index] == 10) {

                System.out.println(index);

            }
        }
    }
}


