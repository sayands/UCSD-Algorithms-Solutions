import java.util.*;
import java.io.*;
import java.util.Arrays;

public class MaxPairwiseProduct {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
	long max1=0,max2=0;
	for(int i=0;i<n;i++)
	{
	    if(numbers[i]>max1)
		{
		    max2 = max1;
		    max1 = numbers[i];
		}
	    else if(numbers[i]>max2)
		   max2 = numbers[i];
	} 
        System.out.println(max1 * max2);
    }

}
