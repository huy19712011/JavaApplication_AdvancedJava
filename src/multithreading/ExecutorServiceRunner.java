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
public class ExecutorServiceRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // only one thread
        ExecutorService executorService
                = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        // copy task3
        System.out.println("Task 3 kicked off");
        for (int i = 301; i <= 399; ++i) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 3 Done");

        System.out.print("\nMain Done");

        //shutdown
        executorService.shutdown();
    }

}
