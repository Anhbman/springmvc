package com.sun.controller;

import com.sun.entity.User;
import com.sun.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
public class HelloController implements InitializingBean {
    @Autowired
    UserService userService;
    @GetMapping(path = "/hello")
    public String greeting(ModelMap model){
        return "greet";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Create HelloController");
    }
}
