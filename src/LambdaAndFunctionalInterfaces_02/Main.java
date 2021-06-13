/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaAndFunctionalInterfaces_02;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // inner class
        MessageAble hello1 = new MessageAble() {
            @Override
            public Message getMessage(String message) {
                return new Message(message);
            }
        };
        hello1.getMessage("Hello World");

        // lambda expression
        MessageAble hello2 = message -> new Message(message);
        hello2.getMessage("Hello World");

        // method reference
        MessageAble hello3 = Message::new;
        hello3.getMessage("Hello World");
    }

}
