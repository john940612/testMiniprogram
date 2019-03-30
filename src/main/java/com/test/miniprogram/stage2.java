package com.test.miniprogram;

public class stage2 {
    public static void main( String[] args )
    {
        int i = 0;          //The number that
        for (i=1; i<=100; i++) {
            if( (i%3 == 0 && i%5 == 0) || (Integer.toString(i).matches("(.*)3(.*)") && Integer.toString(i).matches("(.*)5(.*)"))){
                System.out.println(i + ": FizzBuzz");
            }else if(((i % 3) == 0) || Integer.toString(i).matches("(.*)3(.*)")){
                System.out.println(i + ": Fizz");
            }else if ( i%5 == 0 || Integer.toString(i).matches("(.*)5(.*)")){
                System.out.println(i + ": Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
