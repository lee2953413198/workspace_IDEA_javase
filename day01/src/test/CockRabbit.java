package test;

import java.util.Scanner;

public class CockRabbit {
    public static void main(String[] args) {
        System.out.println("请输入头的个数");
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        System.out.println("请输入脚的个数");
        int foot = scanner.nextInt();

        int x,y;
        if (head>0 && foot>0 && foot>=head*2 && foot<=head*4 && foot % 2 ==0 ) {
             y = (foot - head * 2)/2;
             x = head - y;
            System.out.println("兔有"+y+"只");
             System.out.println("鸡有"+x+"只");
        }else{
            System.out.println("输入有误");
        }
    }
}
