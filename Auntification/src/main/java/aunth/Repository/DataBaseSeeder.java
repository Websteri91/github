package aunth.Repository;


import aunth.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBaseSeeder implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DataBaseSeeder.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public DataBaseSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        List<User> userList = new ArrayList<>();
        userList.add(new User("user", "password"));
        userList.add(new User("webster", "webster"));
        userRepository.save(userList);
        logger.info("Add in data base simple users");

    }
}
