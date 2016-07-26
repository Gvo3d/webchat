package Structure;

import Model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageQueueImpl implements MessageQueue {
    private static int maximumMessageCapacity = 100;
    private static int messageCounter = 0;
    private MessageNode firstNode;
    private MessageNode lastNode;



    @Override
    public void addMessage(Message message) {
        if (firstNode == null) {
            firstNode = createMessage(message);
            lastNode = firstNode;
            messageCounter++;
        } else if (messageCounter >= maximumMessageCapacity) {
            firstNode = firstNode.getNext();
            nodeCreating(message);
        } else {
            nodeCreating(message);
        }
    }

    @Override
    public List<Message> getMessageList() {
        List<Message> resultList = new ArrayList<>();
        for (MessageIterator iterator = new MessageIterator(firstNode); iterator.hasNext();){
            resultList.add(iterator.next().getMessage());
        }
        return resultList;
    }

    @Override
    public void clearMessageList() {
        firstNode = null;
        messageCounter=0;
    }

    private void nodeCreating(Message message){
        MessageNode node = createMessage(message);
        lastNode.setNext(node);
        lastNode = node;
        messageCounter++;
    }

    private MessageNode createMessage(Message message) {
        return new MessageNode(message, null);
    }

    public static int getMaximumMessageCapacity() {
        return maximumMessageCapacity;
    }

    public static void setMaximumMessageCapacity(int maximumMessageCapacity) {
        MessageQueueImpl.maximumMessageCapacity = maximumMessageCapacity;
    }

}
