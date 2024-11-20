package kr.hs.sdh.toast.model;

import kr.hs.sdh.toast.entity.BankAccount;
import kr.hs.sdh.toast.entity.Customer;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;
import java.util.List;

public final class CustomerDetails extends User {
    private final String name;
    private final String identity;
    private final String email;
    private final String contact;
    private final String address;
    private final List<BankAccount> bankAccounts;

    public CustomerDetails (Customer customer, List<BankAccount> bankAccounts) {
        super(
                customer.getId(),
                customer.getPassword(),
                Collections.emptyList()
        );
        this.name = customer.getPeople().getName();
        this.identity = customer.getPeople().getIdentity();
        this.email = customer.getPeople().getEmail();
        this.contact = customer.getPeople().getContact();
        this.address = customer.getPeople().getAddress();
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public String getIdentity() {
        return identity;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

}
