import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int userNum, userNum2;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("ЗАДАЧА: УГАДАЙ ЧИСЛО ОТ 0 ДО 15");

        int num = (int) Math.floor(Math.random() * 16);
        int num1 = (int) Math.floor(Math.random() * 6);

        do {
            count++;

            System.out.print("Введи число");

            userNum = input.nextInt();

            if (userNum > num)
                System.out.println("Число меньше");

            else if (userNum < num)
                System.out.println("Число больше");

            else
                System.out.println("Вы угадали!");
        } while (userNum != num);

        System.out.println("Число затраченных попыток: " + count);
    }
}