package com.itsm.controller;

import com.itsm.entity.User;
import com.itsm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//import com.itsm.service.SecurityService;

@Controller(value = "users")
public class UserController {

    @Autowired
    private UserService userService;

//    @Autowired
//    private SecurityService securityService;

//    @Autowired
//    private UserValidator userValidator;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String userList(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);

        return "users";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
//        userValidator.validate(userForm, bindingResult);
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//        userService.save(userForm);

//        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

//        return "redirect:/main";
//    }

//    public String login(Model model, String error, String logout) {
//        if (error != null) {
//            model.addAttribute("error", "Username or password is incorrect.");
//        }
//        if (logout != null) {
//            model.addAttribute("message", "Logged out successfully.");
//        }
//        return "login";
//    }

//    @RequestMapping(value = {"/", "/main"}, method = RequestMethod.GET)
//    public String main(Model model) {
//        return "main";
//    }
//
//    @RequestMapping(value = "/librarian", method = RequestMethod.GET)
//    public String librarian(Model model) {
//        return "librarian";
//    }

//    @RequestMapping(value = "/addNewReader", method = RequestMethod.POST)
//    public String addReader(@ModelAttribute("user") User user) {
//        this.userService.insert(user);
//        return "redirect:/users";
//    }

}