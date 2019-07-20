package test;

import java.util.Scanner;

public class circular {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("请输入圆的半径");
        int index = input.nextInt();
        input.nextLine();
        int area=area(index);
        System.out.println("圆的面积为："+area);
    }
    static int area(int x){
      double a = Math.PI*x*x;
        return (int)a;
    }

}
