package LC1716;

public class CalculateMoney {

    public int totalMoney(int n) {

        if(n == 1){
            return 1;
        }
        if(n == 7){
            return 28;
        }

        int days = n;
        int savings = 0;
        int day = 1;
        for (int i=1 ; i <= days ; i++){
            savings = savings + day ;
            if(i%7==0){
                day = i/7;
            }
            day++;
        }
        return savings;
    }

}
