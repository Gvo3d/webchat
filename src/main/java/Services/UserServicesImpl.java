package Services;

import Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServicesImpl implements UserServices {
    ArrayList<User> userData = new ArrayList();
    private static int usercounter=0;

    public boolean addUser(User user) {
        if (!userData.contains(user)) {
            userData.add(user);
            return true;
        } else return false;
    }

    public User createUser(String name, String password) {
        return new User(usercounter++, name, password);
    }

    public boolean deleteUser(int id) {
        int tempSearch = getUserNumberById(id);
        if (tempSearch==0) {
            return false;
        } else {
            userData.set(tempSearch, null);
            return true;
        }
    }

    public boolean passwordConfirmation(int id, String pass) {
        User tempUser = getUserById(id);
        if (tempUser==null) {
            return false;
        } else {
            if (tempUser.getPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }

    private User getUserById(int id){
        int tempSearch = getUserNumberById(id);
        if (tempSearch!=0){
            return userData.get(tempSearch);
        }
        else return null;
    }

    private int getUserNumberById(int id){
        for (int i=0; i<userData.size(); i++){
            if (userData.get(i).getId()==id){
                return i;
            }
        }
        return 0;
    }

    public List<User> getUserList() {
        ArrayList<User> resultList = new ArrayList();
        resultList.addAll(userData);
        return resultList;
    }

}
