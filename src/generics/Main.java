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
        var list = new MyList();
        list.add(1);
//        list.add(Integer.valueOf(1)); // boxing
        list.add("asd");
        list.add(new User());
//        System.out.println(list);

        int number = (int) list.get(0);
        int number1 = (int) list.get(1); // runtime error ClassCastException

        var userList = new UserList();
        userList.add(new User());
//        System.out.println(userList);
    }

}
