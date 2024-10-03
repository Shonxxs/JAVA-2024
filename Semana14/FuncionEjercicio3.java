package Semana14;

public class FuncionEjercicio3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99999; i++) {
            if (isPalindromic(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindromic(int num) {
        String strNum = String.valueOf(num);
        int left = 0;
        int right = strNum.length() - 1;
        while (left < right) {
            if (strNum.charAt(left) != strNum.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}