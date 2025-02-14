package com.shankar.controller;

import com.shankar.model.HondaBike;
import com.shankar.service.HondaBikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


public class HomeController {
    @Autowired
    private HondaBikeService service;


}
