package kr.hs.sdh.toast.entity;

import java.time.LocalDateTime;

public class BankBook {
    private final String bk_uuid;
    private final String bk_name;
    private final float bk_int_rate;
    private final boolean bk_withdrawal;
    private final LocalDateTime bk_reg_st_date;
    private final LocalDateTime bk_reg_ed_date;
    private final String b_uuid;

    public BankBook(String bk_uuid, String bk_name, float bk_int_rate, boolean bk_withdrawal, LocalDateTime bk_reg_st_date, LocalDateTime bk_reg_ed_date, String b_uuid) {
        this.bk_uuid = bk_uuid;
        this.bk_name = bk_name;
        this.bk_int_rate = bk_int_rate;
        this.bk_withdrawal = bk_withdrawal;
        this.bk_reg_st_date = bk_reg_st_date;
        this.bk_reg_ed_date = bk_reg_ed_date;
        this.b_uuid = b_uuid;
    }

    public String getBk_uuid() {
        return bk_uuid;
    }

    public String getBk_name() {
        return bk_name;
    }

    public float getBk_int_rate() {
        return bk_int_rate;
    }

    public boolean isBk_withdrawal() {
        return bk_withdrawal;
    }

    public LocalDateTime getBk_reg_st_date() {
        return bk_reg_st_date;
    }

    public LocalDateTime getBk_reg_ed_date() {
        return bk_reg_ed_date;
    }

    public String getB_uuid() {
        return b_uuid;
    }
}
