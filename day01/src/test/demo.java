package test;

import java.util.Scanner;

public class demo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    String[] arr = {"a","b","c","d","f","h","o","o"};
        System.out.println("请输入要查找的单词：");
        String index = input.nextLine();
        for (int i = 0; i <arr.length ; i++) {
            if(index.equals(arr[i])){
                System.out.println("YES");
                break;
            }else{
                System.out.println("NO");
                break;
            }
        }

    }
    }
