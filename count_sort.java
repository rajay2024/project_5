import java.lang.reflect.Array;
import java.util.Arrays;

public class count_sort {
    public static int[] freq(int[] arr,int max){
        int[] fina = new int[max];
        //{1,2,3,2,1} --> {2 ,2 ,1 }
        for (int i : arr) {
            fina[i-1]++;
        }
        return fina; 
    }

    public static int[] cumsum(int[] freq){
        int[] fina = new int[freq.length];
        int sum = 0;
        for (int i = 0; i < freq.length; i++) {
            sum += freq[i];
            fina[i] = sum;
        }
        return fina;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,1,7,4,1,3,5};
        int[] finarr = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i > max) max = i;
        }
        int[] freq = freq(arr, max);
        int[] cumsum = cumsum(freq);

        System.out.println(Arrays.toString(freq));
        System.out.println(Arrays.toString(cumsum));
        int i = arr.length-1;
        while(i>=0){
            finarr[cumsum[arr[i]-1] - 1] = arr[i];
            cumsum[arr[i]-1]--;
            i--;
        }
        System.out.println(Arrays.toString(finarr));
    }
}
