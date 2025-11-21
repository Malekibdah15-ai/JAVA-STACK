package org.example.bookclub.Service;

import org.example.bookclub.Repository.UserRepo;
import org.example.bookclub.models.Login;
import org.example.bookclub.models.User;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User register(User newUser, BindingResult result) {
        Optional<User> user = userRepo.findByEmail(newUser.getEmail());
        if(user.isPresent()) {
            result.rejectValue("email", "unique", "Email already exists");
        }

        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("password", "password", "Passwords do not match");
        }
        if(result.hasErrors()) {
            return null;
        }
        String hashedpw = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashedpw);

        return newUser = userRepo.save(newUser);
    }


    public User login(Login newLogin , BindingResult result) {
        if (result.hasErrors()) {
            return null;
        }
        Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        if (!potentialUser.isPresent()) {
            result.rejectValue("email", "unique", "Email already exists");
            return null;
        }
        User user = potentialUser.get();

        if (!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "password", "Passwords do not match");
            return null;
        }
        return user;

    }

    public User getById(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        if(optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }
    }


}
