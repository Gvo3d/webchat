package Structure;

import Model.Message;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public interface MessageQueue {

    public void addMessage(Message message);

    public List<Message>getMessageList();

    public void clearMessageList();

}
