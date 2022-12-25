import java.util.Scanner;

public class IntegerToRoman {
    public static String intToRoman(int num) {

            StringBuilder sb = new StringBuilder();
            int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
            String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD" ,"D", "CM", "M"};
            for(int i = values.length - 1; i >= 0 && num > 0; i--){

                while(num >= values[i]){
                    num -= values[i];
                    sb.append(roman[i]);
                  //  System.out.println("cikarma" + (num -= values[i]));
                }
            }
        return sb.toString();
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer input=sc.nextInt();
        System.out.println(intToRoman(input));
    }
}
