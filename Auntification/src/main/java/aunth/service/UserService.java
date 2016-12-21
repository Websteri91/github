package aunth.service;

import aunth.entity.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
