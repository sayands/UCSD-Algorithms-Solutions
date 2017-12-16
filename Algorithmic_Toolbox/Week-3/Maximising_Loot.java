import java.util.Scanner;
import java.text.DecimalFormat;

public class Maximising_Loot{
  int value,weight;

  Maximising_Loot(int v,int w){
    value = v;
    weight = w;
  }
  static void sort(Maximising_Loot arr[],int n)
    {
        for (int i=1; i<n; ++i)
        {
            Maximising_Loot key = arr[i];
            int j = i-1;
            while (j>=0 && (double)(arr[j].value * 1.0/arr[j].weight) < (double)(key.value *1.0)/(key.weight))
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
  static void loot(Maximising_Loot arr[],int n,double W){
    int i=0;
    double v = 0.0,a = 0.0;
    while(i<n){
        if(W==0)
          break;
        a = Math.min(W,arr[i].weight);
        v = v + (double)(a*(arr[i].value * 1.0/arr[i].weight));
        W = W - a;
        i++;
    }
    DecimalFormat df = new DecimalFormat(".####");
    System.out.println(df.format(v));

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double W = sc.nextInt();
    Maximising_Loot obj[] = new Maximising_Loot[n];
    for(int i=0;i<n;i++)
    {
      int value = sc.nextInt();
      int weight = sc.nextInt();
      obj[i] = new Maximising_Loot(value,weight);
    }

    sort(obj,n);
    loot(obj,n,W);
  }
}
