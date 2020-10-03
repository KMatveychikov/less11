package homework2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook implements PhoneBookInterface {

    private Map<String, Set<String>> phonesByName;

    public PhoneBook(){
        phonesByName = new TreeMap<>();
    }
    @Override
    public void add(String name, String phoneNumber){
        Set<String> phones = getPhones(name);
        phones.add(phoneNumber);
    }
    private Set<String> getPhones(String name){
        Set<String> phones = phonesByName.getOrDefault(name, new HashSet<>());
        if(phones.isEmpty()){
            phonesByName.put(name, phones);
        } return phones;
    }

    @Override
    public Set<String> get(String name){
        return getPhones(name);
    }

    @Override
    public Set<String> getAllNames(){
        return phonesByName.keySet();
    }
}
