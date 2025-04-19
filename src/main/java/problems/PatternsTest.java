package problems;

import java.util.Scanner;

/**
 *  EasyPatterns for easy patterns
 *  AdvancedPatterns for moderate level patterns
 */


class EasyPatterns {

    private static int getInput() {

        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }
        return a;

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Get Ready for the Patterns (Easy) ..... ");
        for (int i = 3 ; i > 0 ; i --){
            System.out.println(i + "....");
            Thread.sleep(1000);
        }
        patternOne();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternTwo();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternThree();


        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternFour();


        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternFive();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternThreeNum();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternFourNum();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternSix();

        System.out.println("Wait for Last One ..... ");
        Thread.sleep(1000);
        patternSixOneAndZero();

        Thread.sleep(1000);
        System.out.println("Wow You Doneee ..... ");
    }

    /**
     * @input : 4
     * @output
     *
     *      * * * * *
     *      * * * * *
     *      * * * * *
     *      * * * * *
     *
     *
     */
    public static void patternOne(){

        System.out.println(" **************************** Pattern One Started ****************************");
        System.out.println("" +
                "            * * * * *\n" +
                "            * * * * *\n" +
                "            * * * * *\n" +
                "            * * * * *");

        int num = getInput();
        /**
         * Your Logic to print the pattern
         */
        System.out.println(" **************************** Pattern One Completed ****************************");
    }

    /**
     * @input : 4
     * @output
     *
     *      * * * * *
     *      *       *
     *      *       *
     *      * * * * *
     *
     *
     */
    public static void patternTwo(){

        System.out.println(" **************************** Pattern Two Started ****************************");
        System.out.println("" +
                "            * * * * *\n" +
                "            *       *\n" +
                "            *       *\n" +
                "            * * * * *");
         int num = getInput();

        /**
         * Your Logic to print the pattern
         */

        System.out.println(" **************************** Pattern Two Completed ****************************");
    }
    /**
     * @input 4
     * @output
     *
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     */
    public static void patternThree(){

        System.out.println(" **************************** Pattern Three Started ****************************");
        System.out.println("" +
                "            *\n" +
                "            * *\n" +
                "            * * *\n" +
                "            * * * *");
         int num = getInput();


        /**
         * Your Logic to print the pattern
         */


        System.out.println(" **************************** Pattern Three Completed ****************************");
    }

    /**
     *
     * @input : 4
     * @output
     *
     *      1
     *      1 2
     *      1 2 3
     *      1 2 3 4
     *
     */
    public static void patternThreeNum(){

        System.out.println(" **************************** Pattern Three for Number Started ****************************");
        System.out.println("" +
                "            1\n" +
                "            1 2\n" +
                "            1 2 3\n" +
                "            1 2 3 4");
         int num = getInput();


        /**
         * Your Logic to print the pattern
         */


        System.out.println(" **************************** Pattern Three for Number Completed ****************************");
    }

    /**
     * @input : 4
     * @output
     *
     *      * * * *
     *      * * *
     *      * *
     *      *
     *
     */
    public static void patternFour(){

        System.out.println(" **************************** Pattern Four Started ****************************");
        System.out.println("" +
                "            * * * *\n" +
                "            * * *\n" +
                "            * *\n" +
                "            *");
         int num = getInput();


        /**
         * Your Logic to print the pattern
         */


        System.out.println(" **************************** Pattern Four Completed ****************************");
    }

    /**
     * @input : 4
     * @output
     *
     *      1 2 3 4
     *      1 2 3
     *      1 2
     *      1
     *
     */
    public static void patternFourNum(){

        System.out.println(" **************************** Pattern Four for Number Started ****************************");
        System.out.println("" +
                "            1 2 3 4\n" +
                "            1 2 3\n" +
                "            1 2\n" +
                "            1");
         int num = getInput();


        /**
         * Your Logic to print the pattern
         */


        System.out.println(" **************************** Pattern Four for Number Completed ****************************");
    }

    /**
     * @input : 4
     * @output
     *
     *            *
     *          * *
     *        * * *
     *      * * * *
     *
     */
    public static void patternFive(){
        System.out.println(" **************************** Pattern Five Started ****************************");
        System.out.println("" +
                "                 *\n" +
                "               * *\n" +
                "             * * *\n" +
                "           * * * *");
         int num = getInput();


        /**
         * Your Logic to print the pattern
         */


        System.out.println(" **************************** Pattern Five Completed ****************************");
    }


    /**
     * @input 4
     * @output
     *
     *      1
     *      2 3
     *      4 5 6
     *      7 8 9 10
     *
     */
    public static void patternSix(){

        System.out.println(" **************************** Pattern Six Started ****************************");
        System.out.println("" +
                "            1\n" +
                "            2 3\n" +
                "            4 5 6\n" +
                "            7 8 9 10");
         int num = getInput();


        /**
         * Your Logic to print the pattern
         */


        System.out.println(" **************************** Pattern Six Completed ****************************");
    }

    /**
     * @input 4
     * @output
     *
     *      1
     *      0 1
     *      1 0 1
     *      0 1 0 1
     *
     */
    public static void patternSixOneAndZero(){

        System.out.println(" **************************** Pattern Six for Binary Started ****************************");
        System.out.println("" +
                "            1\n" +
                "            0 1\n" +
                "            1 0 1\n" +
                "            0 1 0 1");
         int num = getInput();


        /**
         * Your Logic to print the pattern
         */


        System.out.println(" **************************** Pattern Six for Binary Completed ****************************");
    }

}

