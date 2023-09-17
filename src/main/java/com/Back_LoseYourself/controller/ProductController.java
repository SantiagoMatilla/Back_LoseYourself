package com.Back_LoseYourself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
}
