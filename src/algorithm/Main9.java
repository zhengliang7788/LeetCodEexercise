package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 例如，121 是回文，而 123 不是。
 */
public class Main9 {

    public static boolean isPalindrome(int x) {

        String string = new StringBuilder(String.valueOf(x)).reverse().toString();

        return string.equals(String.valueOf(x));
    }

    public static boolean palindrome(int x) {

        boolean flag = true;

        //负数的时候全部不是回文
        if (x < 0) {
            flag = false;
        }

        if (x > 0) {
            List<Integer> numList = new ArrayList<>();

            while (x > 0) {
                int i = x % 10;
                x = x / 10;
                numList.add(i);
            }

            int size = numList.size();

            if (size % 2 == 0) {
                size = size / 2;
            } else {
                size = size / 2 + 1;
            }

            for (int i = 0; i < size; i++) {
                int num1 = numList.get(i);

                int num2 = numList.get(numList.size() - 1 - i);

                if (num1 == num2) {
                    flag = true;
                } else {
                    flag = false;

                    break;
                }
            }
        }

        return flag;
    }

    public static Integer add(int x) {

        List<Integer> numList = new ArrayList<>();

        int sum = 0;

        while (x > 0) {
            int i = x % 10;
            sum += i;
            numList.add(i);
            x = x / 10;
        }

        System.out.println(numList);

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Main9.palindrome(1000021));
    }

}
