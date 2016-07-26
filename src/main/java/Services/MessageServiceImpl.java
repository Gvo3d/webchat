package Services;

import Model.Message;
import Model.User;
import Structure.MessageQueueImpl;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class MessageServiceImpl implements MessageService {
    MessageQueueImpl messages = new MessageQueueImpl();
    private int messagesCount=0;

    public Message createMessage(User user, String text) {
        Message message = new Message(messagesCount, user, text);
        messagesCount++;
        return message;
    }

    public void addMessage(Message message) {
        messages.addMessage(message);
    }

    public List<Message> getMessageList() {
        return messages.getMessageList();
    }

    public int getMessageCount() {
        return messagesCount;
    }

    public int getMaximumMessageCapacity() {
        return MessageQueueImpl.getMaximumMessageCapacity();
    }

    public void setMaximumMessageCapacity(int capacity) {
        MessageQueueImpl.setMaximumMessageCapacity(capacity);
    }
}
