package com.vtb.lesson5;

import java.util.*;

public class Phonebook {
    Map<String, Set<String>> phones = new HashMap<>();
    public void add(String surname, String phoneNumber){
        if (!phones.containsKey(surname)){
            Set<String> arrayList = new HashSet<>();
            arrayList.add(phoneNumber);
            phones.put(surname,arrayList);
        } else{
            phones.get(surname).add(phoneNumber);
        }

    }
    public Set<String> get(String surname){
        return phones.get(surname);
    }
}

