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

        User user = new Instructor(10);

        Utils.printUser(new User(10));
        Utils.printUser(new Instructor(10));

        var users = new GenericList<User>();
        Utils.printUsers(users);

        var users1 = new GenericList<Instructor>();
        // Utils.printUsers(users1); // error


    }

}
