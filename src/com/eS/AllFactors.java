package com.eS;

public class AllFactors {

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }

        for (int divider = 1; divider <= number; divider++){
            if(number % divider == 0){
                System.out.println(divider);
            }
            else {
//                System.out.println("Not divide " + divider);
            }
        }
    }

    public static void main(String[] args) {
        // write your code here

        printFactors(6);
        printFactors(-6);
        printFactors(-1);
        printFactors(16);
        printFactors(10);
        printFactors(143);
    }
}
