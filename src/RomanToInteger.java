import java.util.Scanner;

public class RomanToInteger {
        public static int romanToInt(String s) {
            //58 = LVIII = 50 + 5 + 3
            int sum = 0;
            int i = 0;
            while (i < s.length()) {
                char ch = s.charAt(i); //ilk karakteri al
                switch (ch) {
                    case 'I':
                        if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                            sum = sum + 4; // IV -> V NOT IIII
                            i = i + 2; //IV 2 karakter
                        } else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                            sum = sum + 9; //IX -> X
                            i = i + 2; //IX 2 karakter
                        } else {
                            sum = sum + 1; // I = 1 zaten
                            i++;
                        }
                        break;
                    case 'V':
                        sum = sum + 5;
                        i++;
                        break;
                    case 'X':
                        if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                            sum = sum + 40;
                            i = i + 2;
                        } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                            sum = sum + 90;
                            i = i + 2;
                        } else {
                            sum = sum + 10;
                            i++;
                        }
                        break;
                    case 'L':
                        sum = sum + 50;
                        i++;
                        break;
                    case 'C':
                        if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                            sum = sum + 400;
                            i = i + 2;
                        } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                            sum = sum + 900;
                            i = i + 2;
                        } else {
                            sum = sum + 100;
                            i++;
                        }
                        break;
                    case 'D':
                        sum = sum + 500;
                        i++;
                        break;
                    case 'M':
                        sum = sum + 1000;
                        i++;
                        break;
                    default:
                        continue;
                }

            }
            return sum;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String say=sc.nextLine();
        System.out.println(romanToInt(say));

    }
    }