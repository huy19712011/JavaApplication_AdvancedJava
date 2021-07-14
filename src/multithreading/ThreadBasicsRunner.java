/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author huynq
 */
public class ThreadBasicsRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Multi Threading");

        // Task 1
        for (int i = 101; i <= 199; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 1 Done");

        // Task 2
        for (int i = 201; i <= 299; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 2 Done");

        // Task 3
        for (int i = 301; i <= 399; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 3 Done");

        System.out.print("\nMain Done");

    }

}
