public class BuySellStock {
    public static void buySell(int arr[]) {
        int bp=Integer.MAX_VALUE;
        int max_Profit=0;
        for(int i=0;i<arr.length;i++){
            if(bp<arr[i]){    // profit
                int profit=arr[i]-bp;     // today's profit
                // if(max_Profit<profit){
                //     max_Profit=profit;
                // }
                max_Profit=Math.max(max_Profit, profit);
            }
            else{
                bp=arr[i];
            }
        }
        System.out.println("Maximum Profit : "+max_Profit);
    }
    public static void main(String[] args) {
        int prizes[]={7,1,5,3,6,4};
        buySell(prizes);
    }
}
