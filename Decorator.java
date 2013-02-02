/*
 * A class whose only purpose is to provide an equals method that allows comparison
 * of two person protos
 */
import com.google.protobuf.*;
public abstract class Decorator {
	protected Message message;
	public abstract Boolean equals(Message m);
	public Decorator(Message m){
		this.message=m;
	}
}
