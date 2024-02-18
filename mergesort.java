import java.util.Arrays;

public class mergesort {

    public static int[] mergethearray(int[] one, int[] two){
        int[] sorted = new int[one.length + two.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < one.length && j < two.length){
            if(one[i] < two[j]){
                sorted[k] = one[i];
                k++;
                i++;
            }
            else{
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        
        if(i == one.length){
            while(j < two.length){
                sorted[k] = two[j];
                k++;
                j++;
            }
        }

        if(j == two.length){
            while(i < one.length){
                sorted[k] = one[i];
                k++;
                i++;
            }
        }

        return sorted;
    }

    public static int[] mergesort(int[] arr,int f,int l){
        if(f == l){
            int[] br = new int[1];
            br[0] = arr[f];
            return br;
            // return arr;
        }

        int mid = (f + l) / 2;
        int[] one = mergesort(arr, f, mid);
        int[] two = mergesort(arr, mid+1, l);

        int[] merge = mergethearray(one , two);

        return merge;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,6,4,7,0};
        int[] fin = mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(fin));
    }
}
