package kr.hs.sdh.toast.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 'BANK_BOOK' 테이블의 데이터를 담는 클래스
 *
 * @since 2023-11-18
 * @version 0.0.1
 */
public final class BankBook {

    /**
     * 통장 구분 고유값 (Mapped to 'BANK_BOOK.bb_uuid')
     */
    private final UUID uuid;

    /**
     * 통장 이름 (Mapped to 'BANK_BOOK.bb_name')
     */
    private final String name;

    /**
     * 통장 예금 종류 (Mapped to 'BANK_BOOK.bb_deposit_type')
     */
    private final String depositType;

    /**
     * 통장 출금 가능 여부 (Mapped to 'BANK_BOOK.bb_withdrawal')
     */
    private final boolean isWithdrawal;

    /**
     * 통장 가입 가능일자 (Mapped to 'BANK_BOOK.bb_open_date')
     */
    private final LocalDateTime openDateTime;

    /**
     * 통장 가입 마감일자 (Mapped to 'BANK_BOOK.bb_close_date')
     */
    private final LocalDateTime closeDateTime;

    /**
     * 통장 금리 (Mapped to 'BANK_BOOK.bb_interest_rate')
     */
    private final BigDecimal interestRate;

    /**
     * 통장 타 은행 수수료 (Mapped to 'BANK_BOOK.bb_other_fess')
     */
    private final int otherFess;

    /**
     * {@link BankBook} 클래스의 생성자
     *
     * @param uuid 통장 구분 고유값
     * @param name 통장 이름
     * @param depositType 통장 예금 종류
     * @param isWithdrawal 통장 출금 가능 여부
     * @param openDateTime 통장 가입 가능일자
     * @param closeDateTime 통장 가입 마감일자
     * @param interestRate 통장 금리
     * @param otherFess 통장 타 은행 수수료
     */
    public BankBook(
        final UUID uuid,
        final String name,
        final String depositType,
        final boolean isWithdrawal,
        final LocalDateTime openDateTime,
        final LocalDateTime closeDateTime,
        final BigDecimal interestRate,
        final int otherFess
    ) {
        this.uuid = uuid;
        this.name = name;
        this.depositType = depositType;
        this.isWithdrawal = isWithdrawal;
        this.openDateTime = openDateTime;
        this.closeDateTime = closeDateTime;
        this.interestRate = interestRate;
        this.otherFess = otherFess;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getDepositType() {
        return this.depositType;
    }

    public boolean isWithdrawal() {
        return this.isWithdrawal;
    }

    public LocalDateTime getOpenDateTime() {
        return this.openDateTime;
    }

    public LocalDateTime getCloseDateTime() {
        return this.closeDateTime;
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public int getOtherFess() {
        return this.otherFess;
    }

    @Override
    public boolean equals(final Object object) {
        if (object != null) {
            if (this == object) {
                return true;
            }
            if (object instanceof final BankBook bankBook) {
                return this.uuid.equals(bankBook.uuid);
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.uuid.hashCode();
    }

}