package easy.LC1837;

public class SumOfDigitsInBaseK {

    public int sumBase(int n, int k) {


        if (n == 0) { // anything Log 0 is 0
            return 0;
        }
        int number = 0;
        if (n == k) {
            number = k;
        }
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int remainder = n % k;
            result.insert(0, remainder);
            n = n / k;
        }
        number = Integer.parseInt(result.toString());
        char[] numChar = (number+"").toCharArray();
        int sum = 0;
        for (char num : numChar){
            sum = sum + Integer.parseInt(num+"");
        }
        return sum;
    }

}
