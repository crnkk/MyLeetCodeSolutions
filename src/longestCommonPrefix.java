import java.util.Arrays;
import java.util.Scanner;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0)
            return "";

        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int c=0;
        while(c < first.length()){
            if(first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
    }
        return c == 0 ? "" : first.substring(0,c); //0 ile c arası basar
        //s.substring(6) 6 ve 6 dan sonrasını basar
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input[]={"dog","doll","dozan"};
        int n=input.length; //array de length() olmaz
        String ans= longestCommonPrefix(input);




    }
}
