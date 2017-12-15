import java.util.*;

public class LCM{
  static long gcd_calculator(long a,long b){
    if(b==0)
        return a;
    return gcd_calculator(b,a%b);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long prod = (long)a*b;
    if(a>b)
      System.out.println((long)((a*b)/gcd_calculator(a,b)));
    else
    System.out.println((long)((a*b)/gcd_calculator(b,a)));
  }
}
