import java.util.*;

public class GCD{
  static int gcd_calculator(int a,int b){
    if(b==0)
        return a;
    return gcd_calculator(b,a%b);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b)
      System.out.println(gcd_calculator(a,b));
    else
    System.out.println(gcd_calculator(b,a));
  }
}
