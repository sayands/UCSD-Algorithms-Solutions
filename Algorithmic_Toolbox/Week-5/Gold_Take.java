import java.util.*;

public class Gold_Take{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int n = sc.nextInt();
        int weights[] = new int[n+1];
        weights[0] = 0;
        for(int i=1;i<=n;i++)
            weights[i] = sc.nextInt();
        int value[][] = new int[n+1][W+1];
        for(int i=0;i<=n;i++)
            value[i][0] = 0;
        for(int i=0;i<=W;i++)
            value[0][i] = 0;
        for(int i=1;i<=n;i++){
            for(int w =1;w<=W;w++){
                value[i][w] = value[i-1][w];
                if(weights[i]<=w){
                    int val = value[i-1][w-weights[i]] + weights[i];
                    if(value[i][w] < val)
                        value[i][w] = val;
                }
            }
        }
        System.out.println(value[n][W]);        


        sc.close();
    }
}