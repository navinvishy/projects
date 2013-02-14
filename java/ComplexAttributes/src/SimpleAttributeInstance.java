/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complexattributeparser;

/**
 *
 * @author navin
 */
public class SimpleAttributeInstance extends AttributeInstance {
    private String stringValue;
    private Integer intValue;
    public SimpleAttributeInstance(String s){
        this.stringValue = s;
    }
    public SimpleAttributeInstance(Integer i){
        this.intValue = i;
    }
    public String toString(){
        String s = null;
        if(this.stringValue != null){
            s = this.stringValue;
        }
        if(this.intValue != null){
            s = this.intValue.toString();
        }        
        return s;
    }
}
