import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1= "listen";
        String str2= "silent";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if(ch2.length != ch1.length){
            System.out.println("not anagram");
        } else{
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i=0;i<= ch1.length-1;i++){
                if(ch1[i] != ch2[i]){
                    System.out.println("Not an anagram");
                }
            }
            System.out.println("Anagram");
        }
    }
}
