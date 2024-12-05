import java.util.Random;
import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Selamat datang di Kuis Matematika!");
        boolean keepPlaying = true;

        while (keepPlaying) {

            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            char operator;
            int operatorChoice = random.nextInt(3);

            switch (operatorChoice) {
                case 0:
                    operator = '*';
                    break;
                case 1:
                    operator = '+';
                    break;
                case 2:
                    operator = '-';
                    break;
                default:
                    operator = '+';
            }

            System.out.print(num1 + " " + operator + " " + num2 + " = ");
            int correctAnswer;

            switch (operator) {
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                case '+':

                    if (num2 == 0)
                        num2 = 1;
                    correctAnswer = num1 + num2;
                    break;
                case '-':

                    if (num2 == 0)
                        num2 = 1;
                    correctAnswer = num1 - num2;
                    break;
                default:
                    correctAnswer = 0;
            }

            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah " + correctAnswer);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (iya/tidak): ");
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("tidak")) {
                keepPlaying = false;
                System.out.println("Terima kasih telah bermain!");
            }
        }

        scanner.close();
    }
}
