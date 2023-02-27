import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=0,k=0;

        n = sc.nextInt();
        k = sc.nextInt();

        int[][] dp = new int[n+1][k+1];

        int w[] = new int[n+1];
        int v[] = new int[n+1];

        for(int i = 1 ; i <= n ; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for(int s = 1 ; s <= n ; s++){
            for(int i = 1 ; i <= k; i++){
                dp[s][i] = dp[s-1][i];
                if(i-w[s]>=0){
                    dp[s][i] = Math.max(dp[s-1][i], dp[s-1][i-w[s]]+v[s]);
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
