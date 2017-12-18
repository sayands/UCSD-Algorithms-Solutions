import java.util.*;

public class Improved_Quick_Sort{
  static void partition(int a[],int left,int right,int i,int j){
    i = left-1; j=right;
    int p = left-1; int q=right;
    int key = a[right]; int temp;
    while(true){
      while(a[++i]<key);

      while(key < a[--j])
          if(j == left)
              break;
      if(i>=j) break;

      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      if(a[i] == key){
         p++;
          temp = a[i];
         a[i] = a[p];
         a[p] = temp;
      }
      if(a[j] == key){
        q--;
         temp = a[j];
        a[j] = a[q];
        a[q] = temp;
      }
    }
    temp = a[i];
    a[i] = a[right];
    a[right] = temp;
    j=i-1;
    for(int k =left;k<p;k++,j--)
      {
         temp = a[k];
        a[k] = a[j];
        a[j] = temp;
      }
    i = i+1;
    for(int k = right-1;k>q;k--,i++)
      {
         temp = a[i];
        a[i] = a[k];
        a[k] = temp;
      }
  }
  static void quicksort(int a[],int l,int r){
    if(r<=l) return;
    int i =0,j =0;

    partition(a,l,r,i,j);
    quicksort(a,l,j);
    quicksort(a,i,r);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
    quicksort(arr,0,n-1);
    for(int i=0;i<n;i++)
      System.out.print(arr[i] + " ");
  }
}
