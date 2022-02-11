package com.company;
//Класс, показывающий является ли строка палиндромом
public class Palindrome {

    public static void main(String[] args) {
	for (int i=0; i<args.length; i++){
        String s = args[i];
        }
    }
    //Метод, позволяющий полностью изменить символы в строке
    public static String reverseString(String s){
        String a = "";
        for (int i = s.length()-1; i >= 0; i--)
            a += s.charAt(i);
        return a;
    }
    public static boolean isPalindrome(String s){
        return reverseString(s).equals(s);
    }
}
