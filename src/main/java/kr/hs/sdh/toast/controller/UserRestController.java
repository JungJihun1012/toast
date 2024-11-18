package kr.hs.sdh.toast.controller;

import kr.hs.sdh.toast.entity.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import kr.hs.sdh.toast.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
        public User login(@RequestBody User user) {
            return this.userService.getId(user.getUserId(), user.getUserPassword());
        }

    @PostMapping("/register-user")
        public void register(User user) {
            this.userService.saveRegister(user);
        }
    }
