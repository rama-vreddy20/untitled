package com.company;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class lotto {

    public static void main(String args[]){
        int range = 3;
        int end = 70;

        HashSet<Integer> results = new HashSet<Integer>(findLotto(range,end));
        Iterator result = results.iterator();
        while(result.hasNext()){
            System.out.println(result.next());
        }
    }

    public static HashSet<Integer> findLotto(int range, int end){
        Random ran = new Random();
        int ranNext = ran.nextInt(end);
        HashSet<Integer> uni = new HashSet<Integer>();
        while(uni.size() < range){
            uni.add(ranNext);
            ranNext = ran.nextInt(end);
        }
        return uni;
    }
}
