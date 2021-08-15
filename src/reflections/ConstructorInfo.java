/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 *
 * @author huynq
 */
public class ConstructorInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Class<?> aClass = Class.forName("reflections.Entity");

        // get public constructors
        Constructor<?>[] constructors = aClass.getConstructors();
        for (var constructor: constructors) {
            System.out.println(constructor);
        }
        System.out.println("---------------------------------------------------");

        // all constructors
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (var declaredConstructor: declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        // create constructor
        Constructor<?> publicConstructor
                = aClass.getConstructor(int.class, String.class);

        // create obj using constructor
        Entity e = (Entity) publicConstructor.newInstance(10, "StudentId");
        System.out.println(e.getVal() + " " + e.getType());

        // working with all constructors
        Constructor<?>[] declaredPrivateConstructors
                = aClass.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));

        // get particular private constructor
        Constructor<?> declaredPrivateConstructor
                = aClass.getDeclaredConstructor();
        declaredPrivateConstructor.setAccessible(true);
        Entity defaultEntity = (Entity) declaredPrivateConstructor.newInstance();
        System.out.println(defaultEntity.getVal() + " " + defaultEntity.getType());

    }

}
