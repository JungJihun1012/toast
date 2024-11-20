package kr.hs.sdh.toast.controller;

import kr.hs.sdh.toast.model.CustomerDetails;
import kr.hs.sdh.toast.service.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/login")
    private String userPage() {return "login";}

    @GetMapping(value = "/register")
    private String registerPage() {return "register";}

    @GetMapping(value = "/index")
    private String index(@AuthenticationPrincipal CustomerDetails user, Model model) {
        model.addAttribute("user", user);

        return "index";
    }
}
