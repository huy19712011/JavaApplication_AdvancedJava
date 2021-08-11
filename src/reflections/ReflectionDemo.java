/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflections;

import java.lang.reflect.Constructor;

//class MyClassV2 {
//
//    public MyClassV2() {
//        System.out.println("MyClassV2 object created !!!");
//    }
//
//    public MyClassV2(String str) {
//        System.out.println("Constructor with string parameter");
//    }
//}

//class MyClassV2 {
//
//    public MyClassV2() {
//    }
//
//    public MyClassV2(int x) {
//    }
//
//    public MyClassV2(String s, Integer[] integers) {
//    }
//}
/**
 *
 * @author huynq
 */

/*
public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException {

        //MyClass objMyClass = new MyClassV2(); // error because private constructor
        //
        Class<?> objClass = Class.forName("reflections.MyClassV2");
        System.out.println(objClass);

        //
        Constructor<?> declaredConstructor = objClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        //MyClass name = (MyClassV2) declaredConstructor.newInstance();
        MyClassV2 obj = (MyClassV2) declaredConstructor.newInstance();

        //
        Class<MyClass> c = MyClassV2.class;
        System.out.println(c);

        Constructor<MyClass> constructor = c.getConstructor();
        System.out.println("Constructor without arguments: " + constructor);

        Constructor<MyClass> constructor1 = c.getConstructor(String.class);
        System.out.println("Constructor with string parameter: " + constructor1);

    }

}
*/



class MyClassV2 {

    private MyClassV2() {
        System.out.println("MyClass object created!");
    }

}

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        //MyClass obj = new MyClassV2(); // error because private constructor

        // create object
        Class<?> myClass = Class.forName("reflections.MyClass");

        // get constructor
        Constructor<?> declaredConstructor = myClass.getDeclaredConstructor();

        // set modifier for constructor to public
        declaredConstructor.setAccessible(true);

        // now get instance via constructor
        MyClassV2 newInstance = (MyClassV2) declaredConstructor.newInstance();
        System.out.println(newInstance);

    }

}


