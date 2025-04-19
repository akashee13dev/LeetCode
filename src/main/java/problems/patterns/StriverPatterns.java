package problems.patterns;

import java.util.Scanner;

public class StriverPatterns {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Get Ready for the Patterns  ..... ");
        for (int i = 3 ; i > 0 ; i --){
            System.out.println(i + "....");
            Thread.sleep(1000);
        }
       // patternOne();

//        System.out.println("Wait for Next One ..... ");
//        Thread.sleep(1000);
//        patternTwo();

//        System.out.println("Wait for Next One ..... ");
//        Thread.sleep(1000);
//        patternThree();

//        System.out.println("Wait for Next One ..... ");
//        Thread.sleep(1000);
//        patternFour();

//        System.out.println("Wait for Next One ..... ");
//        Thread.sleep(1000);
//        patternFive();

//          System.out.println("Wait for Next One ..... ");
//          Thread.sleep(1000);
//          patternSix();

//        System.out.println("Wait for Next One ..... ");
//        Thread.sleep(1000);
//        patternSeven();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternEight();


    }

    private static void patternEight() {
        System.out.println(" **************************** Pattern Two Started ****************************");

        int a = getInputNum();
        //Top
        for (int i = 0 ; i<a-1 ; i++){
            for (int j = 0 ; j<i+1 ; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

//        //Bottom
        for (int i = a ; i>0 ; i--){
            for (int j = 0 ; j<i ; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        System.out.println(" **************************** Pattern Two Completed ****************************");
    }

    private static void patternSeven() {
        System.out.println(" **************************** Pattern Two Started ****************************");

        int a = getInputNum();
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<a-i-1 ; j++){
                System.out.print(" ");
            }
            for (int j = 0 ; j<2*i+1 ; j++){
                System.out.print("*");
            }
            for (int j = 0 ; j<a-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println(" **************************** Pattern Two Completed ****************************");

    }

    private static void patternSix() {

        System.out.println(" **************************** Pattern Two Started ****************************");

        int a = getInputNum();
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<a-i ; j++){
                System.out.print(j+1);
            }
            System.out.println(" ");
        }

        System.out.println(" **************************** Pattern Two Completed ****************************");


    }

    private static void patternFive() {
        System.out.println(" **************************** Pattern Two Started ****************************");

        int a = getInputNum();
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<a-i ; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        System.out.println(" **************************** Pattern Two Completed ****************************");

    }

    private static void patternFour() {

        System.out.println(" **************************** Pattern Two Started ****************************");

        int a = getInputNum();
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<i+1 ; j++){
                System.out.print(j+1);
            }
            System.out.println(" ");
        }

        System.out.println(" **************************** Pattern Two Completed ****************************");

    }

    private static void patternThree() {
        System.out.println(" **************************** Pattern Two Started ****************************");

        int a = getInputNum();
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<i+1 ; j++){
                System.out.print(i+1);
            }
            System.out.println(" ");
        }

        System.out.println(" **************************** Pattern Two Completed ****************************");
    }

    private static void patternTwo() {
        System.out.println(" **************************** Pattern Two Started ****************************");

        int a = getInputNum();
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<i+1 ; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        System.out.println(" **************************** Pattern Two Completed ****************************");

    }

    private static int getInputNum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Number ");
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        return a;

    }

    public static void patternOne(){

        System.out.println(" **************************** Pattern One Started ****************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Number ");
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<a ; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        System.out.println(" **************************** Pattern One Completed ****************************");

    }

}
