import java.util.*;

public class Maximise_Salary{

      static int compare(String a, String b){
        String res1 = a+b;
        String res2 = b+a;
        int m = Integer.parseInt(res1);
        int n = Integer.parseInt(res2);
        return m>n?1:-1;
    }    
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String number[] = new String[n];
    for(int i=0;i<n;i++)
        number[i] = sc.next();
    for (int i=1; i<n; ++i)
        {
            String key = number[i];
            int j = i-1;
            while (j>=0 && compare(number[j],key) < 0 )
            {
                number[j+1] = number[j];
                j = j-1;
            }
            number[j+1] = key;
        }
    for(int i=0;i<n;i++)
      System.out.print(number[i]);
  }
}
