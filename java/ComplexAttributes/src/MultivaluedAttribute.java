/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complexattributeparser;

/**
 *
 * @author navin
 */
public class MultivaluedAttribute extends ComplexAttribute {
    private Attribute attribute;
    public MultivaluedAttribute(SimpleAttribute a){
        this.attribute = a;
    }
    public MultivaluedAttribute(CompositeAttribute a){
        this.attribute = a;
    }    
    public Attribute getAttribute(){
        return this.attribute;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("{").append(this.attribute.toString()).append("}");
         return s.toString();
    }
    
}
