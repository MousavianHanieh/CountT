package org.example;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        String s = "it is time to practice";
        System.out.println(s);

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 't'){
                count++;
            }
        }
        System.out.println("CountT:" + count);
    }
}