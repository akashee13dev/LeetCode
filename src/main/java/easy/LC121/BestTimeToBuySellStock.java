package easy.LC121;

public class BestTimeToBuySellStock {

    public int maxProfit(int[] prices) {


        int max = 0;
        int len = prices.length;
        if(len == 0){
            return max;
        }
        int buy = prices[0];
        for(int day = 1 ; day < len ; day++){
            buy = Math.min(buy , prices[day]);
            max = Math.max(max, prices[day] - buy );
        }
        return max;


//        int buyingPrice = prices[0];
//        int profit = 0;
//
//        for (int day =1 ; day < prices.length ; day++ ){
//            int dayProfit = prices[day] - buyingPrice;
//            profit = Math.max(profit , dayProfit);
//            buyingPrice = Math.min(prices[day] , buyingPrice);
//        }
//
//        return profit;
//
//        int buyPrice = prices[0];
//        int buyInd = 0;
//        int sellPrice = prices[0];
//        int sellInd = 0;
//
//        int index = 0;
//        for (int price : prices){
//            if(price >= sellPrice){
//                sellPrice = price;
//                sellInd = index;
//            }
//            if(price < buyPrice){
//                buyPrice = price;
//                buyInd = index;
//                if(buyInd > sellInd){
//                    sellPrice = buyPrice;
//                    sellInd = buyInd;
//                }
//            }
//            index++;
//        }
//
//        if(buyInd < sellInd){
//            return sellPrice - buyPrice;
//        }
//        return 0;
    }

}
