package aunth.service;



import aunth.Repository.UserRepository;
import aunth.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;


    @Override
    public void save(User user) {
        user.setPassword(user.getPassword());
        userRepository.save(user);
        logger.info(String.format("Create new user - %s - in system",user.getUsername()));
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
