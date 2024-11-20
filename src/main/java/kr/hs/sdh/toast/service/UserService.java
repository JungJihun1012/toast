package kr.hs.sdh.toast.service;

import kr.hs.sdh.toast.entity.Customer;
import kr.hs.sdh.toast.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Customer getId (String id, String password) {
        return this.userRepository.findById(id);
    }

}
