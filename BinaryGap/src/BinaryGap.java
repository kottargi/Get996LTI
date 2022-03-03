import java.util.*;

public class BinaryGap {
	public static void main(String[] args) {
		int A[]= {1,2,3,4};
		  
		      Arrays.sort(A);
		    int i, j, count = 0;
		    for (i = 0; i < A.length; i++) {
		        for (j = i + 1; j < A.length; j++) {
		            if (A[i] == A[j])
		                count++;
		            else
		                break;
		            }
		        if (count % 2 == 0)
			           System.out.print( A[i]);
		        else {
		            count = 0;
		           System.out.println( i = j - 1);
		        }
		    }
		    
		}
}
		