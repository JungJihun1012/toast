package kr.hs.sdh.toast.repository;

import kr.hs.sdh.toast.entity.Bank;
import kr.hs.sdh.toast.entity.BankCustomer;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.UUID;

@Mapper
public interface BankCustomerRepository {

    @Select(value = "select * from bank_customer as bc INNER JOIN bank_customer_bridge AS bcb ON bc.bc_uuid = bcb.bc_uuid WHERE bcb.b_uuid = #{b_uuid}")
    List<BankCustomer> findByUuid(UUID id);

    @Results({
            @Result(column = "bc_uuid",property = "bankAccounts", many = @Many(select = "kr.hs.sdh.toast.repository.BankAccountRepository.findAllByCustomerId"))
    })
    @Select(value = "select * from bank_customer where bc_identity = #{identity}")
    BankCustomer findByIdentity(String identity);

}
