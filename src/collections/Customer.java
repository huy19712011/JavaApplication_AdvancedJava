/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author huynq
 */
public class Customer implements Comparable<Customer>{

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer o) {

        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + '}';
    }

    


}
