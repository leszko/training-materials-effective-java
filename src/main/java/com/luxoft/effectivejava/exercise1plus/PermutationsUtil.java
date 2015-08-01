package com.luxoft.effectivejava.exercise1plus;

import java.util.ArrayList;

public class PermutationsUtil {

    public static ArrayList<String> performPermutations(String s) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (s == null) {
            return null;
        } else if (s.length() == 0) {
            arrayList.add("");
            return arrayList;
        } else {
            for (int i = 0; i < s.length(); i++) {
                ArrayList<String> remaining = performPermutations(s.substring(0, i) + s.substring(i + 1));
                for (int j = 0; j < remaining.size(); j++) {
                    arrayList.add(s.charAt(i) + remaining.get(j));
                }
            }
            return arrayList;
        }
    }
}

