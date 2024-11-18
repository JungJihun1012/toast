package kr.hs.sdh.toast.entity;

public class BankCustomerBridge {

    private final String b_uuid;
    private final String bc_uuid;

    public BankCustomerBridge(String b_uuid, String bc_uuid) {
        this.b_uuid = b_uuid;
        this.bc_uuid = bc_uuid;
    }

    public String getB_uuid() {
        return b_uuid;
    }

    public String getBc_uuid() {
        return bc_uuid;
    }
}
