/*
Given two non-negative integers num1 and num2 represented as string,return the sum of num1 and num2.
 */

public int sumOfTwoStrings(String n1, String n2){
    int num1 = (n1 != null && n1 != "") ? Integer.parseInt(n1) : 0;
    int num2 = (n2 != null && n2 != "") ? Integer.parseInt(n2) : 0;
    return num1 + num2;
}