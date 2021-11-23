package org.martynas.blogapp.controller;

import org.martynas.blogapp.model.Post;
import org.martynas.blogapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@Controller
public class ContactsController {


    @GetMapping("/contacts")
    public String stock(Model model) {
        model.addAttribute("title","Контакты");

        return "contacts";
    }

}