package com.stephanguimaraes.projetostephan.config;



import com.stephanguimaraes.projetostephan.entities.User;
import com.stephanguimaraes.projetostephan.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "stephan", "stephan.guimaraess@gmail.com","21965115410","864685840");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
