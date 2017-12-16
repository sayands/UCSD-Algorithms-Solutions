import java.util.*;

public class Collecting_Signatures{
  int a,b;
  boolean visited;

  Collecting_Signatures(int a,int b){
    this.a = a;
    this.b = b;
    this.visited = false;
  }
  static void remove(Collecting_Signatures arr[],int n,int d){
    for(int i=0;i<n;i++){
      if(d>=arr[i].a && d<=arr[i].b){
        arr[i].visited = true;
      }
    }
  }
  static void sort(Collecting_Signatures arr[],int n)
    {
        for (int i=1; i<n; ++i)
        {
            Collecting_Signatures key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j].b > key.b)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    static void count_minimum(Collecting_Signatures arr[],int n){
      int count = 0, x = 0;
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        if(!arr[i].visited){
          a[x++] = arr[i].b;
          count++;
          remove(arr,n,arr[i].b);
        }
      }
      System.out.println(count); 
      for(int i=0;i<x;i++)
        System.out.print(a[i] + " ");
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Collecting_Signatures obj[] = new Collecting_Signatures[n];
    for(int i=0;i<n;i++)
    {
      int a = sc.nextInt();
      int b = sc.nextInt();
      obj[i] = new Collecting_Signatures(a,b);
    }
    sort(obj,n);
    count_minimum(obj,n);
  }
}
