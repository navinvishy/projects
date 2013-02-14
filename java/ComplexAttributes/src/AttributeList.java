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
public class AttributeList {
    private List<Attribute> attributeList;
    public List<Attribute> getAttributeList(){
        return this.attributeList;
    }
    public AttributeList(List<Attribute> l){
        this.attributeList = l;
    }
    public AttributeList(Attribute a){
        ArrayList<Attribute> l = new ArrayList<Attribute>();
        l.add(a);
        this.attributeList = l;
    }    
    public void addAttribute(Attribute a){
        this.attributeList.add(a);
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        String delim="";
        for(Attribute a : attributeList){
            s.append(delim).append(a.toString());
            delim=",";
        }
        return s.toString();
    }
}
