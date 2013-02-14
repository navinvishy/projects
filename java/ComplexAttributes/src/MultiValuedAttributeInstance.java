/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complexattributeparser;

/**
 *
 * @author navin
 */
public class MultiValuedAttributeInstance extends ComplexAttributeInstance {
    protected ManyValuedAttributeInstance instance;
    public MultiValuedAttributeInstance(ManyValuedAttributeInstance i){
        this.instance = i;
    }
    public String toString(){
        return "{" + this.instance.toString() + "}";
    }
}
