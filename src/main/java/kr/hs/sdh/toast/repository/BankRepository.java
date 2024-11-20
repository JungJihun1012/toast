package kr.hs.sdh.toast.repository;

import kr.hs.sdh.toast.entity.Bank;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BankRepository {

    @ConstructorArgs(value = {
        @Arg(column = "b_uuid", name = "uuid", id = true),
        @Arg(column = "b_name", name = "name"),
        @Arg(column = "b_founder", name = "founder"),
        @Arg(column = "b_sector", name = "sector"),
        @Arg(column = "b_code", name = "code"),
        @Arg(column = "b_open_date", name = "openDateTime")
    })
    @Results(id = "bank")
    @Select(value = "")
    Bank bankMapping();

}