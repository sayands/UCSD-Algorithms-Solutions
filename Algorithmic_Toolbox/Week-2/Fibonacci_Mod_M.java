import java.util.*;

public class Fibonacci_Mod_M{
    static long get_pisano_period(long m) {
    long  a = 0, b = 1, c = a + b;
    for (long i = 0; i < m*m; i++) {
        c = (a + b) % m;
        a = b;
        b = c;
        if (a == 0 && b == 1) return i + 1;
    }
    return 1;
  }
    static long get_fibonacci_huge(long  n,long m) {
    long  remainder = n % get_pisano_period(m);

    long  first = 0;
    long  second = 1;

    long  res = remainder;

    for (int i = 1; i < remainder; i++) {
        res = (first + second) % m;
        first = second;
        second = res;
    }

    return (long)(res % m);
}

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    System.out.println(get_fibonacci_huge(n, m));
 }
}
