import com.google.protobuf.*;
import java.util.*;
public class Proto2Json {
	public Map<String,JsonValue> constructJsonMap(Message msg){
		Map<String,JsonValue> jMap = new HashMap<String,JsonValue>();
		for(Descriptors.FieldDescriptor field : msg.getAllFields().keySet()){
			switch(field.getType()){
			case BOOL:
				jMap.put(field.getName(), new JsonValue((Boolean) msg.getField(field)));
				break;
			case INT32:
				jMap.put(field.getName(), new JsonValue((Integer) msg.getField(field)));
				break;
			case STRING:
				jMap.put(field.getName(), new JsonValue((String) msg.getField(field)));
				break;
			case ENUM:
				Descriptors.EnumValueDescriptor enu = (Descriptors.EnumValueDescriptor) msg.getField(field);
				jMap.put(field.getName(), new JsonValue(enu.getName()));
				break;
			case MESSAGE:
				if(field.isRepeated()){
					ArrayList<JsonValue> msgArray = new ArrayList<JsonValue>();
					List<Message> messages = (List<Message>) msg.getField(field);
					for(Message message : messages){
						msgArray.add(new JsonValue(constructJsonMap(message)));
					}
					jMap.put(field.getName(), new JsonValue(msgArray));
				}
				else {
					jMap.put(field.getName(), new JsonValue(constructJsonMap((Message) msg.getField(field))));
				}
				break;
			}
		}
		return jMap;
	}
	public static void main(String[] args){
		AddressBookProtos.Person.PhoneNumber phone = AddressBookProtos.Person.PhoneNumber.newBuilder()
														.setNumber("4046943678")
														.setType(AddressBookProtos.Person.PhoneType.MOBILE)
														.build();
		// Create a proto
		AddressBookProtos.Person p = AddressBookProtos.Person.newBuilder()
										.setName("Navin")
										.setId(1)
										.setEmail("navin.vish@gmail.com")
										.addPhone(phone)
										.addPhone(AddressBookProtos.Person.PhoneNumber.newBuilder().setNumber("4049067491").build())
										.addPhone(AddressBookProtos.Person.PhoneNumber.newBuilder().setNumber("91-9633122609").build())
										.build();
		// Convert it to a Json object
		Proto2Json j = new Proto2Json();
		System.out.println(new JsonMessage(j.constructJsonMap(p)).toString());
	}
}
