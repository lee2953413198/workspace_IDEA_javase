package com.neuedu.demo;

import java.io.*;
import java.util.Scanner;

public class CopyTest {
    public static void main(String[] args) {
        System.out.println("请输入你要拷贝的文件");
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        System.out.println("请输入你要拷贝的路径");
        String txt2 = scanner.nextLine();

        String str = " ";
        try {
            InputStream input = new FileInputStream(txt);
            OutputStream out  =  new FileOutputStream(txt2,true);
            byte[] buff = new byte[8];
            int hasRead = input.read(buff);
            while ((hasRead)!=-1){
                str += new String(buff,0,hasRead);
                byte[] buff1 = str.getBytes();
                out.write(buff1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
