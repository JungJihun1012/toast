package kr.hs.sdh.toast.entity;

import java.time.LocalDateTime;

public class BankAccount {

    private final String ba_uuid;
    private final String ba_name;
    private final LocalDateTime ba_reg_st_date;
    private final LocalDateTime ba_reg_ed_date;
    private final boolean ba_withdrawal;
    private final String bk_uuid;
    private final String bc_uuid;

    public BankAccount(String ba_uuid, String ba_name, LocalDateTime ba_reg_st_date, LocalDateTime ba_reg_ed_date, boolean ba_withdrawal, String bk_uuid, String bc_uuid) {
        this.ba_uuid = ba_uuid;
        this.ba_name = ba_name;
        this.ba_reg_st_date = ba_reg_st_date;
        this.ba_reg_ed_date = ba_reg_ed_date;
        this.ba_withdrawal = ba_withdrawal;
        this.bk_uuid = bk_uuid;
        this.bc_uuid = bc_uuid;
    }

    public String getBa_uuid() {
        return ba_uuid;
    }

    public String getBa_name() {
        return ba_name;
    }

    public LocalDateTime getBa_reg_st_date() {
        return ba_reg_st_date;
    }

    public LocalDateTime getBa_reg_ed_date() {
        return ba_reg_ed_date;
    }

    public boolean isBa_withdrawal() {
        return ba_withdrawal;
    }

    public String getBk_uuid() {
        return bk_uuid;
    }

    public String getBc_uuid() {
        return bc_uuid;
    }
}
