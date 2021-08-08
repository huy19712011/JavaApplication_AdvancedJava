/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflections;

import java.lang.reflect.Constructor;

class MyClass {

    public MyClass() {
        System.out.println("MyClass object created !!!");
    }

    public MyClass(String str) {
        System.out.println("Constructor with string parameter");
    }

    public MyClass(Integer[] intergers) {
        System.out.println("Constructor with integer array");
    }
}

//class MyClass {
//
//    public MyClass() {
//    }
//
//    public MyClass(int x) {
//    }
//
//    public MyClass(String s, Integer[] integers) {
//    }
//}
/**
 *
 * @author huynq
 */


public class ReflectionDemo2 {

    public static void main(String[] args) throws Exception {

        //
        Class<?> objClass = Class.forName("reflections.MyClass");
        System.out.println(objClass);

        //
        System.out.println(objClass.getConstructor());
        System.out.println(objClass.getConstructor(String.class));
        System.out.println(objClass.getConstructor(Integer[].class));


        //
        Class<MyClass> c = MyClass.class;
        System.out.println(c);

        Constructor<MyClass> constructor = c.getConstructor();
        System.out.println("Constructor without arguments: " + constructor);

        Constructor<MyClass> constructor1 = c.getConstructor(String.class);
        System.out.println("Constructor with string parameter: " + constructor1);

        Constructor<MyClass> constructor2 = c.getConstructor(Integer[].class);
        System.out.println("Constructor with interger array: " + constructor2);

    }

}






