/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annotations;

import java.util.ArrayList;

class Parent {
    public void m1() {
        System.out.println("m1 Parent Implementation");
    }

    //@Deprecated
    public void m2(int a) {
        System.out.println("m2 Parent Implementation, a is " + a);
    }

}

/**
 *
 * @author huynq
 */
public class GeneralPurpose extends Parent {

    // 1
    @Override
    //public void m1(int i) { // will not work
    public void m1() {
        System.out.println("m1 Child Implementation");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 2
        @SuppressWarnings("unused")
        int a = 10;

        @SuppressWarnings({"rawtypes", "unused"}) // ..., "all"
        ArrayList aList = new ArrayList();

        //
        GeneralPurpose generalPurpose = new GeneralPurpose();
        generalPurpose.m2(a);

    }

}

//
@FunctionalInterface
interface MyFunctionalInterface {
    public void method();

    //public void anotheMethod();// error
}





