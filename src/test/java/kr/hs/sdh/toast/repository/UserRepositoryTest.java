package kr.hs.sdh.toast.repository;

import kr.hs.sdh.toast.entity.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findById() {
        final Customer customer = this.userRepository.findById("yclee");

        Assertions.assertNotNull(customer, "사용자가 입력되지 않았습니다");
        Assertions.assertEquals("1234", customer.getPassword(), "사용자 정보가 올바르지 않습니다.");
    }
}