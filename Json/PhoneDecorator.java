import com.google.protobuf.*;
public class PhoneDecorator extends Decorator {
	
	protected PhoneDecorator(Message m){
		super(m);
	}	
	
	public Boolean equals(Message m){
		Boolean numberEquals;
		Boolean typeEquals;
		numberEquals = ((AddressBookProtos.Person.PhoneNumber)this.message).getNumber()
		.equals(((AddressBookProtos.Person.PhoneNumber)m).getNumber());
		typeEquals = ((AddressBookProtos.Person.PhoneNumber)this.message).getType().equals(((AddressBookProtos.Person.PhoneNumber)m).getType());
		return numberEquals && typeEquals;
	}
}
