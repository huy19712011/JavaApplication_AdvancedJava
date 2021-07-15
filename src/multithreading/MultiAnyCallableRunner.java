/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author huynq
 */
public class MultiAnyCallableRunner {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService executorService
                = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(
                new CallableTask("Bkacad"),
                new CallableTask("Software"),
                new CallableTask("Network")
        );

        String result = executorService.invokeAny(tasks);

        System.out.println(result);

        executorService.shutdown();
    }

}
