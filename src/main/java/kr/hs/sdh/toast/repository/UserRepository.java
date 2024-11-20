package kr.hs.sdh.toast.repository;

import kr.hs.sdh.toast.entity.Customer;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserRepository {

    @Results(id = "customer", value = {
            @Result(column = "c_id", property = "id"),
            @Result(column = "c_password", property = "password"),
            @Result(column = "c_alias", property = "alias"),
            @Result(column = "p_uuid", property = "people", one = @One(resultMap = PeopleRepository.PEOPLE))
    })
    @Select(value = "")
    Customer customer();

    @ResultMap(value = "customer")
    @Select("select * from customer as c inner join people as p on c.p_uuid = p.p_uuid where c_id = #{userId}")
    Customer findById(String id);
}
