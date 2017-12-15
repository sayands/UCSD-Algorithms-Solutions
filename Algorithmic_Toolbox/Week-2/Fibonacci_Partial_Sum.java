import java.util.*;

public class Fibonacci_Partial_Sum{
  static int fibonacci(int n){
    int arr[] = new int[61];
    arr[0] = 0; arr[1] =1;
    for(int i=2;i<=60;i++)
      arr[i] = (arr[i-1] + arr[i-2])%10;
    return arr[n];
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long m = sc.nextLong();
    long n = sc.nextLong();
    //int a[] = new int[61];
    int remainder  = 0;
    int a = (int)((n+2)%60);
    int r1 = fibonacci(a) == 0 ? 9:(fibonacci(a)-1);
    int b = (int)((m+1)%60);
    int r2 = fibonacci(b) == 0 ? 9:(fibonacci(b)-1);
    if(r1<r2)
        remainder = 10+r1-r2;
    else
        remainder = r1 -r2;
    System.out.println(remainder);

  }
}
