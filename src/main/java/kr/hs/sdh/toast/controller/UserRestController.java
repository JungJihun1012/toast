package kr.hs.sdh.toast.controller;

import kr.hs.sdh.toast.entity.Customer;
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
        public Customer login(@RequestBody Customer user) {
            return this.userService.getId(user.getId(), user.getPassword());
        }

    }
