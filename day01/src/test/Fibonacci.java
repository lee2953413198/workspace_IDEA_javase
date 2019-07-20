package test;

public class Fibonacci {
    public static void main(String[] args) {

            int a = 1;
            int b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i <1000 ; i++) {
            if (i==a+b){
                a=b;
                b=i;
                    System.out.print(i + " ");
                }
            }
        }
    }

