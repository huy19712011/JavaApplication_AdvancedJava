/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.io.IOException;

/**
 *
 * @author huynq
 */
public class Account {

    public void deposit(float value) throws IOException {
        if (value <= 0)
//            throw new IllegalArgumentException();
            throw new IOException();
    }

}
