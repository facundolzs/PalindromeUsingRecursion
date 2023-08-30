package main;

import implementation.Palindrome;
import java.util.Scanner;

public class Principal {

    static Scanner readin = new Scanner(System.in);

    public static void main(String[] args) {

        test();

    }

    /**
     * Run program
     */
    static void test() {

        char answ;

        do {
            Palindrome.isPalindrome();
            System.out.println("¿Exit? (y/n): ");
            answ = readin.next().charAt(0);
        } while (answ == 'n' || answ == 'N');
    }

}
