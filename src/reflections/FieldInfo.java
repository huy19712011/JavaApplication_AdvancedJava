/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflections;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 *
 * @author huynq
 */
public class FieldInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{

        Entity entity = new Entity(10, "id");
        System.out.println(entity);

        Class<? extends Entity> aEntityClass = entity.getClass();
        System.out.println(aEntityClass);

        // get all public fields in this class and its super class
        Field[] fields = aEntityClass.getFields();
        System.out.println(Arrays.toString(fields));

        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Field field = aEntityClass.getField("type");
        System.out.println(field);

        // all fields (public + private + protected) in this class
        Field[] declaredFields = aEntityClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        for (var declaredField: declaredFields) {
            System.out.println(declaredField.getName());
        }

        // get, set field
        //aEntityClass.getField("type");
        //field.set(aEntityClass, "RollNo"); // error
        //System.out.println(aEntityClass.getTypeName());


    }

}
