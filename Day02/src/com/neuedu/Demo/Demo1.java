package com.neuedu.Demo;

import java.math.BigDecimal;

public class Demo1 {
    public static void main(String[] args) {
        String x = "admin";
        String y = "aaa";
        String z = x + y;
        StringBuilder a = new StringBuilder();
        a.append("ada").append("fa").append("asdas");
        System.out.println(z);
        System.out.println(a);


        for (int i = 0; i <10000 ; i++) {
            x +="a";

        }

    }
}
