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

        var list = new GenericList<Integer>();
        list.add(1);
        int number = list.get(0);

        var userList = new GenericList<User>();
        userList.add(new User());
        User user = userList.get(0);

    }

}
