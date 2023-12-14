public class harshed {
    public static void main(String[] args) {
        int n = 31;
        int temp = n;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum= rem +sum;
            temp = temp / 10;
        }
        if(n % sum == 0){
            System.out.println("Harshed Number");
        }else{
            System.out.println("Not Harshed Number");
        }
    }
}
