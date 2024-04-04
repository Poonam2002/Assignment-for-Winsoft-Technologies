
import java.util.Arrays;

public class MergeArrays {

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        
        int j = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[j--] = X[i];
            }
        }
        
        int i = j + 1; 
        int k = 0;     
        int l = 0;     

        while (i < m && k < n) {
            if (X[i] < Y[k]) {
                X[l++] = X[i++];
            } else {
                X[l++] = Y[k++];
            }
        }

      
        while (k < n) {
            X[l++] = Y[k++];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        System.out.println("X[] = " + Arrays.toString(X));
    }
}

