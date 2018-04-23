package com.ldapps.expensemanagement.servicesImpl;

import com.ldapps.expensemanagement.domain.User;
import com.ldapps.expensemanagement.repositories.UserRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserServiceImplTest {

    UserServiceImpl userService;

    @Mock
    UserRepository userRepository;


    @Before
    public void setUp()throws Exception{
        MockitoAnnotations.initMocks(this);
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void getUsersTest() {
        User user = new User();
        HashSet usersData = new HashSet();
        usersData.add(user);

        when(userService.getUsers()).thenReturn(usersData);

        Set<User> users = userService.getUsers();
        assertEquals(users.size(), 1);
        verify(userRepository, times(1)).findAll();
        verify(userRepository, never()).findById(anyLong());
    }

    @Test
    public void findByIdTest() {
        User user = new User();
        user.setId(1l);
        Optional<User> userOptional = Optional.of(user);

        when(userRepository.findById(anyLong())).thenReturn(userOptional);

        User userReturned = userService.findById(1L);
        assertNotNull("Null user returned", userReturned);
        verify(userRepository, times(1)).findById(anyLong());
        verify(userRepository, never()).findAll();
    }

    @Test
    public void deleteByIdTest() {
    }

    @Test
    public void saveUserTest() {
    }
}