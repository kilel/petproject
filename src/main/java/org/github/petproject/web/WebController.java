package org.github.petproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping({"/", "index.html"})
    public String main(Model model) {
        return "index";
    }
}
