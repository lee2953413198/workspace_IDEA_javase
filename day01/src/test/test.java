package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println(abs(-5));
        System.out.println(1+1);
    }
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + "," + j + "  ");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j >= 2 && j - i <= 2 && i+j<=6 && i-j<=2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
                System.out.println();


        }
    }*/
    static int abs(int x){
        return x>0? x: -x;
    }

}
