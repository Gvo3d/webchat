package Services;

import Model.Message;
import Model.User;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public interface MessageService {

    public void addMessage(Message message);

    public Message createMessage(User user, String text);

    public List<Message> getMessageList();

    public int getMessageCount();

    public int getMaximumMessageCapacity();

    public void setMaximumMessageCapacity(int capacity);
}
