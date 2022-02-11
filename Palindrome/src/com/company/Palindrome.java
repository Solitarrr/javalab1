package com.company;
//Класс, показывающий является ли строка палиндромом
public class Palindrome {

    public static void main(String[] args) {
	for (int i= 0; i<args.length; i++){
        String s = args[i];
        System.out.print(s+" is ");
        if(!isPalindrome(s))
            System.out.print(" not ");
        System.out.print("a palindrome!");
        }
    }
    //Метод, позволяющий полностью изменить символы в строке
    public static String reverseString(String s){
        String a = "";
        for (int i = s.length()-1; i >= 0; i--)
            a += s.charAt(i);
        return a;
    }
    //Метод, переворачивающий слово s и сравнивающий его с первоначальными данными
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }
}
