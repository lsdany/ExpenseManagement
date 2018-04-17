package com.ldapps.expensemanagement.servicesImpl;

import com.ldapps.expensemanagement.domain.User;
import com.ldapps.expensemanagement.repositories.UserRepository;
import com.ldapps.expensemanagement.services.UserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author luisdany
 * @date
 *
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> getUsers() {

        Set<User> users = new HashSet<>();
        userRepository.findAll().iterator().forEachRemaining(users :: add);
        return users;
    }

    @Override
    public User findById(Long id) {

        Optional<User> user = userRepository.findById(id);

        if(!user.isPresent()){
            throw  new RuntimeException("No hay estudiantes");
        }
        return user.get();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void saveUser(User user) {

        userRepository.save(user);

    }
}
