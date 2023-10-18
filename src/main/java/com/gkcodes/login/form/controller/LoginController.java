package com.gkcodes.login.form.controller;

    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gkcodes.login.form.model.UserLogin;
import com.gkcodes.login.form.repository.UserRepository;

@Controller
public class LoginController {

    private final UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/form")
        public String form(){
            return "form";
        
    }

    @PostMapping("/form")
    public String loginProcess(@RequestParam String name , @RequestParam String password){
          UserLogin userLogin = new UserLogin();
          userLogin.setName(name);
          userLogin.setPassword(password);
          userRepository.save(userLogin);
           return "redirect:/form?success=true";
    }

}

    
