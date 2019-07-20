package test;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        /*int data[] = null;
        data = new int[3]; //开辟一个长度为3的数组
        int temp[] = null; //声明对象
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        temp = data;  //int temp[] = data;
        temp[0] = 99;
        for(int i = 0; i < temp.length; i++) {
            System.out.println(data[i]);
        }*/

        /*int data[][] = new int[][] {
                {1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        //如果在进行输出的时候一定要使用双重循环，
        //外部的循环控制输出的行数，而内部的循环控制输出列数
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                System.out.print("data[" + i + "][" + j + "]=" + data[i][j] + "、");
            }
            System.out.println();
        }*/

        int[] arr= new int[5];
        Random r = new Random();

        for (int i = 0; i <arr.length ; i++) {
            arr[i] =r.nextInt(101);
        }
        for (int x:arr) {
            System.out.println(x);
        }
        int sum = 0;
        int b = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i]){

                max=arr[i];

            }

            if(min>arr[i]){

                min=arr[i];

            }
            sum+=arr[i];
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length; j++) {
                if (arr[i]<arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }

            }

        }

        System.out.println();

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println("和为："+sum);
        System.out.println("平均数为："+sum/arr.length);
        }
    }

