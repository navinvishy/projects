import java.util.*;
/* 
 * A Json Value is one of:
 * <ul>
 * <li> a string
 * <li> a number
 * <li> an object (key/value pair with a string key)
 * <li> an array of values
 * <li> a boolean
 * <li> a null
 * </ul>
 */
public class JsonValue {
	private String string;
	private Integer number;
	private Map<String,JsonValue> object;
	private List<JsonValue> array;
	private Boolean bool;
	private JsonNull jsonNull;
	
	/*
	 * <p> Construct a JsonValue from a string
	 * @param the input String
	 */
	public JsonValue(String s){
		this.string = s;
	}
	/*
	 * <p> Construct a JsonValue from an integer
	 * @param the input Integer
	 */
	public JsonValue(Integer i){
		this.number = i;
	}
	/*
	 * <p> Construct a JsonValue from an object
	 * @param the input object
	 */
	public JsonValue(Map<String,JsonValue> o){
		this.object = o;
	}
	/*
	 * <p> Construct a JsonValue from an array
	 * @param the input array
	 */
	public JsonValue(Integer[] a){
		ArrayList<JsonValue> v = new ArrayList<JsonValue>();
		for(Integer elem : a){
			v.add(new JsonValue(elem));
		}
		this.array = v;
	}
	/*
	 * <p> Construct a JsonValue from an array of Json values
	 * @param the input array
	 */
	public JsonValue(ArrayList<JsonValue> a){
		this.array = a;
	}	
	public JsonValue(String[] a){
		ArrayList<JsonValue> v = new ArrayList<JsonValue>();
		for(String i : a){
			v.add(new JsonValue(i));
		}
		this.array = v;
	}	
	/*
	 * <p> Construct a JsonValue from a boolean array
	 * @param the input boolean
	 */
	public JsonValue(boolean[] b){
		ArrayList<JsonValue> v = new ArrayList<JsonValue>();
		for(Boolean i : b){
			v.add(new JsonValue(i));
		}
		this.array = v;
	}	
	/*
	 * <p> Construct a JsonValue from a boolean
	 * @param the input boolean
	 */
	public JsonValue(boolean b){
		this.bool = b;
	}		
	/*
	 * <p> Empty constructor returns a JsonNull
	 */
	public JsonValue(){
		this.jsonNull = new JsonValue.JsonNull();
	}
	/*
	 * <p> Convert a JsonValue to a string</p>
	 * @return the String version of the input
	 */
	public String toString(){
		StringBuilder s = new StringBuilder();
		if(this.bool != null){
			s.append(this.bool);
		}
		if(this.array != null){
			s.append(array.toString());
		}
		if(this.jsonNull != null){
			s.append(this.jsonNull.toString());
		}
		if(this.number != null){
			s.append(this.number.toString());
		}
		if(this.object != null){
			s.append("{ ");
			for(String k : this.object.keySet()){
				s.append(k).append(" : ").append(this.object.get(k));
			}
			s.append(" }");
		}
		if(this.string != null){
			s.append(this.string);
		}
		return s.toString();
	}
	/*
	 * A null JSON value
	 */ 
	class JsonNull {
		public JsonNull() {};
		public String toString(){
			return "NULL";
			}
		}
	}
