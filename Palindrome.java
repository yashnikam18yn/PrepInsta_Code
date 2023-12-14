public class Palindrome {
    public static void main(String[] argv){
        int num = 121;
        int pal= 0;
        int temp = num;
        while (temp != 0){
            int rem = temp % 10;
            pal = rem + pal * 10;
            temp = temp /10;
        }
       if (num == pal){
           System.out.println("Palindrome");
       }else {
           System.out.println("not palindrome");
       }
    }
}
