import java.util.*;

public class Counting_Inversions{
  static long simple_merge(int a[],int c[],int low,int mid,int high){
    int i=low,k=low; int j=mid+1;
    long inv_count =0L;
    while(i<=mid && j<=high){
      if(a[i] <= a[j])
          c[k++] =a[i++];
      else{
          c[k++] = a[j++];
          inv_count+=(mid+1-i);
        }
    }
    while(i<=mid)
      c[k++] = a[i++];
    while(j<=high)
      c[k++] = a[j++];
    for(int l=low;l<k;l++)
        a[l] = c[l];
    return inv_count;
  }
  static long merge_sort(int a[],int c[],int low,int high){
    long inv_count = 0L;
    if(low<high){
      int mid = (low+high)/2;
      inv_count=merge_sort(a,c,low,mid);
      inv_count+=merge_sort(a,c,mid+1,high);
      inv_count+=simple_merge(a,c,low,mid,high);
    }
    return inv_count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
    int c[] = new int [n];
    System.out.println(merge_sort(a,c,0,n-1));
  }
}
