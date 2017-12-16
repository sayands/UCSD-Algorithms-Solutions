import java.util.*;

public class Changing_Money{
  static void count(int m){
    int count = 0;
    count+=(m/10);
    m=m%10;
    count+=(m/5);
    m=m%5;
    count+=(m);
    System.out.println(count);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();

    count(m);
  }
}
