package test;

public class hello {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        for (int a = 5; a > 0; a--) {
            for (int b = 0; b < 5 - a; b++) {
                System.out.print(" ");
            }
            for (int k = 0; k < a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 6 - (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*for (int i = 97; i <123 ; i++) {
            System.out.print((char)i);

        }
        for (int i = 121; i>96 ; i--) {
            System.out.print((char)i);

        }*/
        for (int i = 97; i <148 ; i++) {
            if (i<123) {
                System.out.print((char) i);
            }else{
                System.out.print((char)(244-i));
            }
        }
    }
}
