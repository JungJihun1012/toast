package kr.hs.sdh.toast.entity;

import java.time.LocalDateTime;

public class BankACcountHistory {

    private final long amount;
    private final long beforeAmount;
    private final String memo;
    private final String type;
    private final LocalDateTime transDateTime;

    public BankACcountHistory(long amount, long beforeAmount, String memo, String type, LocalDateTime transDateTime) {
        this.amount = amount;
        this.beforeAmount = beforeAmount;
        this.memo = memo;
        this.type = type;
        this.transDateTime = transDateTime;
    }


    public long getAmount() {
        return amount;
    }

    public long getBeforeAmount() {
        return beforeAmount;
    }

    public String getMemo() {
        return memo;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTransDateTime() {
        return transDateTime;
    }
}
