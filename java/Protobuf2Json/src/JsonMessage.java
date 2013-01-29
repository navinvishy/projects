import java.util.*;
/*
 * A JsonMessage is one of:
 * <ul>
 * <li> an object
 * <li> an array
 * <li> A JsonValue
 * </ul>
 */
public class JsonMessage {
	private Map<String,JsonValue> object;
	/*
	 * Construct a JsonMessage from an object
	 * @param the input object 
	 */
	public JsonMessage(Map<String,JsonValue> o){
		this.object = o;
	}
	public String toString(){
		StringBuilder s = new StringBuilder("{ ");
		for(String k : this.object.keySet()){
			s.append(k).append(" : ").append(this.object.get(k).toString()).append(", ");
		}
		return s.replace(s.length()-2,s.length()," }").toString();
	}
}