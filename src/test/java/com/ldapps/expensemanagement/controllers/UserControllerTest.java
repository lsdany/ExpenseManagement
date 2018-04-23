package com.ldapps.expensemanagement.controllers;

import com.ldapps.expensemanagement.domain.User;
import com.ldapps.expensemanagement.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @author luisdany pernillo
 */
public class UserControllerTest {

    @Mock
    UserService userService;

    @Mock
    Model model;

    UserController userController;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        userController = new UserController(userService);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }



    @Test
    public void getUsers() throws Exception{
        //given
//        Set<User> users = new HashSet<>();
//        users.add(new User());
//
//        User user = new User();
//        user.setId(1L);
//
//        users.add(user);
//
//        when(userService.getUsers()).thenReturn(users);
//
//        ArgumentCaptor<Set<User>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
//
//        //when
//        String viewName = userController.getIndexPage(model);
//
//
//        //then
//        assertEquals("index", viewName);
//        verify(recipeService, times(1)).getRecipes();
//        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
//        Set<User> setInController = argumentCaptor.getValue();
//        assertEquals(2, setInController.size());
    }


}