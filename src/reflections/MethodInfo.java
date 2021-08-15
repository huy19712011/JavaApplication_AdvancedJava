/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *
 * @author huynq
 */
public class MethodInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Entity entity = new Entity(10, "id");

        Class<? extends Entity> aClass = entity.getClass();

        // all public methods and in super class
        Method[] methods = aClass.getMethods();
        for (var method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("-----------------------");

        // all methods
        Method[] declaredMethods = aClass.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));
        for (var declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
            System.out.println(declaredMethod.toString());
        }

        System.out.println("-----------------------");

        // get method setVal
        Method setVal = aClass.getMethod("setVal", int.class);
        // if method is private => getDec then setAccessible(true)
        //aClass.getDeclaredMethod("setVal", int.class);
        //setVal.setAccessible(true);

        // now call this method
        setVal.invoke(entity, 100);

        // get method getVal for test
        Method getVal = aClass.getMethod("getVal", (Class<?>[]) null);
        // call getVal to test
        System.out.println(getVal.invoke(entity, (Object[]) null)); // 100

    }

}
