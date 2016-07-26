package Services;

import Model.User;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public interface UserServices {

    public boolean addUser(User user);

    public User createUser(String name, String password);

    public boolean deleteUser(int id);

    public boolean passwordConfirmation(int id, String pass);

    public List getUserList();

}
