package org.martynas.blogapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class LoginConroller {

    @GetMapping("/signin")
    public String login(Principal principal) {

        if (principal != null) {
            return "redirect:/";
        } else {
            return "login";
        }
    }
}
