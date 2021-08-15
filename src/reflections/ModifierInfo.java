/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author huynq
 */
public class ModifierInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchMethodException {

        Entity entity = new Entity(10, "id");

        Class<? extends Entity> aClass = entity.getClass();

        // working with class
        int modifiers = aClass.getModifiers();
        System.out.println(modifiers);

        int i = modifiers & Modifier.PUBLIC;
        System.out.println(i);

        // or another way
        System.out.println(Modifier.isPublic(i)); // true

        // or one more way using Modifier.toString()
        System.out.println(Modifier.toString(i)); // public

        // with methods
        Method method = aClass.getMethod("getVal");
        int methodModifiers = method.getModifiers();
        System.out.println(methodModifiers);

        // check
        System.out.println(methodModifiers & Modifier.PRIVATE); // 0
        System.out.println(methodModifiers & Modifier.PUBLIC); // 1

        // or another way
        System.out.println(Modifier.isPublic(methodModifiers)); // true

        // or one more way using Modifier.toString()
        System.out.println(Modifier.toString(methodModifiers)); // public

    }

}










