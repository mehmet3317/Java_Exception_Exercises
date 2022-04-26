package com.company;

import java.util.*;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num=0;
        //Set<Integer> numbers = new HashSet<>();
        HashSet<Integer> lotNumbers = new HashSet<Integer>();
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();


        while(lotNumbers.size()<6){
            int lotNum = (int)(Math.random()*45+1);
            lotNumbers.add(lotNum);
        }
        System.out.println("please enter a number between 1-45");

        while (numbers.size()<6){
            int number = scanner.nextInt();
            if(number<1 || number >45){
                System.out.println("please enter a number between 1-45");
            }
            else {
                numbers.add(number);
                num++;
            }
        }
        numbers.forEach(System.out::println);

        lotNumbers.forEach(System.out::println);

        lotNumbers.retainAll(numbers);

        lotNumbers.forEach(System.out::println);



    }
}