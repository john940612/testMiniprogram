package com.test.miniprogram;

/**
 * Hello world!
 *
 */
public class stage1
{
    public static void main( String[] args )
    {
        int i = 0;          //The number that
        for (i=1; i<=100; i++) {
            if( i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if( i%3 == 0 ){
                System.out.println("Fizz");
            }else if ( i%5 == 0 ){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
