package com.sugarlife.web;

import com.sugarlife.domain.service.SugarLifeService;
import com.sugarlife.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/userQuery")
public class SugarLifeServiceController {

    @Autowired
    private SugarLifeService sugarLifeService;

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm() {
        return "userQuery";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@RequestParam("userName") String userName, Model model) {
        User user;
        if (userName != null) {
            user = sugarLifeService.findUserOrNull(userName);
            model.addAttribute("user", user);
        }
        return "userQuery";

    }

}
