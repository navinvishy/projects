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
public class CompositeAttribute extends ComplexAttribute {
    private String name;
    private AttributeList attributes;
    public CompositeAttribute(String name, AttributeList al){
        this.name = name;
        this.attributes = al;
    }
    public CompositeAttribute(String name, List<Attribute> al){
        this.name = name;
        this.attributes = new AttributeList(al);
    }
    public AttributeList getAttributes(){
        return this.attributes;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(name).append("(").append(this.attributes.toString()).append(")");
        return s.toString();
    }
    
}
