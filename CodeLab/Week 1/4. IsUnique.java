/*
Implement an algorithm to determine if a string has all unique characters.
 */

public boolean isUnique(String s){
    if (s.length() <= 1) return true;

    Set<Character> distinct = new HashSet<Character>();
    for(int i = 0; i < s.length(); i++) {
        if(distinct.contains(s.charAt(i))) return false;
        distinct.add(s.charAt(i));
    }
    return true;
}