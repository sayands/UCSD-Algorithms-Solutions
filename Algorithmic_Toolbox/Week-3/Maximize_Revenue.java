import java.util.Scanner;

public class Maximize_Revenue{
  static void simple_merge(long a[],int low,int mid,int high){
    int i,j,k;
    long c[] = new long[a.length];
    i=k=low; j=mid+1;
    while(i<=mid && j<=high)
    {
        if(a[i]<a[j]) c[k++]=a[i++];
        else c[k++]=a[j++];
    }
    while(i<=mid) c[k++]=a[i++];
    while(j<=high) c[k++]=a[j++];
    for(i=low;i<k;i++)
        a[i]=c[i];
  }
  static void merge_sort(long a[],int low,int high){
    if(low<high){
    int mid =(low+high)/2;
    merge_sort(a,low,mid);
    merge_sort(a,mid+1,high);
    simple_merge(a,low,mid,high);
    }
  }
  static long calculate_profit(long a[],long b[], int n){
    long sum = 0L;
    for(int i=n-1;i>=0;i--){
      sum+= a[i]*b[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a[] = new long[n];
    long b[] = new long[n];
    for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
    for(int i=0;i<n;i++)
        b[i] = sc.nextInt();
    merge_sort(a,0,n-1);
    merge_sort(b,0,n-1);

    System.out.println(calculate_profit(a,b,n));
  }
}
