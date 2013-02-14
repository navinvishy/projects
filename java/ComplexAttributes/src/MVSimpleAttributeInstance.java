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
public class MVSimpleAttributeInstance extends ManyValuedAttributeInstance {
    protected List<SimpleAttributeInstance> instances;
    public MVSimpleAttributeInstance(List<SimpleAttributeInstance> l){
        this.instances = l;
    }
    public MVSimpleAttributeInstance(SimpleAttributeInstance a){
        ArrayList<SimpleAttributeInstance> l = new ArrayList<SimpleAttributeInstance>();
        l.add(a);
        this.instances = l;
    }    
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(SimpleAttributeInstance i : instances){
            s.append(i.toString()).append(",");
        }
        return s.toString();        
    }
}
