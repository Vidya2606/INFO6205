/*
Given two strings, write a method to decide if one is a permutation of the other
 */

public boolean checkPermutation(String s1, String s2) {
    if (s1.length() != s2.length() || s1 == null || s2 == null) return false;

    // key is unique char in both strings
    // value is added by count of char in s1 and decremented by count of char in s2
    Map<Character, Integer> count = new HashMap<Character, Integer>();
    for (int i = 0; i < s1.length(); i++){
        char c1 = s1.charAt(i);
        count.put(c1, count.getOrDefault(c1, 0) + 1);
        char c2 = s2.charAt(i);
        count.put(c2, count.get(OrDefault) - 1);  // COMMENTS: Error here it should be count.getOrDefault
    }

    // if any value of the entry is not zero, s1 and s2 are not permutation of each other
    for (Map.Entry<Character, Integer> cnt : count){
        if (cnt.getValue() != 0) return false;
    }

    return true;
}
