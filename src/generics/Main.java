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

//        for (var item: list) // will not work!
        for (var item: list.items) {
            System.out.println(item);
        }

        list.items[0] = "A";
        int len = list.items.length;
    }

}
