package Utility;

public class PrimeNumber {
   /* prime number task
    prime number is a number that can be divisible by 1 and the number itself
    write a method that can check if a number is prime or not

    */

    public static void main(String[] args) {

        primeNumber(12);


    }

    public static void primeNumber (int num){

        for (int i = 0; i < num; i++) {

        }
            if(num % 2 ==0 || num < 2){ //all numbers less equal 1 is not considered as prime numbers
                System.out.println(num + " is not a prime number");
            }else{
                System.out.println(num + " is a prime number");
            }


    }
}
