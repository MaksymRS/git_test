package academy.prog.lesson1;

import java.util.Scanner;
/**
 *Program that prints and asks my name
 * @author Maksym Rosputko
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Maksym Rosputko");
        System.out.println("Insert your first and last name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
    }
}