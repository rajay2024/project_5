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

        String str = "hello";

        String reverse = "";

        int length = str.length();

        for (int i = 0; i < length; i++) {

            reverse = str.charAt(i);

        }

        System.out.println(reverse);

    }
}
