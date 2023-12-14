import java.util.Arrays;

public class maximum {
    public static void main(String[] args) {
        int arr[]={12,13,45,12,56,89,11,2};
        System.out.println(arr.length);
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("maximum element is:"+ arr[n-1]);

        // 2nd way to find maximum element
        int max =arr[0];
        for(int i=0;i<= arr.length-1;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("maximum: "+ max);
    }
}
