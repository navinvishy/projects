/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complexattributeparser;

/**
 *
 * @author navin
 */
public class ComplexAttributeProgram {
    private final String schemaLabel;
    private final String instanceLabel;
    private final String endLabel;
    private ComplexAttribute attribute;
    private ComplexAttributeInstances instances;
    public ComplexAttributeProgram(String schemaLabel, 
            ComplexAttribute attribute, String instanceLabel, ComplexAttributeInstances instances,
            String endLabel){
        this.schemaLabel = schemaLabel;
        this.instanceLabel = instanceLabel;
        this.attribute = attribute;
        this.instances = instances;
        this.endLabel = endLabel;
    }
    public String toString(){
        return schemaLabel + "\n" + attribute.toString() + "\n" + instanceLabel + "\n" + instances.toString() + endLabel; 
    }
}
