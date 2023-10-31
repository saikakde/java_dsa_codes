package Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int stocks[] = { 6, 1, 4, 2, 5, 3 };
        // int stocks[] = {7,2,1,5,3,6,4};

        System.out.println(stockMarket(stocks));
    }

    public static int stockMarket(int stocks[]) {
        // own logic

        // int n = stocks.length;
        // int profit = 0;
        // int sellPrice = 0;
        // int MaxProfit = 0;
        // int buyPrice;
        // for (int i = 0; i < n; i++) {
        //     buyPrice = stocks[i];
        //     System.out.println("---------------------------------------");
        //     System.out.println("BuyPrice "+buyPrice+" ");
        //     for (int j = i+1; j < n; j++) {
        //         sellPrice=stocks[j];
        //         System.out.print("SellPrice "+sellPrice+" ");
        //         profit = sellPrice - buyPrice;
        //         System.out.println("profit "+profit);
        //         if (profit > MaxProfit) {
        //             MaxProfit = profit;
        //         }
        //         System.out.println("MAx "+MaxProfit);
        //     }
        // }
        // return MaxProfit;

        // Shradha's logic
        int n = stocks.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<n;i++){
            if(buyPrice < stocks[i]){
                int profit = stocks[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = stocks[i];
            }
        }
        return maxProfit;
        
    }
}
