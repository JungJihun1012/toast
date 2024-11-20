package kr.hs.sdh.toast.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BankCustomerRepositoryTest {

    @Autowired
    private BankCustomerRepository bankCustomerRepository;

    @Test
    void findByIdentity() {
    }
}