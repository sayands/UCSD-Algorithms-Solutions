import java.util.*;

public class Majority_Element{
  static int majority_guess(int a[],int n){
    int maj_index = 0, count = 1;
    for(int i=1;i<n;i++){
      if(a[i] == a[maj_index])
          count++;
      else
          count--;
      if(count == 0){
        maj_index = i;
        count=1;
      }
    }
    return a[maj_index];
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
    int maj_element = majority_guess(a,n); int count = 0;
    for(int i =0;i<n;i++){
      if(maj_element == a[i])
        count++;
    }
    if(count>n/2)
      System.out.println(1);
    else
      System.out.println(0);
  }
}
