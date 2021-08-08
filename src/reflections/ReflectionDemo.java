/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflections;

import java.lang.reflect.Constructor;

//class MyClass {
//
//    public MyClass() {
//        System.out.println("MyClass object created !!!");
//    }
//
//    public MyClass(String str) {
//        System.out.println("Constructor with string parameter");
//    }
//}

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

/*
public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException {

        //MyClass objMyClass = new MyClass(); // error because private constructor
        //
        Class<?> objClass = Class.forName("reflections.MyClass");
        System.out.println(objClass);

        //
        Constructor<?> declaredConstructor = objClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        //MyClass name = (MyClass) declaredConstructor.newInstance();
        MyClass obj = (MyClass) declaredConstructor.newInstance();

        //
        Class<MyClass> c = MyClass.class;
        System.out.println(c);

        Constructor<MyClass> constructor = c.getConstructor();
        System.out.println("Constructor without arguments: " + constructor);

        Constructor<MyClass> constructor1 = c.getConstructor(String.class);
        System.out.println("Constructor with string parameter: " + constructor1);

    }

}
*/



class MyClass {

    private MyClass() {
        System.out.println("MyClass object created!");
    }

}

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        //MyClass obj = new MyClass(); // error because private constructor

        // create object
        Class<?> myClass = Class.forName("reflections.MyClass");

        // get constructor
        Constructor<?> declaredConstructor = myClass.getDeclaredConstructor();

        // set modifier for constructor to public
        declaredConstructor.setAccessible(true);

        // now get instance via constructor
        MyClass newInstance = (MyClass) declaredConstructor.newInstance();
        System.out.println(newInstance);

    }

}


