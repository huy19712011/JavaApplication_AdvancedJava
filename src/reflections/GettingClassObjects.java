/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reflections;

import java.util.Arrays;

/**
 *
 * @author huynq
 */
public class GettingClassObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        // 1. Class.forName()
        Class<?> obj1 = Class.forName("java.lang.String");
        Class<?> obj2 = Class.forName("java.lang.String");
        System.out.println(obj1 == obj2); // true, both (obj1,obj2) point to one address

        // 2. ClassName.class
        Class<?> obj3 = int.class;
        Class<?> obj4 = String.class;

        // 3. obj.getClass()
        MyClass obj5 = new MyClass();
        Class<? extends MyClass> newClass = obj5.getClass();
        System.out.println(obj5);
        System.out.println(newClass);

        // super class
        Class<?> superclass = newClass.getSuperclass();
        System.out.println(superclass);

        // interfaces
        Class<?>[] interfaces = newClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces));

        // getName()
        System.out.println(newClass.getName());


    }

}

class MyClass {

    public MyClass() {
        System.out.println("MyClass object created!");
    }

}
