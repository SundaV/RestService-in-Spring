package org.vijay.javabrains.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {
	private Map<Long, Message> messages=DatabaseClass.getAllmessage();
	
	
	public MessageService(){
		messages.put(1L, new Message(1L,"test","vijay"));
		messages.put(2L, new Message(2L,"test1","java"));
	}
public List<Message> getAllMessage(){
	/*Message msg=new Message(1L,"java","vijay");
	Message msg1=new Message(2L,"Rest","vijay");
	
	ArrayList<Message> al=new ArrayList<>();
	al.add(msg);
	al.add(msg1);
	return al;*/
	
	
	return new ArrayList<>(messages.values());
	
}

public Message getMessage(long id){
	
	return messages.get(id);
	
	
}
public Message addMessage(Message message){
	message.setId(messages.size()+1);
	messages.put(message.getId(), message);
	return message;
}


public Message updateMessage(Message message){
	if(message.getId()<=0){
		return  null;
	}
	messages.put(message.getId(), message);
	return message;
}

public Message removeMessage(long id){
	return messages.remove(id);
}
}
