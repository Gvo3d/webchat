package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class Message {

    private int messageId;
    private User user;
    private Date dateOfPost;
    private String text;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateOfPost() {
        return dateOfPost;
    }

    public Message(int messageId, User user, String text) {
        this.messageId = messageId;
        this.user = user;
        this.dateOfPost = new Date(System.currentTimeMillis());
        this.text = text;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpledate = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        return "Message{" +
                "messageId=" + messageId +
                ", user=" + user +
                ", dateOfPost=" + simpledate.format(dateOfPost) +
                ", text='" + text + '\'' +
                '}';
    }
}
