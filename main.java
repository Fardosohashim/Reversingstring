package Reversingastring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String reverse: ");
//        String S = sc.nextLine();
//        char[] str = S.toCharArray();
//        ArrayList<Character> reverse = new ArrayList<>();
//        for (char c : str) {
//            reverse.add(c);
//
//            Collections.reverse(reverse);
//            ListIterator<Character> li = reverse.listIterator();
//            while (li.hasNext()) {
//                System.out.println(li.next());
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the string reversal app" +
                "\nEnter the String to be reversed: ");

        String entry = sc.next();
        System.out.println("Original String: " +entry);

        StringBuilder nonStrg= new StringBuilder();

        char ch;

        for (int i=0; i<entry.length();i++){

            ch = entry.charAt(i);
            nonStrg.insert(0, ch);

        }

        System.out.println("Reversed String: "+nonStrg);







    }
}