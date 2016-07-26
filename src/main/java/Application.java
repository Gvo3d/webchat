import Model.Message;
import Model.User;
import Services.MessageServiceImpl;
import Services.UserServicesImpl;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class Application {
    public static void main(String[] args) {
        MessageServiceImpl messages = new MessageServiceImpl();
        UserServicesImpl users = new UserServicesImpl();

        User tempUser = users.createUser("Admin", "password");
        User tempUser2 = users.createUser("User", "password1");
        users.addUser(tempUser);
        users.addUser(tempUser2);
        Message tempMessage = messages.createMessage(tempUser, "First Message");
        Message tempMessage2 = messages.createMessage(tempUser2, "User Message");
        Message tempMessage3 = messages.createMessage(tempUser, "Admin Message");
        messages.addMessage(tempMessage);
        messages.addMessage(tempMessage2);
        messages.addMessage(tempMessage3);

        List<Message> list = messages.getMessageList();
        for (Message mess:list){
            System.out.println(mess);
        }

        List<User> ulist = users.getUserList();
        for (User user:ulist){
            System.out.println(user);
        }
    }
}
