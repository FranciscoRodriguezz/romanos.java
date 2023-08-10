
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa un número entero: ");
            int number = scanner.nextInt();

            if (number <= 0 || number > 3999) {
                System.out.println("El número debe estar en el rango de 1 a 3999.");
            } else {
                String romanNumber = convertToRoman(number);
                System.out.println("El número romano equivalente es: " + romanNumber);
            }
        }

        public static String convertToRoman(int number) {
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder romanNumber = new StringBuilder();
            int index = 0;

            while (number > 0) {
                if (number >= values[index]) {
                    romanNumber.append(romanSymbols[index]);
                    number -= values[index];
                } else {
                    index++;
                }
            }

            return romanNumber.toString();
        }
    }