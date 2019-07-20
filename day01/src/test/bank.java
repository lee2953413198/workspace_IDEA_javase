package test;

import java.awt.*;
import java.util.Scanner;

public class bank {
    static int money = 100000;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /**
         * 查询余额
         * 取钱
         * 存钱
         * 转账
         * 业务循环
         */
        ShowMenu();


    }
    static void ShowMenu(){
        while (true){
            System.out.println("*********");
            System.out.println("1.查询余额");
            System.out.println("2.取钱");
            System.out.println("3.存钱");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入编号来选择功能");
            int index = input.nextInt();
            input.nextLine();
            switch (index){
                case 1:
                    lookMoney();
                    break;
                case 2:
                    reduceMoney();
                    break;
                case 3:
                    addMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    break;
                    default:
                        System.out.println("没有此项");
            }
        }
    }
    static void lookMoney() {
        System.out.println("余额为："+money);
    }
    static void reduceMoney(){
        System.out.println("请输入取款金额");
        int red = input.nextInt();
        input.nextLine();
        money-=red;
        System.out.println("请收好您的钞票");
    }
    static void addMoney(){
        System.out.println("请输入存入金额");
        int add=input.nextInt();
        input.nextLine();
        money+=add;
        System.out.println("存款成功");
    }
    static void transferMoney(){
        System.out.println("请输入转款账号");
        input.nextInt();
        input.nextLine();
        System.out.println("请输入转款金额");
        int trans = input.nextInt();
        input.nextLine();
        money-=trans;
        System.out.println("转账成功");
    }
    static void out(){

    }
}
