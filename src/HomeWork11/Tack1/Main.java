package HomeWork11.Tack1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> fruit = Arrays.asList(
                "яблок", "груша", "слива", "черешня", "вишня",
                "айва", "хурма", "алыча", "банан", "мандарин",
                "арбуз", "яблоко", "слива", "вишня", "арбуз",
                "хурма", "виноград", "слива", "инжир", "арбуз"
        );

        Set<String> unique = new HashSet<String>(fruit);
        System.out.println("Первоначальный массив");
        System.out.println(fruit.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            //Collections.frequency(fruit, key)) - Определяет, сколько раз элемент obj встречается в коллекции fruit;
            System.out.print(" |" + key + ": " + Collections.frequency(fruit, key) + "раз(раза)|");
        }
    }
}