class AdvancedPatterns {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Get Ready for the Patters (Advance) ..... ");
        for (int i = 3 ; i > 0 ; i --){
            System.out.println(i + "....");
            Thread.sleep(1000);
        }
        patternOne();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternTwo();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternThree();

        System.out.println("Wait for Next One ..... ");
        Thread.sleep(1000);
        patternFour();

        System.out.println("Final One ..... ");
        Thread.sleep(1000);
        patternFive();
    }

    private static int getInput() {

        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }
        return a;

    }

    /**
     *
     * @input : 4
     * @output
     *
     *      *             *
     *      * *         * *
     *      * * *     * * *
     *      * * * * * * * *
     *      * * * * * * * *
     *      * * *     * * *
     *      * *         * *
     *      *             *
     *
     *
     */
    public static void patternOne(){

        System.out.println(" **************************** Pattern One Started ****************************");

        System.out.println("Input 4 : " +
                "            *             *\n" +
                "            * *         * *\n" +
                "            * * *     * * *\n" +
                "            * * * * * * * *\n" +
                "            * * * * * * * *\n" +
                "            * * *     * * *\n" +
                "            * *         * *\n" +
                "            *             *");
        System.out.println(" **************************** Hint : There are 6 triangle (4 + 2)  ****************************");

        int num = getInput();
        /**
         * Your Logic to print the pattern
         */
        System.out.println(" **************************** Pattern One Completed ****************************");
    }


    /**
     *
     * @input : 5
     * @output
     *              * * * * *
     *            * * * * *
     *          * * * * *
     *        * * * * *
     *      * * * * *
     */
    public static void patternTwo(){
        System.out.println(" **************************** Pattern Two Started ****************************");

        System.out.println("" +
                "Input 4 :\n" +
                "                    * * * * *\n" +
                "                  * * * * *\n" +
                "                * * * * *\n" +
                "              * * * * *\n" +
                "            * * * * *");
        int num = getInput();
        /**
         * Your Logic to print the pattern
         */
        System.out.println(" **************************** Pattern Two Completed ****************************");
    }

    /**
     * @input : 5
     * @output
     *
     *         1
     *        2 2
     *       3 3 3
     *      4 4 4 4
     *     5 5 5 5 5
     */
    public static void patternThree(){
        System.out.println(" **************************** Pattern Three Started ****************************");

        System.out.println("" +
                "Input 5 :\n" +
                "                1\n" +
                "               2 2\n" +
                "              3 3 3\n" +
                "             4 4 4 4\n" +
                "            5 5 5 5 5");
        int num = getInput();
        /**
         * Your Logic to print the pattern
         */
        System.out.println(" **************************** Pattern Three Completed ****************************");
    }

    /**
     * @input : 5
     * @output
     *
     *          1
     *        2 1 2
     *      3 2 1 2 3
     *    4 3 2 1 2 3 4
     *  5 4 3 2 1 2 3 4 5
     *
     */
    public static void patternFour(){
        System.out.println(" **************************** Pattern Four Started ****************************");

        System.out.println("" +
                "Input 5 :\n" +
                "               1  \n" +
                "             2 1 2\n" +
                "           3 2 1 2 3\n" +
                "         4 3 2 1 2 3 4\n" +
                "       5 4 3 2 1 2 3 4 5");
        int num = getInput();

        /**
         * Your Logic to print the pattern
         */
        System.out.println(" **************************** Pattern Three Completed ****************************");
    }


    /**
     * @input : 4
     * @output
     *
     *          *
     *        * * *
     *      * * * * *
     *    * * * * * * *
     *      * * * * * * *
     *        * * * * *
     *          * * *
     *            *
     */
    public static void patternFive(){
        System.out.println(" **************************** Pattern Four Started ****************************");

        System.out.println("" +
                "Input 4 :\n" +
                "                *        \n" +
                "              * * *      \n" +
                "            * * * * *    \n" +
                "          * * * * * * *  \n" +
                "            * * * * * * *\n" +
                "              * * * * *  \n" +
                "                * * *    \n" +
                "                  *      ");
        int num = getInput();
        /**
         * Your Logic to print the pattern
         */
        System.out.println(" **************************** Pattern Three Completed ****************************");
    }
}