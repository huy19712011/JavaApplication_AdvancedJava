/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author huynq
 */

class Task extends Thread {

    private int number;

    public Task(int number) {
        this.number = number;
    }


    @Override
    public void run() {

        System.out.println("Task " + number + " started...");

        // Task 1
        for (int i = number * 100; i <= number * 100 + 99; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask " + number +  " Done!");

    }
}


public class ExecutorServiceRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // multiple threads
        ExecutorService executorService
                = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));


        //shutdown
        executorService.shutdown();
    }

}
