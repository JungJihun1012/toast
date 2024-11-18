package kr.hs.sdh.toast.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class BankAccountHistory {
    private final LocalDateTime bah_trans_date;
    private final String ba_number;
    private final String ba_target_number;
    private final String bah_memo;
    private final int bah_amount;
    private final int bah_bef_amount;
    private final UUID bah_type;

    public BankAccountHistory(LocalDateTime bah_trans_date, String ba_number, String ba_target_number, String bah_memo, int bah_amount, int bah_bef_amount, UUID bah_type) {
        this.bah_trans_date = bah_trans_date;
        this.ba_number = ba_number;
        this.ba_target_number = ba_target_number;
        this.bah_memo = bah_memo;
        this.bah_amount = bah_amount;
        this.bah_bef_amount = bah_bef_amount;
        this.bah_type = bah_type;
    }

    public LocalDateTime getBah_trans_date() {
        return bah_trans_date;
    }

    public String getBa_number() {
        return ba_number;
    }

    public String getBa_target_number() {
        return ba_target_number;
    }

    public String getBah_memo() {
        return bah_memo;
    }

    public int getBah_amount() {
        return bah_amount;
    }

    public int getBah_bef_amount() {
        return bah_bef_amount;
    }

    public UUID getBah_type() {
        return bah_type;
    }
}
