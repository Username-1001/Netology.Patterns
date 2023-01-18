import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int max;
        int treshold;
        List<Integer> list;
        Random random;
        Filter filter;

        Logger.getInstance().log("Запрвшиваем размер списка");
        System.out.println("Введите размер списка");

        String userInput = scanner.nextLine();
        try {
            size = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            Logger.getInstance().log(e.toString());
            throw new NumberFormatException("Введен неверный формат числа");
        }

        Logger.getInstance().log("Запрвшиваем верхнюю границу значений элементов");
        System.out.println("Введите верхнюю границу значений элементов");

        userInput = scanner.nextLine();
        try {
            max = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            Logger.getInstance().log(e.toString());
            throw new NumberFormatException("Введен неверный формат числа");
        }

        Logger.getInstance().log("Создаем список");
        random = new Random();
        list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max));
        }
        System.out.println("Случайный список: " + list);

        Logger.getInstance().log("Запрвшиваем число для фильтрации списка");
        System.out.println("Введите число для фильтрации списка");

        userInput = scanner.nextLine();
        try {
            treshold = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            Logger.getInstance().log(e.toString());
            throw new NumberFormatException("Введен неверный формат числа");
        }

        Logger.getInstance().log("Запускаем фильтрацию");
        filter = new Filter(treshold);
        List result = filter.filterOut(list);
        Logger.getInstance().log("Выводим результат на экран");

        System.out.println("Отфильтрованный список: " + result);
    }
}
