import java.util.Arrays;

public class spiral {
    public static void main(String[] args) {
        // int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        // int top = 0;
        // int left = 0;
        // int right = mat[0].length-1;
        // int bottom = mat.length-1;

        // while(left<=right && top<=bottom){
        // for(int i = left; i <= right; i++){
        // System.out.println(mat[top][i]);
        // }
        // top++;
        // if(top>bottom) break;

        // for(int i = top; i <= bottom; i++){
        // System.out.println(mat[i][right]);
        // }
        // right--;
        // if(left>right) break;

        // for(int i = right; i >= left; i--){
        // System.out.println(mat[bottom][i]);
        // }
        // bottom--;
        // if(top>bottom) break;

        // for(int i = bottom; i >= top; i--){
        // System.out.println(mat[i][left]);
        // }
        // left++;
        // }

        // String str = "hello";

        // String reverse = "";

        // int length = str.length();

        // for (int i = 0; i < length; i++) {

        //     reverse = str.charAt(i) + reverse;

        // }

        // // System.out.println("reversed string is :"+reverse);
        // int[] arr = {1,3,2,4};
        // int n = 5;
        // boolean flag = false;
        // Arrays.sort(arr); //{1,2,3,5}
        // for (int i = 0; i < arr.length; i++) {
        //     if(i+1 != arr[i]){
        //         System.out.println("missing value is : "+(i+1));
        //         flag = true;
        //         break;
        //     }
        // }
        // if(flag == false){
        //     System.out.println("missing is :"+n);
        // }
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int index = 0; index < arr.length; index++) {
            System.out.println();
            for (int i = 0; i < arr[index].length; i++) {
                System.out.print(arr[index][i]);
            }
        }

        System.out.println("------------");

        for (int index = 0; index < arr.length ; index++) {
            System.out.println();
            for (int i = arr[index].length-1; i >=0 ; i--) {
                System.out.print(arr[i][index]);
            }
        }

    }
}
