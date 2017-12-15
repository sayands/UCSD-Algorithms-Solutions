import java.util.*;

public class Large_Fibonacci_Number{
  static int fibonacci(int n){
    int arr[] = new int[n+1];
    arr[0] = 0; arr[1] =1;
    for(int i=2;i<=n;i++)
        arr[i] = (arr[i-1] + arr[i-2])%10;
    return (arr[n]);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = fibonacci(n);
    System.out.println(result);
  }
}
