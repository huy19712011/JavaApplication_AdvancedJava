/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflections;

/**
 *
 * @author huynq
 */
public class Entity {

    private int val;
    public String type; // note: public field
    protected String protectedFieldForTestingOnly;

    public Entity(int val, String type) {
        this.val = val;
        this.type = type;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
