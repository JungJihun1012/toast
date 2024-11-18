package kr.hs.sdh.toast.entity;

public class BankCustomer {

    private final String bc_uuid;
    private final String bc_name;
    private final String bc_email;
    private final String bc_contact;
    private final String bc_address;

    public BankCustomer(String bc_uuid, String bc_name, String bc_email, String bc_contact, String bc_address) {
        this.bc_uuid = bc_uuid;
        this.bc_name = bc_name;
        this.bc_email = bc_email;
        this.bc_contact = bc_contact;
        this.bc_address = bc_address;
    }

    public String getBc_uuid() {
        return bc_uuid;
    }

    public String getBc_name() {
        return bc_name;
    }

    public String getBc_email() {
        return bc_email;
    }

    public String getBc_contact() {
        return bc_contact;
    }

    public String getBc_address() {
        return bc_address;
    }
}
