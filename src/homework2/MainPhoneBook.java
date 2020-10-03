package homework2;

import java.util.Set;

public class MainPhoneBook {
    public static void main(String[] args) {
        PhoneBookInterface phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "555-555-5");
        phoneBook.add("Petr", "545-535-5");
        phoneBook.add("Ivan", "507-567-5");
        phoneBook.add("Vitaliy", "599-555-5");
        phoneBook.add("Vasya", "597-565-5");

        Set<String> allNames = phoneBook.getAllNames();
        for (String name : allNames) {
            Set<String> phones = phoneBook.get(name);
            System.out.printf("%s: %s%n", name, phones);

        }
    }
}
