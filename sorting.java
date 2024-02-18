import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class sorting {
    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        int i = 0;
        int temp;
        while(i < arr.length-1){
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            i++;
        }
        return arr;
    }

    public static int[] linearsort(int[] arr){
        int n = arr.length;
        int i = 0;
        int temp;
        while(i < arr.length-1){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            i++;
        }
        return arr;
    }

    public static int[] insertionsort(int[] arr){
        int i = 1;
        int temp;
        while(i < arr.length){
            for (int j = i; j >=0 ; j--) {
                if(arr[j]>arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            i++;
        }
        return arr;
    }

    public static int[] selectionsort(int[] arr){
        int i = 0;
        int temp;
        int min;
        while(i < arr.length){
            min = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    min = arr[j];
                }
            }
            arr[i] = min;
            i++;
        }
        return arr;
    }

    public static boolean ispalin(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean revpalin(String str){
        String abc = "";
        for(int i = str.length()-1; i >=0  ;i--){
            abc = abc + str.charAt(i);
        }

        if(str.equals(abc)) return true;
        else return false;
    }

    public static boolean isprime(int num){
        for(int i =2 ; i <= Math.sqrt(num) ; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> primefact(int num){
        int real = num;
        ArrayList<Integer> list = new ArrayList<>();
        int i = num;
        while (i >= 2) {
            if(isprime(i) && num%i == 0){
                list.add(i);
                num = num/i;
                i = num;
                continue; 
            }
            i--;
        }
        if(list.size()==0) list.add(real);
        return list;
    }

    public static void main(String[] args) {
        // int[] arr = {2,3,4,1,3,5,1};
        // System.out.println("bubble sorting is : "+Arrays.toString(bubblesort(arr)));
        // System.out.println("Linear sorting is : "+Arrays.toString(linearsort(arr)));
        // System.out.println("insertion sorting is : "+Arrays.toString(insertionsort(arr)));
        // System.out.println("selection sorting is : "+Arrays.toString(selectionsort(arr)));
        // System.out.println(ispalin("malayalam"));
        // System.out.println(revpalin("malayalam"));
        System.out.println(primefact(10));
}
}