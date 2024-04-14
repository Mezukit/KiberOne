import java.util.Scanner;

public class Word {

    private static final String WORD = "массажист";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Угадайте слово");
        int length = WORD.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            stringBuilder.append("-");
        }

        String wordMask = stringBuilder.toString();

        System.out.println(wordMask);

        do {
            System.out.print("Введите букву: ");
            char c = Character.toLowerCase(input.next().charAt(0));
            if (WORD.toLowerCase().indexOf(c) >= 0) {
                System.out.println("В слове есть такая буква!");
                for (int i = 0; i < WORD.length(); i++) {
                    if (WORD.charAt(i) == c) {
                        wordMask = replaceLetter(Character.toString(c), wordMask);
                    }
                }
                System.out.println(wordMask);
            } else {
                System.out.println("НЕ УГАДАЛ! ЛОХ! ДЕЛАЙ СНОВА!");
            }

        } while (wordMask.contains("-"));
    }

    private static String replaceLetter(String letter, String wordMask) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < WORD.length(); i++) {
            if (WORD.charAt(i) == letter.charAt(0)) {
                stringBuilder.append(letter);
            } else if (wordMask.charAt(i) != '-') {
                stringBuilder.append(wordMask.charAt(i));
            }
            else {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }
}
