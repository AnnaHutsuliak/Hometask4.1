package com.epam.task1;
public class Task1 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(removeCharAt(str, 3));
    }
    public static String removeCharAt (String s,int pos){
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
