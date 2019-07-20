package test;

import java.util.Arrays;

public class Method {

    static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = (left + right) / 2;
        while (true) {
            if (arr[index] == target) {
                System.out.println(arr[index]);
                break;
            } else if (arr[index] < target) {

                index = (index + arr.length) / 2;
            } else {
                index = index / 2;

            }

        }
        return target;
    }


    public static void main(String[] args) {
        int[] arr={2,23,45,65,78,12,24,35};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println();

        search(arr,78);



    }
}
