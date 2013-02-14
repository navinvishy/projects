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
public class ComplexAttributeInstances {
    protected List<ComplexAttributeInstance> instances;
    public ComplexAttributeInstances(List<ComplexAttributeInstance> l){
        this.instances = l;
    }
    public ComplexAttributeInstances(ComplexAttributeInstance a){
        ArrayList<ComplexAttributeInstance> l = new ArrayList<ComplexAttributeInstance>();
        l.add(a);
        this.instances = l;
    }    
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(ComplexAttributeInstance i : instances){
            s.append(i.toString()).append("\n");
        }
        return s.toString();
    }
}
