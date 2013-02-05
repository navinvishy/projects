import com.google.protobuf.*;
public class PersonDecorator extends Decorator {

	protected PersonDecorator(Message m){
		super(m);
	}
	
	public Boolean equals(Message m){
		Boolean nameEqual;
		Boolean idEqual;
		Boolean emailEqual;
		Boolean phoneEqual;
		Boolean aSubB = null;
		Boolean bSubA = null;
		Boolean foundEqual = false;
		
		nameEqual = ((AddressBookProtos.Person) this.message).getName().equals(((AddressBookProtos.Person) m).getName());
		emailEqual = ((AddressBookProtos.Person) this.message).getEmail().equals(((AddressBookProtos.Person) m).getEmail());
		idEqual = ((AddressBookProtos.Person) this.message).getId() == ((AddressBookProtos.Person) m).getId();
		/*
		 * Check if the first phone list is a subset of the second phone list
		 */
		for(Message phone : ((AddressBookProtos.Person) this.message).getPhoneList()){
			foundEqual = false;
			for(Message otherPhone : ((AddressBookProtos.Person) m).getPhoneList()){
				PhoneDecorator phoneDec = new PhoneDecorator(phone);
				PhoneDecorator otherPhoneDec = new PhoneDecorator(otherPhone);
				if(phoneDec.equals(otherPhoneDec.message)){
					foundEqual = true;
				}
			}
			if(aSubB == null && foundEqual){
				aSubB = true;
			}
			else if(aSubB == null && !foundEqual){
				aSubB = false;
			}	
			else {
				aSubB = aSubB && foundEqual;
			}
		}
		/*
		 * Check if the second phone list is a subset of the first phone list
		 */
		for(Message phone : ((AddressBookProtos.Person) m).getPhoneList()){
			foundEqual = false;
			for(Message otherPhone : ((AddressBookProtos.Person) this.message).getPhoneList()){
				PhoneDecorator phoneDec = new PhoneDecorator(phone);
				PhoneDecorator otherPhoneDec = new PhoneDecorator(otherPhone);
				if(phoneDec.equals(otherPhoneDec.message)){
					foundEqual = true;
				}
			}
			if(bSubA == null && foundEqual){
				bSubA = true;
			}
			else if(bSubA == null && !foundEqual){
				bSubA = false;
			}	
			else {
				bSubA = bSubA && foundEqual;
			}			
		}	
		phoneEqual = aSubB && bSubA;
		return nameEqual && idEqual && emailEqual && phoneEqual;	
	}
}
