package com.company;

public class main1 {

    public static void main(String args[]){
        String  str = new String("a1b2c4K2");
        char[]  cha = str.toCharArray();
        int i = 0;
        char ch = ' ';
        String str3 = "";
        String str1 = "";
        String str2 = "";
        for(char ch1: cha){
            str1 = "";
            if((ch1<='z'&&ch1>='a')|| (ch1<='Z'&&ch1>='A')){
                ch = ch1;
            } else{
                str3 = String.valueOf(ch1);
                i = Integer.parseInt(str3);
                for(int j = 0; j< i ; j++){
                    str1 = str1 + ch;
                }
                str1 = str1 + "-";
            }

            str2 = str2 + str1;
        }
        System.out.println(str2);
    }
}
