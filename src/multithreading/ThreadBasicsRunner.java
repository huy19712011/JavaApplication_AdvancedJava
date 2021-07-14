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
class Task1 extends Thread {

    @Override
    public void run() {

        System.out.println("Task1 started...");

        // Task 1
        for (int i = 101; i <= 199; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 1 Done");

    }
}

class Task2 implements Runnable {

    @Override
    public void run() {

        System.out.println("Task2 started...");

        // Task 2
        for (int i = 201; i <= 299; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 2 Done");
    }

}

public class ThreadBasicsRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Multi Threading");

        // Task 1
        System.out.println("Task 1 kicked off");
        Task1 task1 = new Task1();
        //task1.run();
        task1.start();

        // Task 2
        System.out.println("Task 2 kicked off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        // Task 3
        System.out.println("Task 3 kicked off");
        for (int i = 301; i <= 399; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 3 Done");

        System.out.print("\nMain Done");

    }

}
