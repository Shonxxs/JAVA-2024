package Semana14;

public class MatchLibrary {

    public class MathLibrary {

        public static boolean esCapicua(int num) {
            int reversed = voltea(num);
            return num == reversed;
        }

        public static boolean esPrimo(int num) {
            if (num <= 1)
                return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }

        public static int siguientePrimo(int num) {
            num++;
            while (!esPrimo(num)) {
                num++;
            }
            return num;
        }

        public static double potencia(double base, int exponent) {
            return Math.pow(base, exponent);
        }

        public static int digitos(int num) {
            int count = 0;
            while (num > 0) {
                num /= 10;
                count++;
            }
            return count;
        }

        public static int voltea(int num) {
            int reversed = 0;
            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            return reversed;
        }

        public static int digitoN(int num, int n) {
            int digit = (num / (int) Math.pow(10, n)) % 10;
            return digit;
        }

        public static int posicionDeDigito(int num, int digit) {
            int position = -1;
            int n = 0;
            while (num > 0) {
                int currentDigit = num % 10;
                if (currentDigit == digit) {
                    position = n;
                    break;
                }
                num /= 10;
                n++;
            }
            return position;
        }

        public static int quitaPorDetras(int num, int n) {
            int divisor = (int) Math.pow(10, n);
            return num / divisor;
        }

        public static int quitaPorDelante(int num, int n) {
            int multiplier = (int) Math.pow(10, n);
            return num % multiplier;
        }

        public static int pegaPorDetras(int num, int digit) {
            return num * 10 + digit;
        }

        public static int pegaPorDelante(int num, int digit) {
            int multiplier = (int) Math.pow(10, digitos(num));
            return multiplier * digit + num;
        }

        public static int trozoDeNumero(int num, int start, int end) {
            int multiplier = (int) Math.pow(10, end - start);
            int trozo = (num / (int) Math.pow(10, start)) % multiplier;
            return trozo;
        }

        public static int juntaNumeros(int num1, int num2) {
            int multiplier = (int) Math.pow(10, digitos(num2));
            return multiplier * num1 + num2;
        }
    }
}