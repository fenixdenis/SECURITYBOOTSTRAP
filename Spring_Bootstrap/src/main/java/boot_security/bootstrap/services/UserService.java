package boot_security.bootstrap.services;



import boot_security.bootstrap.models.User;

import java.util.List;
//Dao
public interface UserService {
    void addUser(User user);

    List<User> listUsers();

    User getUser(Long id);

    void editUser(Long id, User user);

    void deleteUser(Long id);

}
