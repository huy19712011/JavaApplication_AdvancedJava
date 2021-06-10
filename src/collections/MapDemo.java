/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author huynq
 */
public class MapDemo {

    public static void show() {
//        List<Customer> customers = new ArrayList<>();
//
//        // find customer with email
//        // O(n)
//        // HashTable: O(1)
//        // Java: Maps
//        //var person = {name: "a"}
//        for (var customer: customers) {
//            if (customer.getEmail() == "email1")
//                System.out.println("Found");
//        }

        //Map
        Map<String, Customer> map = new HashMap<>();
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var customer = map.get("e1");
        System.out.println(customer);

        System.out.println(map.get("e10"));

        var unknown = new Customer("Unknown", "");
        System.out.println(map.getOrDefault("e30", unknown));

        //
        System.out.println(map.containsKey("e1"));

        //
        map.replace("e1", new Customer("AAA", "e1"));
        System.out.println(map);

        // not work with for each => using keySet()
        for (var key: map.keySet()) {
            System.out.println(key);
        }

        // using entrySet()
        for (var entry: map.entrySet()) {
            System.out.println(entry);
        }

        for (var entry: map.entrySet()) {
            System.out.println(entry.getValue());
        }

        // return collection of customers
        System.out.println(map.values());
        for (var c: map.values()) {
            System.out.println(c);
        }


    }
}












