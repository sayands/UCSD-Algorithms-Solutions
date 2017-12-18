import java.util.*;

public class Binary_Search{
  static int search(int a[],int key){
    int low = 0,high = a.length -1;
    while(low<=high){
      int mid = (low+high)/2;
      if(a[mid] == key)
        return mid;
      else if(key>a[mid])
        low = mid+1;
      else
        high = mid-1;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int an[] = new int[n];
    for(int i=0;i<n;i++)
      an[i] = sc.nextInt();
    int k = sc.nextInt();
    int ak[] = new int[k];
    for(int i=0;i<k;i++)
        ak[i] = sc.nextInt();
    for(int i=0;i<k;i++)
        System.out.print(search(an,ak[i]) + " ");

  }
}
