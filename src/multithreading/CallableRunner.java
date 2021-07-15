/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.jar.Attributes;

/**
 *
 * @author huynq
 */
class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {

        Thread.sleep(1000);
        return "Hello " + name;
    }

}

public class CallableRunner {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService executorService
                = Executors.newFixedThreadPool(1);

        Future<String> welcomeFuture
                = executorService.submit(new CallableTask("Bkacad"));

        System.out.println("\nnew CallableTask(\"Bkacad\") executed");

        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);

        System.out.println("\nMain completed");
    }

}
