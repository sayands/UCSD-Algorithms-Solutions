import java.util.*;

public class Sum_Fibonacci{
  static int fibonacci(int n){
    int arr[] = new int[61];
    arr[0] = 0; arr[1] =1;
    for(int i=2;i<=60;i++)
      arr[i] = (arr[i-1] + arr[i-2])%10;
    return arr[n];
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    //int a[] = new int[61];
    int m = (int)((n)%60);
    int remainder = fibonacci(m);
    if(remainder == 0)
        System.out.println(9);
    else
        System.out.println(remainder-1);
  }
}
