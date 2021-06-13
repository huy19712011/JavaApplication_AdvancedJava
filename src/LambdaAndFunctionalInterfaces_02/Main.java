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
        /* //javaTpoint: constructor reference
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
         */

        // using anonymous inner class
        EmployeeEmpty empEmpty = new EmployeeEmpty() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };

        EmployeeWithName empWithName = new EmployeeWithName() {
            @Override
            public Employee get(String name) {
                return new Employee(name);
            }
        };

        // using method (constructor) reference
        EmployeeEmpty empEmpty2 = Employee::new;
        EmployeeWithName empWithName2 = Employee::new;

        // using lambda expressions
        EmployeeEmpty empEmpty3 = () -> new Employee();
        EmployeeWithName empWithName3 = (name) -> new Employee(name);


        System.out.println("Constructor isn't called yet");

        System.out.println(empEmpty.get());
        System.out.println(empEmpty2.get());
        System.out.println(empEmpty3.get());


        System.out.println(empWithName.get("Java"));
        System.out.println(empWithName2.get("java"));
        System.out.println(empWithName3.get("java"));

    }

}
