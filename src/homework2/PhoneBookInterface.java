package homework2;

import java.util.Set;

public interface PhoneBookInterface {

    void add(String name, String phoneNumber);

    Set<String> get(String name);
    Set<String> getAllNames();

}
