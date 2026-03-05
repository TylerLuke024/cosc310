package chapter13;

public class Palindrome {

    public static boolean Palin(String word) {
        int len = word.length();
        if (len <= 1) {
            return true;
        }
        else {
            char first = word.charAt(0);
            char last = word.charAt(word.length() -1);
            if (first != last) {
                return false;
            }
            else {
                String shorter = word.substring(1,len-1).trim();
                return Palin(shorter);
            }
        }
    }



    public static void main(String[] args) {
        System.out.println(Palin("racecar"));
        System.out.println(Palin("hello"));
    }
}
