/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author huynq
 */
public class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("KeyValuePair{key=").append(key);
//        sb.append(", value=").append(value);
//        sb.append('}');
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return "key = " + key + "; " + "value = " + value;
    }




}
