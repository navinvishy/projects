/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complexattributeparser;

/**
 *
 * @author navin
 */
public class SimpleAttribute extends Attribute {
    private String name;
    private String type;
    public SimpleAttribute(String name, String val){
        this.name = name;
        this.type = val;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s = s.append(this.name).append(":").append(this.type);
        return s.toString();
    }
}
