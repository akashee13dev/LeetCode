package problems;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
      //  printPatternOne(5);
      //  printPatternTwo(5);
      //    printPatternThree(6);
        printPatternFour(4);
    }

    /**
     * @input - 5
     * @return
               12345
               23451
               34512
               45123
               51234
     */
    public static void printPatternOne(int input){
        for (int i=0;i<input;i++){
            int num = i+1;
            for (int j=0 ; j<input ; j++){
                if(num > input){
                    num = 1 ;
                }
                System.out.print(num);
                System.out.print(" ");
                num++;
            }
            System.out.println(" ");
        }
    }

    /**
     * @input - 5
     * @return
            1
           21
          321
         4321
        54321
     */
    public static void printPatternTwo(int input){
        for (int i=0;i<input;i++){
            int num = i+1;
            for (int j=0 ; j<input ; j++){
                if(j < input-num){
                    System.out.print(" ");
                }
                else {
                    System.out.print(num);
                    num--;
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    /**
     * Not yet completed
     * @input - 6
     * @return
                     1
                  2  4
               3  5  7
             6 8  10 12
          9 11 13 15 17
      14 16 18 20 22 24
     */
    public static void printPatternThree(int input){
        int [][] arr = new int[input][input];
        int num = 1 ;
        for (int i=0;i<input;i++){
            for (int j=0 ; j<input ; j++){
                int index = input-i-1;
                if(j >= index){
                    //Update Current Position
                    if(arr[i][j] == 0){
                        arr[i][j] = num;
                        num++;
                    }
                    //Update One step backward zig zag position
                    if(i != input -1 && j !=0 && arr[index-1][j-1] == 0){
                        arr[i+1][j-1] =  num ;
                        num++;
                    }
                    //Update One step right position
                    if(j != input - 1 &&  arr[i][j+1] == 0){
                        arr[i][j+1] =  num;
                        num++;
                    }

                }
            }
        }

        for (int[] row : arr){
            for (int col : row){
                System.out.print(col > 0 ? col : " ");
            }
            System.out.println(" ");
        }
    }


    /**
     * Not yet completed
     * @input - 4
     * @return
        4 4 4 4 4 4 4
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4
        4 3 2 1 2 3 4
        4 3 2 2 2 3 4
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4
     */
    public static void printPatternFour(int input){
        int len = input + input - 1;
        int[][] arr = new int[input][len];

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < len; j++) {
                int value = input - Math.min(i, Math.min(j, len - j - 1));
                arr[i][j] = value;
            }
        }

        //First Half Rows
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //Remaing From Reverse
        for (int i = input-2; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

class EasyPatters {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Get Ready for the Patters (Easy) ..... ");
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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        for (int i = 0 ; i<a ; i++){
            for (int j=0 ; j<=a ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        for (int i = 0 ; i<a ; i++){
            for (int j=0 ; j<=a ; j++){
                if(i == 0 || j==0 || i == a-1 || j == a){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        for (int i = 0 ; i<a ; i++){
            for (int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        for (int i = 1 ; i<=a ; i++){
            for (int j=1 ; j<i+1 ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }

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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        for (int i = 0 ; i<a ; i++){
            for (int j=0 ; j<a-i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        for (int i = 1 ; i<a+1 ; i++){
            for (int j=1 ; j<=a-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        int ind = a - 1 ;
        for (int i = 0 ; i<a ; i++){
            for (int j=0 ; j<a ; j++){
                if(j >= ind){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            ind -- ;
            System.out.println("");
        }

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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        int num = 1;
        for (int i = 0 ; i<a ; i++){
            for (int j=0 ; j<i+1 ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }

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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        int num = 1;
        for (int i = 0 ; i<a ; i++){
            int startNum = num;
            for (int j=0 ; j<i+1 ; j++){
                System.out.print(num+ " ");
                num = num == 0 ? 1 : 0 ;
            }
            num = startNum == 0 ? 1 : 0 ;
            System.out.println("");
        }

        System.out.println(" **************************** Pattern Six for Binary Completed ****************************");
    }

}


class AdvancePatterns{
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

        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }
        //Upper
        int ind = a - 1 ;
        for (int i = 0 ; i<a ; i++){
           //Left
            for (int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
            //Right
            for (int j=0 ; j<a ; j++){
                if(j >= ind){
                    System.out.print("*");
                }
                else {
                    System.out.print("  ");
                }
            }
            ind--;
            System.out.println(" ");
        }

        //Lower (Reverse the Upper)
        ind = a;
        for (int i = a ; i>0 ; i--){
            //Left
            for (int j=i ; j>0 ; j--){
                System.out.print("*");
            }
            //Right
            for (int j=a ; j>0 ; j--){
                if(j <= ind){
                    System.out.print("*");
                }
                else {
                    System.out.print("  ");
                }
            }
            ind--;
            System.out.println(" ");
        }


        //Lower
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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        int row = a + 1 ;
        int col = ( a * 2 ) + 1 ;

        int nonSpaceStart = row;
        int nonSpaceEnd = col ;
        for (int i = 0 ; i < row ; i++){
            for (int j = 1 ; j <= col ; j++){
                if(j >= nonSpaceStart && j <= nonSpaceEnd){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            nonSpaceStart--;
            nonSpaceEnd--;
            System.out.println(" ");
        }


        //Lower
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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        int row = a ;
        int col = ( a * 2 ) - 1 ;

        int nonSpaceStart = col/2;
        int nonSpaceEnd = col/2;
        for (int i = 0 ; i < row ; i++){
            int iteration = 0;
            boolean isNum = true;
            for (int j = 0 ; j <= col ; j++){
//                if(iteration == i+1){
//                    break;
//                }
                if(j >= nonSpaceStart && j<= nonSpaceEnd){
                    System.out.print( isNum ? i+1 + " " : "  ");
//                    if(isNum){
//                        iteration++;
//                    }
                    isNum = !isNum;
                }
                else {
                    System.out.print("  ");
                }
            }
            nonSpaceStart--;
            nonSpaceEnd++;
            System.out.println(" |");
        }


        //Lower
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
        System.out.println("Enter a Positive Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        int row = a ;
        int col = ( a * 2 ) - 1 ;

        int nonSpaceStart = col/2;
        int middle = nonSpaceStart;
        int nonSpaceEnd = col/2;
        for (int i = 0 ; i < row ; i++){
            int num = i+1;
            for (int j = 0 ; j <= col ; j++){
                if(j >= nonSpaceStart && j<= nonSpaceEnd){
                    System.out.print(num+" ");
                    if(j >= middle){
                        num++;
                    }
                    else {
                        num--;
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            nonSpaceStart--;
            nonSpaceEnd++;
            System.out.println(" |");
        }


        //Lower
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Number");
        int a = sc.nextInt();
        while (a <= 0 ){
            System.out.println("Enter a Valid Positive Number (Number should greater than 0)");
            a = sc.nextInt();
        }

        int row = a ;
        int col = ( a * 2 ) ;
        int nonSpaceStart = (col/2)-1;
        int nonSpaceEnd = (col/2)-1;
        //Up Part
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col-1 ; j++){
                if(j >= nonSpaceStart && j<= nonSpaceEnd){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            nonSpaceStart--;
            nonSpaceEnd++;
            System.out.println(" ");
        }
        //Bottom Part (Reverse Up)
        nonSpaceStart = 1;
        nonSpaceEnd = col-1;
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                if(j >= nonSpaceStart && j<= nonSpaceEnd){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            nonSpaceStart++;
            nonSpaceEnd--;
            System.out.println(" ");
        }

        //Lower
        System.out.println(" **************************** Pattern Three Completed ****************************");
    }
}
