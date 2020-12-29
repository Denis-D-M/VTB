package com.vtb.lesson5;
// Закомментированная рограмма может вывести количество уникальных слов в массиве и посчитать сколько раз встречается слово.
// Phonebook - самая простая телефонная книга.
public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Мишин", "+79608404536");
        phonebook.add("Мишин", "+75463452346");
        phonebook.add("Мишин", "+79608404536");
        System.out.println(phonebook.get("Мишин"));



//        String[] words = new String[] {
//                "Привет",
//                "Солнце",
//                "Привет",
//                "Дела",
//                "Как",
//                "Солнце",
//                "!",
//                "Привет",
//                "Ты",
//                "Как",
//                "Приветики"
//        };
//        Map<String, Integer> map = new HashMap<>();
//        for (String s : words){
//            if (!map.containsKey(s)){
//                map.put(s,1);
//            }else{
//                map.put(s, map.get(s) + 1);
//            }
//        }
//        System.out.println(map.keySet());
//        System.out.println(map.toString());
    }
}
