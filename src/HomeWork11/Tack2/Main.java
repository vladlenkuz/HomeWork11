package HomeWork11.Tack2;

public class Main {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        System.out.println("------------------");

        System.out.println("Наполняем справочник");
        telephoneDirectory.add("Иванов", "89543567815");
        telephoneDirectory.add("Бурлаков", "89564721538");
        telephoneDirectory.add("Баширов", "87541628430");
        telephoneDirectory.add("Иванов", "892410673254");
        telephoneDirectory.add("Иванов", "89604021356");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Иванов " + telephoneDirectory.get("Иванов"));
        System.out.println("Баширов " + telephoneDirectory.get("Баширов"));
        System.out.println("*******************************************");
        System.out.println("Случай отсутствия записи");
        System.out.println("Петров " + telephoneDirectory.get("Петров"));
        System.out.println("********************************************");

        System.out.println("Пробуем записать существующий номер");
        telephoneDirectory.add("Баширов", "89631047502");
        System.out.println("Иванов" + telephoneDirectory.get("Иванов"));

    }
}
