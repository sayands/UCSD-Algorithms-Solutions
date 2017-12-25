import java.util.*;

public class Maximise_Value{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        int n = (exp.length()+1)/2;
        double M[][] = new double[n][n];
        double m[][] = new double[n][n];
        for(int i=0;i<n;i++){
            m[i][i] = (double)(exp.charAt(2*i) - 48);
            M[i][i] = (double)(exp.charAt(2*i) - 48);
            //System.out.println(m[i][i]);
        }
        for(int s=0;s<n-1;s++){
          for(int i=0;i<n-s-1;i++){
            int j = i + s+1;
            double min = +999999999.999;
            double max = -999999999.999;
            for(int k = i;k<j;k++){
                double a=0.0,b=0.0,c=0.0,d=0.0;
                switch(exp.charAt(2*k+1)){
                    case '+' :  a = M[i][k] + M[k+1][j];
                                b = M[i][k] + m[k+1][j];
                                c = m[i][k] + M[k+1][j];
                                d = m[i][k] + m[k+1][j]; break;
                    case '-' :  a = M[i][k] - M[k+1][j];
                                b = M[i][k] - m[k+1][j];
                                c = m[i][k] - M[k+1][j];
                                d = m[i][k] - m[k+1][j]; break;
                    case '*' :  a = M[i][k] * M[k+1][j];
                                b = M[i][k] * m[k+1][j];
                                c = m[i][k] * M[k+1][j];
                                d = m[i][k] * m[k+1][j]; break;                      
                }
                min = Math.min(min,Math.min(a,Math.min(b,Math.min(c,d))));
                max = Math.max(max,Math.max(a,Math.max(b,Math.max(c,d))));
            }
            m[i][j] = min;
            M[i][j] = max;
          }     
        }
        if(exp.length()<=2)
            System.out.println(exp.charAt(0));
        else    
            System.out.println(Math.round((M[0][n-1])));
        sc.close();
    }
}