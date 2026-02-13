package Ramda;

import java.util.Random;

interface Calcu{
    int sum (int a, int b);
}

public class Main {
    static void main(String[] args) {
        Calcu cal01 = new Calcu() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        System.out.println(cal01.sum(5,20));
        System.out.println("-----------------------");

        //람다식
        Calcu lambda = (a,b) -> a+b;
        System.out.println(lambda.sum(10,20));
        System.out.println("-----------------------");

        Calcu lamda =(a,b) ->(a>=b) ? a :b ;
        System.out.println(lamda.sum(5,9));
        System.out.println("-----------------------");

        Random random = new Random();
        Calcu lamMax = (a,b) -> Math.max(a,b);
        System.out.println(lamMax.sum(10,20));
    }

    /*
    interface Calculator{
     int sum(int a ,int b);
     }
     Carculator car1 = new Carculator();
     public sum(int a, int b){
     return a+b;

     or Carculator car =(a,b) -> a+b ;
     sout  ( car.sum(10,20));
     */
}
