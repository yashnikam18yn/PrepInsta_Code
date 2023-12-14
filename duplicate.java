public class duplicate {
    public static void main(String[] args) {
        int arr[] = {12,34,56,78,12,78};
        int len = arr.length;
        for(int i=0;i<=len-1;i++){
            for (int j=i+1;j<=len-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Found");
                    break;
                }
            }
        }
    }
}
