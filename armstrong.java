public class armstrong {
    public static void main(String[] args) {
        int n =371;
        int arm = 0;
        int temp = n;
        while(temp != 0){
            int single = temp % 10;
            arm = (single* single * single) + arm;
            temp = temp /10;
        }
        if(n == arm){
            System.out.println("Armstrong Number");
        }else
        {
            System.out.println("Not armstrong number");
        }
    }
}
