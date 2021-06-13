/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaAndFunctionalInterfaces_02;

/**
 *
 * @author huynq
 */
public class Employee {

    private String name;

    public Employee() {
        System.out.println("Empty Constructor");
    }

    public Employee(String name) {
        System.out.println("Name Constructor");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }



}
