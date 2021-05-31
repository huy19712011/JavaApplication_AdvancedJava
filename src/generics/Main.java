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

        Utils.print("first", 10, "test");

        var kvp = new KeyValuePair<String, String>("key123", "value123");
        System.out.println(kvp);

    }

}
