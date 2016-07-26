package Structure;

import java.util.Iterator;

public class MessageIterator implements Iterator<MessageNode> {
    private MessageNode iterableNode;

    public MessageIterator(MessageNode firstNode) {
        iterableNode = firstNode;
    }

    public boolean hasNext() {
        return (iterableNode!=null);
    }

    public MessageNode next() {
        MessageNode tempNode = iterableNode;
        iterableNode = iterableNode.getNext();
        return tempNode;
    }
}