/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complexattributeparser;

/**
 *
 * @author navin
 */  

//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Feb 13 20:18:18 EST 2013
//----------------------------------------------------


/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Feb 13 20:18:18 EST 2013
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\022\007\000\002\002\004\000\002\003" +
    "\003\000\002\003\003\000\002\004\006\000\002\007\003" +
    "\000\002\007\005\000\002\002\003\000\002\002\003\000" +
    "\002\005\005\000\002\005\005\000\002\006\005\000\002" +
    "\006\005\000\002\012\003\000\002\012\004\000\002\011" +
    "\003\000\002\011\003\000\002\014\006\000\002\015\003" +
    "\000\002\015\005\000\002\016\003\000\002\016\003\000" +
    "\002\010\003\000\002\010\003\000\002\013\005\000\002" +
    "\021\003\000\002\021\003\000\002\017\003\000\002\017" +
    "\005\000\002\020\003\000\002\020\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\066\000\004\004\005\001\002\000\004\002\070\001" +
    "\002\000\006\007\007\013\006\001\002\000\004\007\051" +
    "\001\002\000\004\010\050\001\002\000\010\005\ufffe\011" +
    "\ufffe\012\ufffe\001\002\000\004\005\013\001\002\000\010" +
    "\005\uffff\011\uffff\012\uffff\001\002\000\006\007\016\013" +
    "\015\001\002\000\010\006\ufff4\007\016\013\015\001\002" +
    "\000\010\007\016\020\027\021\025\001\002\000\004\010" +
    "\023\001\002\000\014\006\ufff1\007\ufff1\011\ufff1\012\ufff1" +
    "\013\ufff1\001\002\000\004\006\022\001\002\000\014\006" +
    "\ufff2\007\ufff2\011\ufff2\012\ufff2\013\ufff2\001\002\000\004" +
    "\002\001\001\002\000\012\007\016\013\015\020\027\021" +
    "\025\001\002\000\004\011\034\001\002\000\010\011\uffea" +
    "\012\uffea\014\uffea\001\002\000\006\011\uffec\012\uffec\001" +
    "\002\000\010\011\uffeb\012\uffeb\014\uffeb\001\002\000\006" +
    "\011\uffed\012\uffed\001\002\000\006\011\uffef\012\032\001" +
    "\002\000\012\007\016\013\015\020\027\021\025\001\002" +
    "\000\004\011\uffee\001\002\000\016\006\ufff0\007\ufff0\011" +
    "\ufff0\012\ufff0\013\ufff0\014\ufff0\001\002\000\004\014\uffe8" +
    "\001\002\000\006\012\045\014\uffe6\001\002\000\004\014" +
    "\uffe7\001\002\000\004\014\044\001\002\000\006\012\042" +
    "\014\uffe4\001\002\000\004\007\016\001\002\000\004\014" +
    "\uffe3\001\002\000\014\006\uffe9\007\uffe9\011\uffe9\012\uffe9" +
    "\013\uffe9\001\002\000\006\020\027\021\025\001\002\000" +
    "\004\014\uffe5\001\002\000\004\006\ufff3\001\002\000\006" +
    "\007\051\013\006\001\002\000\006\010\050\015\061\001" +
    "\002\000\006\011\ufffa\012\ufffa\001\002\000\006\011\ufffc" +
    "\012\057\001\002\000\004\011\056\001\002\000\006\011" +
    "\ufff9\012\ufff9\001\002\000\012\005\ufffd\011\ufffd\012\ufffd" +
    "\014\ufffd\001\002\000\006\007\051\013\006\001\002\000" +
    "\004\011\ufffb\001\002\000\006\016\062\017\063\001\002" +
    "\000\010\011\ufff8\012\ufff8\014\ufff8\001\002\000\010\011" +
    "\ufff7\012\ufff7\014\ufff7\001\002\000\004\014\067\001\002" +
    "\000\004\014\066\001\002\000\010\005\ufff5\011\ufff5\012" +
    "\ufff5\001\002\000\010\005\ufff6\011\ufff6\012\ufff6\001\002" +
    "\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\066\000\004\022\003\001\001\000\002\001\001\000" +
    "\010\003\010\004\011\006\007\001\001\000\006\004\064" +
    "\005\063\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\011\013\012\017" +
    "\013\016\014\020\001\001\000\012\011\013\012\046\013" +
    "\016\014\020\001\001\000\014\010\035\014\040\017\034" +
    "\020\036\021\037\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\010\027\011\025\013\016\014\020\015\023\016" +
    "\030\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\016\010\027\011\025\013\016\014\020\015\032" +
    "\016\030\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\014\040\020\042\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\010\035" +
    "\017\045\001\001\000\002\001\001\000\002\001\001\000" +
    "\016\002\052\003\054\004\011\005\051\006\007\007\053" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\002\052\003\054\004\011\005\051\006\007\007" +
    "\057\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // mv_composite_attribute_instance ::= composite_attribute_instance COMMA mv_composite_attribute_instance 
            {
              MVCompositeAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		CompositeAttributeInstance a = (CompositeAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MVCompositeAttributeInstance l = (MVCompositeAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 l.instances.add(0,a); RESULT = l; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mv_composite_attribute_instance",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // mv_composite_attribute_instance ::= composite_attribute_instance 
            {
              MVCompositeAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		CompositeAttributeInstance a = (CompositeAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new MVCompositeAttributeInstance(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mv_composite_attribute_instance",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // mv_simple_attribute_instance ::= simple_attribute_instance COMMA mv_simple_attribute_instance 
            {
              MVSimpleAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		SimpleAttributeInstance a = (SimpleAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MVSimpleAttributeInstance l = (MVSimpleAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 l.instances.add(0,a); RESULT = l; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mv_simple_attribute_instance",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // mv_simple_attribute_instance ::= simple_attribute_instance 
            {
              MVSimpleAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		SimpleAttributeInstance a = (SimpleAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new MVSimpleAttributeInstance(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mv_simple_attribute_instance",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // manyvalued_attribute_instance ::= mv_composite_attribute_instance 
            {
              ManyValuedAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MVCompositeAttributeInstance a = (MVCompositeAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("manyvalued_attribute_instance",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // manyvalued_attribute_instance ::= mv_simple_attribute_instance 
            {
              ManyValuedAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MVSimpleAttributeInstance a = (MVSimpleAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("manyvalued_attribute_instance",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // multivalued_attribute_instance ::= LBRACE manyvalued_attribute_instance RBRACE 
            {
              MultiValuedAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ManyValuedAttributeInstance a = (ManyValuedAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new MultiValuedAttributeInstance(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("multivalued_attribute_instance",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // simple_attribute_instance ::= STRINGVAL 
            {
              SimpleAttributeInstance RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new SimpleAttributeInstance(v); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simple_attribute_instance",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // simple_attribute_instance ::= INTEGERVAL 
            {
              SimpleAttributeInstance RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer v = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new SimpleAttributeInstance(v); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simple_attribute_instance",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // attribute_instance ::= complex_attribute_instance 
            {
              AttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ComplexAttributeInstance a = (ComplexAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attribute_instance",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // attribute_instance ::= simple_attribute_instance 
            {
              AttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		SimpleAttributeInstance a = (SimpleAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attribute_instance",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // attribute_list_instance ::= attribute_instance COMMA attribute_list_instance 
            {
              AttributeListInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		AttributeInstance a = (AttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		AttributeListInstance l = (AttributeListInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 l.getAttributeInstances().add(0,a); RESULT = l; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attribute_list_instance",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // attribute_list_instance ::= attribute_instance 
            {
              AttributeListInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		AttributeInstance a = (AttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new AttributeListInstance(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attribute_list_instance",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // composite_attribute_instance ::= ATTRIBUTE LPAREN attribute_list_instance RPAREN 
            {
              CompositeAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		AttributeListInstance l = (AttributeListInstance)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new CompositeAttributeInstance(a,l); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("composite_attribute_instance",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // complex_attribute_instance ::= multivalued_attribute_instance 
            {
              ComplexAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MultiValuedAttributeInstance a = (MultiValuedAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("complex_attribute_instance",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // complex_attribute_instance ::= composite_attribute_instance 
            {
              ComplexAttributeInstance RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		CompositeAttributeInstance a = (CompositeAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("complex_attribute_instance",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // complex_attribute_instances ::= complex_attribute_instance complex_attribute_instances 
            {
              ComplexAttributeInstances RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ComplexAttributeInstance a = (ComplexAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ComplexAttributeInstances l = (ComplexAttributeInstances)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 l.instances.add(0,a); RESULT = l; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("complex_attribute_instances",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // complex_attribute_instances ::= complex_attribute_instance 
            {
              ComplexAttributeInstances RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ComplexAttributeInstance a = (ComplexAttributeInstance)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new ComplexAttributeInstances(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("complex_attribute_instances",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // multivalued_attribute ::= LBRACE composite_attribute RBRACE 
            {
              MultivaluedAttribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		CompositeAttribute a = (CompositeAttribute)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new MultivaluedAttribute(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("multivalued_attribute",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // multivalued_attribute ::= LBRACE simple_attribute RBRACE 
            {
              MultivaluedAttribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		SimpleAttribute a = (SimpleAttribute)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new MultivaluedAttribute(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("multivalued_attribute",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // simple_attribute ::= ATTRIBUTE COLON STRING 
            {
              SimpleAttribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new SimpleAttribute(a, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simple_attribute",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // simple_attribute ::= ATTRIBUTE COLON INTEGER 
            {
              SimpleAttribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new SimpleAttribute(a, i); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simple_attribute",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // attribute ::= complex_attribute 
            {
              Attribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ComplexAttribute a = (ComplexAttribute)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attribute",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // attribute ::= simple_attribute 
            {
              Attribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		SimpleAttribute a = (SimpleAttribute)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attribute",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // attribute_list ::= attribute COMMA attribute_list 
            {
              AttributeList RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Attribute a = (Attribute)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		AttributeList l = (AttributeList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 l.getAttributeList().add(0,a); RESULT = l; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attribute_list",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // attribute_list ::= attribute 
            {
              AttributeList RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Attribute a = (Attribute)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new AttributeList(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("attribute_list",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // composite_attribute ::= ATTRIBUTE LPAREN attribute_list RPAREN 
            {
              CompositeAttribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		AttributeList l = (AttributeList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new CompositeAttribute(a, l); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("composite_attribute",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // complex_attribute ::= multivalued_attribute 
            {
              ComplexAttribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MultivaluedAttribute a = (MultivaluedAttribute)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("complex_attribute",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // complex_attribute ::= composite_attribute 
            {
              ComplexAttribute RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		CompositeAttribute a = (CompositeAttribute)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("complex_attribute",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= complex_attribute_program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ComplexAttributeProgram start_val = (ComplexAttributeProgram)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // complex_attribute_program ::= SCHEMA complex_attribute INSTANCES complex_attribute_instances END 
            {
              ComplexAttributeProgram RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		ComplexAttribute a = (ComplexAttribute)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int ciright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ComplexAttributeInstances ci = (ComplexAttributeInstances)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 System.out.println("Number of CA instances in input file is: " + ci.instances.size() + "\n"); 
     System.out.println("CA Schema: " + a.toString());
     System.out.println("Instances in file: \n" + ci.toString());
     RESULT = new ComplexAttributeProgram(s,a,i,ci,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("complex_attribute_program",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
