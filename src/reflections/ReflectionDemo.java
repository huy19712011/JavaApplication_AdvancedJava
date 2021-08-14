/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflections;

import java.lang.reflect.Constructor;

//class MyClassVersion2 {
//
//    public MyClassVersion2() {
//        System.out.println("MyClassVersion2 object created !!!");
//    }
//
//    public MyClassVersion2(String str) {
//        System.out.println("Constructor with string parameter");
//    }
//}

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

/*
public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException {

        //MyClass objMyClass = new MyClassVersion2(); // error because private constructor
        //
        Class<?> objClass = Class.forName("reflections.MyClassVersion2");
        System.out.println(objClass);

        //
        Constructor<?> declaredConstructor = objClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        //MyClass name = (MyClassVersion2) declaredConstructor.newInstance();
        MyClassVersion2 obj = (MyClassVersion2) declaredConstructor.newInstance();

        //
        Class<MyClass> c = MyClassVersion2.class;
        System.out.println(c);

        Constructor<MyClass> constructor = c.getConstructor();
        System.out.println("Constructor without arguments: " + constructor);

        Constructor<MyClass> constructor1 = c.getConstructor(String.class);
        System.out.println("Constructor with string parameter: " + constructor1);

    }

}
*/



class MyClassVersion2 {

    private MyClassVersion2() {
        System.out.println("MyClass object created!");
    }

}

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        //MyClass obj = new MyClassVersion2(); // error because private constructor

        // create object
        Class<?> myClass = Class.forName("reflections.MyClassVersion2");

        // get constructor
        Constructor<?> declaredConstructor = myClass.getDeclaredConstructor();

        // set modifier for constructor to public
        declaredConstructor.setAccessible(true);

        // now get instance via constructor
        MyClassVersion2 newInstance = (MyClassVersion2) declaredConstructor.newInstance();
        System.out.println(newInstance);

    }

}


