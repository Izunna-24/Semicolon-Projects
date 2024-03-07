package phoneBookApp;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    //private String name;
    //private String phoneNumber;
    private static final List<String> myPhoneBook = new ArrayList<>();

    public static String addNew(String name, String phoneNumber){
        myPhoneBook.add(name);
        myPhoneBook.add(phoneNumber);

        return "contact saved successfully";
       }
    public static List<String> search(String name){
        List<String> store = new ArrayList<>();
        for (int index = 0; index < myPhoneBook.size(); index++){
            if(myPhoneBook.get(index).equals(name)){
                store.add(myPhoneBook.get(index));
                store.add(myPhoneBook.get(index + 1));
            }
        }
        return store;
    }
    public static String edit(String name, String newName, String newPhoneNumber){
        for(int index = 0; index < myPhoneBook.size(); index++){
            if(myPhoneBook.get(index).equals(name)){
                if(newName != null) myPhoneBook.set(index, newName);
                if(newPhoneNumber != null) myPhoneBook.set(index + 1, newPhoneNumber);
                return "update successful";
            }
        }
        return "no match found!";

    }
    public static String delete(String name){
        for(int index = 0; index < myPhoneBook.size(); index += 2){
            if(myPhoneBook.get(index).equals(name)){
                myPhoneBook.remove(index);
                if(index < myPhoneBook.size()){
                    myPhoneBook.remove(index);
                }
                return "delete successful";
            }
        }
        return "no match found";
    }
}



