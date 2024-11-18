package kr.hs.sdh.toast.entity;

import java.time.LocalDateTime;

public class Bank {
    private final String b_uuid;
    private final String b_name;
    private final String b_rep;
    private final int b_sector;
    private final String b_code;
    private final LocalDateTime b_establish_date;

    public Bank(String b_uuid, String b_name, String b_rep, int b_sector, String b_code, LocalDateTime b_establish_date) {
        this.b_uuid = b_uuid;
        this.b_name = b_name;
        this.b_rep = b_rep;
        this.b_sector = b_sector;
        this.b_code = b_code;
        this.b_establish_date = b_establish_date;
    }

    public String getB_uuid() {
        return b_uuid;
    }

    public String getB_name() {
        return b_name;
    }

    public String getB_rep() {
        return b_rep;
    }

    public int getB_sector() {
        return b_sector;
    }

    public String getB_code() {
        return b_code;
    }

    public LocalDateTime getB_establish_date() {
        return b_establish_date;
    }
}
