package Structure;

import Model.Message;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class MessageNode{
    private Message message;
    private MessageNode next;

    public static MessageNode getCopy(MessageNode node){
        return new MessageNode(node.getMessage(), node.getNext());
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public MessageNode getNext() {
        return next;
    }

    public void setNext(MessageNode next) {
        this.next = next;
    }

    public MessageNode(Message message, MessageNode next) {
        this.message = message;
        this.next = next;
    }


}
