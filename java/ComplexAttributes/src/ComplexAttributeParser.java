/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complexattributeparser;
import java.io.*;

/**
 *
 * @author navin
 */
public class ComplexAttributeParser {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
  try {
    Lexer lexer = new Lexer(new FileReader("/home/navin/personal/projects/java/ComplexAttributes/complex_attributes.data"));
    java_cup.runtime.Symbol sym = null;
    parser p = new parser(lexer);
    //System.out.println(p.debug_parse());
    ComplexAttributeProgram result = (ComplexAttributeProgram) p.parse().value;
  }
  catch (Exception e) {
      System.out.println("Parse Error - Please fix and re-run");
        }
    }
}
