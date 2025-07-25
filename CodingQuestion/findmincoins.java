import java.lang.reflect.Array;
import java.util.Arrays;
public class findmincoins {
    public static int MinCoins(int[]coins,int amount){

        int max=amount+1;
        int[]dp=new int[amount+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for (int i = 1; i <= amount; i++) {
            for (int coin:coins) {
                if(coin<=i){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
    public static void main(String[] args) {

        int[]coins={1,2,5};
        int amount=11;
        int res=MinCoins(coins,amount);
        if(res==-1){
            System.out.println("Amount cannot be formed with given coins!!");
        }
        else {
            System.out.println("Minimum coins required : "+res);
        }

    }


}
