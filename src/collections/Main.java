/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "email3"));
        customers.add(new Customer("a", "email2"));
        customers.add(new Customer("c", "email1"));

        Collections.sort(customers, new EmailComparator());

        System.out.println(customers);
    }

}
