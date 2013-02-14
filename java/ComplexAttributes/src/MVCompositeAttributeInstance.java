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
public class MVCompositeAttributeInstance extends ManyValuedAttributeInstance {
    protected List<CompositeAttributeInstance> instances;
    public MVCompositeAttributeInstance(List<CompositeAttributeInstance> l){
        this.instances = l;
    }
    public MVCompositeAttributeInstance(CompositeAttributeInstance a){
        ArrayList<CompositeAttributeInstance> l = new ArrayList<CompositeAttributeInstance>();
        l.add(a);
        this.instances = l;
    }    
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(CompositeAttributeInstance i : instances){
            s.append(i.toString()).append(",");
        }
        return s.toString();        
    }    
}
