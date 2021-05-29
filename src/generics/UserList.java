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
public class UserList {

    private final User[] items = new User[10];
    private int count;

    public void add(User user) {
        items[count++] = user;
    }

    public User get(int index) {
        return items[index];
    }
}
