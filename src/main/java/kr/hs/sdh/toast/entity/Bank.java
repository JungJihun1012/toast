package kr.hs.sdh.toast.entity;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;

/**
 * 'BANK' 테이블의 데이터를 담는 클래스
 *
 * @since 2023-11-18
 * @version 0.0.1
 */
public final class Bank {

    /**
     * 은행 구분 고유값 (Mapped to 'BANK.b_uuid')
     */
    private final UUID uuid;

    /**
     * 은행 이름 (Mapped to 'BANK.b_name')
     */
    private final String name;

    /**
     * 은행 설립자 (Mapped to 'BANK.b_founder')
     */
    private final String founder;

    /**
     * 은행 금융권 (Mapped to 'BANK.b_sector')
     */
    private final String sector;

    /**
     * 은행 코드 (Mapped to 'BANK.b_code')
     */
    private final String code;

    /**
     * 은행 설립일자 (Mapped to 'BANK.b_open_date')
     */
    private final LocalDateTime openDateTime;

    private Set<BankBook> bankBooks;

    /**
     * {@link Bank} 클래스의 생성자
     *
     * @param uuid 은행 구분 고유값
     * @param name 은행 이름
     * @param founder 은행 설립자
     * @param sector 은행 금융권
     * @param code 은행 코드
     * @param openDateTime 은행 설립일자
     */
    public Bank(
        final UUID uuid,
        final String name,
        final String founder,
        final String sector,
        final String code,
        final LocalDateTime openDateTime
    ) {
        this.uuid = uuid;
        this.name = name;
        this.founder = founder;
        this.sector = sector;
        this.code = code;
        this.openDateTime = openDateTime;
        this.bankBooks = Collections.emptySet();
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getFounder() {
        return this.founder;
    }

    public String getSector() {
        return this.sector;
    }

    public String getCode() {
        return this.code;
    }

    public LocalDateTime getOpenDateTime() {
        return this.openDateTime;
    }

    public Set<BankBook> getBankBooks() {
        return this.bankBooks;
    }

    public void setBankBooks(Set<BankBook> bankBooks) {
        this.bankBooks = bankBooks;
    }

    @Override
    public boolean equals(final Object object) {
        if (object != null) {
            if (this == object) {
                return true;
            }

            if (object instanceof final Bank bank) {
                return this.uuid.equals(bank.uuid);
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.uuid.hashCode();
    }

}