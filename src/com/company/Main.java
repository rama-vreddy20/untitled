package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String str = new String("I am am");
        char[] ch = str.toCharArray();

        HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();

        for( char chi:ch ){
            if(charcount.containsKey(chi)){
                charcount.put(chi, charcount.get(chi)+1);
            } else {
                charcount.put(chi, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> setvalue = charcount.entrySet();
        for ( Map.Entry<Character, Integer> set1 : setvalue){
            if(set1.getValue() > 1){
                System.out.println( set1.getKey() + " : " + set1.getValue());
            }


        }


    }
}
