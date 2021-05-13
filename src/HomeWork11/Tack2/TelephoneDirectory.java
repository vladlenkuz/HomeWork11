package HomeWork11.Tack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TelephoneDirectory {

    private HashMap<String, List<String>> book;

    public TelephoneDirectory(){
        this.book = new HashMap<>();
    }

    public void add(String name, String number){
        if(book.containsKey(name)){
            List<String> numbers = book.get(name);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println("Номер телефона " + number + " добавлен для фамилии " + name);
            } else {
                System.out.println("Номер телефона " + number + " уже существует для фамилии " + name);
            }
        } else {
            book.put(name, new ArrayList<>(Arrays.asList(number)));
            System.out.println("Номер телефона " + number +" добавлен для фамилии " + name);
        }
    }

    public List<String> get(String name){
        if(book.containsKey(name)){
            return book.get(name);
        } else {
            System.out.println("В справочнике нет номера телефона для фамилии " + name );
            return new ArrayList<>();
        }
    }
}
