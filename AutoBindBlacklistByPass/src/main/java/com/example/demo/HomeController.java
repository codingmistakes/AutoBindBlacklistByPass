package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.*;
import com.example.demo.repository.*;

@Controller
public class HomeController {
 
    @InitBinder
    public void initBinder(WebDataBinder binder){
        // binder.setDisallowedFields(new String[]{"isadmin", "account.code", "account.amount"});
    }
    
    @RequestMapping(value="/")
    public String index(Model model) {
		UserRepository userRepository = new UserRepository();
        model.addAttribute("user", userRepository.FetchCurrent());
        return "index";
    }  

    @RequestMapping(value="/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("user") User user, Model model) {

    	// update the person in the database
    	UserRepository userRepository = new UserRepository();
    	userRepository.Update(user);
    	    	
        return "register";
    }  

    public String error() {   	
        return "error";
    }
}