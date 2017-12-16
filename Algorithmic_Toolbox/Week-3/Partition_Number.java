import java.util.*;

public class Partition_Number{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0,x=0,count=0;
    ArrayList<String> sumArray = new ArrayList<String>();
    for(int i=1;i<=n;i++){
        if(i*2>=n){
          sumArray.add(String.valueOf(n));
          count++;
          break;
        }
        count++;
        sumArray.add(String.valueOf(i));
        n = n-i;
    }
    System.out.println(count);
    for(int i=0;i<sumArray.size();i++)
      System.out.print(sumArray.get(i) + " ");
    System.out.println();
  }
}
