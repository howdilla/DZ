package Pro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main
{
    // Проверяет, является ли строка пустой ("") или нулевой.
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    // Подсчитывает, сколько раз подстрока появляется в большей строке.
    public static int countMatches(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        Matcher matcher = Pattern.compile(str).matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Введите строку или quit для выхода из программы: ");
            String text = in.nextLine();

            if (text.equals("quit")) {
                System.out.print("Вы вышли из программы.");
                System.exit(0);
            }

            System.out.println("Введите подстроку: ");
            String str = in.nextLine();

            int count = countMatches(text, str);
            System.out.println(count);

        } while (true);

    }
}
