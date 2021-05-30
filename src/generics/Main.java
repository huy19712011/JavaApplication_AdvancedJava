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

        var max = Utils.max(1, 5);
        System.out.println(max);

        var user1 = new User(10);
        var user2 = new User(20);
        System.out.println(user1);
        System.out.println(user2);
        var maxUser = Utils.max(user1, user2);
        System.out.println(maxUser);

    }

}
