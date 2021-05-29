/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // int => Integer
        // float => Float
        // boolean => Boolean
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(2); // boxing Integer.valueOf(2)
        int number = numbers.get(0); // unboxing

    }

}
