/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author huynq
 */
public class AccountException extends Exception {

    public AccountException(Exception cause) {
        super(cause);
    }
}
