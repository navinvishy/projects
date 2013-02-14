/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complexattributeparser;
import java.util.*;
/**
 *
 * @author navin
 */
public class CompositeAttributeInstance extends ComplexAttributeInstance {
    private String name;
    private AttributeListInstance attributeInstances;
    public CompositeAttributeInstance(String name, AttributeListInstance l){
        this.name = name;
        this.attributeInstances = l;
    }
    public CompositeAttributeInstance(String name, List<AttributeInstance> l){
        this.name = name;
        this.attributeInstances = new AttributeListInstance(l);
    }
    public String toString(){
        return this.name + "(" + this.attributeInstances.toString() + ")";
    }
}
