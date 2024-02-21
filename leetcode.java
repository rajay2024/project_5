import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class leetcode {
    // public static int[] addtwo(int[] arr,int n){
    //     int[] result = new int[2];
    //     for (int i = 0; i < arr.length-1; i++) {
    //         for (int j = i+1; j < arr.length; j++) {
    //             if(arr[i]+arr[j] == n){
    //                 result[0]=i;
    //                 result[1]=j;
    //                 return result;
    //             }
    //         }
    //     }
    //     result[0]=-1;
    //     result[1]=-1;
    //     return result;
    //     // HashSet<Integer> map = new HashSet<>();

    // }

    
    // public static void main(String[] args) {
    //     // int[] arr = {2,9,11,7};
    //     // int n = 9;
    //     // System.out.println(Arrays.toString(addtwo(arr, n)));

    // }
    // public double findMedianSortedArrays(int[] nums1, int[] nums2)
    public static double fmsa(int[] nums1,int[] nums2){
        double res = 0.0;
        int n = nums1.length + nums2.length;
        int[] result = new int[n];

        for(int i = 0;i < nums1.length;i++){
            result[i] = nums1[i];
        }
        for(int i = 0;i < nums2.length;i++){
            result[nums1.length+i] = nums2[i];
        }
        // return result;

        if(n%2!=0){//odd
            res = result[(n/2)];
            return res;
        }

        else{//even
            res = (result[(n)/2] + result[n+2/2])/2;
            return res;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println(fmsa(arr1,arr2));
    }
}
