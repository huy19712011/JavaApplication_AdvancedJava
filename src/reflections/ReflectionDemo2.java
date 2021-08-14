/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflections;

import java.lang.reflect.Constructor;

class MyClassVersion2 {

    public MyClassVersion2() {
        System.out.println("MyClass object created !!!");
    }

    public MyClassVersion2(String str) {
        System.out.println("Constructor with string parameter");
    }

    public MyClassVersion2(Integer[] intergers) {
        System.out.println("Constructor with integer array");
    }
}

//class MyClassVersion2 {
//
//    public MyClassVersion2() {
//    }
//
//    public MyClassVersion2(int x) {
//    }
//
//    public MyClassVersion2(String s, Integer[] integers) {
//    }
//}
/**
 *
 * @author huynq
 */


public class ReflectionDemo2 {

    public static void main(String[] args) throws Exception {

        // create obj - Class (2 ways)
        //w1
        Class<?> obj = Class.forName("reflections.MyClassVersion2");
        System.out.println(obj);

        //w2
        Class<MyClassVersion2> objClass = MyClassVersion2.class;

        //
        System.out.println(objClass.getConstructor());
        System.out.println(objClass.getConstructor(String.class));
        System.out.println(objClass.getConstructor(Integer[].class));


        //
        Class<MyClassVersion2> c = MyClassVersion2.class;
        System.out.println(c);

        Constructor<MyClassVersion2> constructor = c.getConstructor();
        System.out.println("Constructor without arguments: " + constructor);

        Constructor<MyClassVersion2> constructor1 = c.getConstructor(String.class);
        System.out.println("Constructor with string parameter: " + constructor1);

        Constructor<MyClassVersion2> constructor2 = c.getConstructor(Integer[].class);
        System.out.println("Constructor with interger array: " + constructor2);

    }

}






