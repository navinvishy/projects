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
public class AttributeListInstance {
    private List<AttributeInstance> attributeInstances;
    public AttributeListInstance(List<AttributeInstance> l){
        this.attributeInstances = l;
    }
    public AttributeListInstance(AttributeInstance i){
        ArrayList<AttributeInstance> l = new ArrayList<AttributeInstance>();
        l.add(i);
        this.attributeInstances = l;
    }    
    public List<AttributeInstance> getAttributeInstances(){
        return this.attributeInstances;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        String delim="";
        for(AttributeInstance a : attributeInstances){
            s.append(delim).append(a.toString());
            delim = ",";
        }
        return s.toString();
    }
}
