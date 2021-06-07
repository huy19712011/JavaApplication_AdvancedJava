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

        var list = new GenericList<String>();
        list.add("a");
        list.add("b");

        for (var item: list) {
            System.out.println(item);
        }
    }

}
