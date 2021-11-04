package com.example.firstproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names1.length; i++) {
            set.add(names1[i]);
        }
        for (int i = 0; i < names2.length; i++) {
            set.add(names2[i]);
        }
        for (String s : set) {
            list.add(s);
        }
        String[] uniqueNames = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniqueNames[i] = list.get(i);
        }
        return uniqueNames;
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
