package kr.hs.sdh.toast.repository;

import kr.hs.sdh.toast.entity.BankBook;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.MappedTypes;

import java.util.Set;
import java.util.UUID;

@Mapper
public interface BankBookRepository {

    String FIND_BY_ID = "kr.hs.sdh.toast.repository.BankBookRepository.findById";
    String BANK_BOOK = "kr.hs.sdh.toast.repository.BankBookRepository.bankBook";

    @ConstructorArgs(value = {
        @Arg(column = "bb_uuid", name = "uuid", id = true),
        @Arg(column = "bb_name", name = "name"),
        @Arg(column = "bb_deposit_type", name = "depositType"),
        @Arg(column = "bb_withdrawal", name = "isWithdrawal"),
        @Arg(column = "bb_open_date", name = "openDateTime"),
        @Arg(column = "bb_close_date", name = "closeDateTime"),
        @Arg(column = "bb_interest_rate", name = "interestRate"),
        @Arg(column = "bb_other_fess", name = "otherFess")
    })
    @Results(id = "bankBook")
    @Select(value = "")
    BankBook bankBookMapping();

    /**
     * 은행에 등록된 통장 목록을 중복없이 조회합니다.
     *
     * @param bankUUID 은행 구분 고유값('BANK.b_uuid' 컬럼의 데이터)
     * @return 은행의 통장 목록
     */
    @ResultMap(value = "bankBook")
    @Results(id = "findAllByBankId")
    @Select(value = "SELECT * FROM BANK_BOOK WHERE b_uuid = #{bankUUID}")
    Set<BankBook> findAllByBankId(final UUID bankUUID);

    @ResultMap(value = "bankBook")
    @Results(id = "findById")
    @Select(value = "SELECT * FROM BANK_BOOK WHERE bb_uuid = #{bankBookUUID}")
    BankBook findById(final UUID bankBookUUID);

}