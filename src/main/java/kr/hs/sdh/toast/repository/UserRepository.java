package kr.hs.sdh.toast.repository;

import kr.hs.sdh.toast.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {
    @Select("select * from customer where c_id = #{userId}")
    User findById(String id);
    @Insert("insert into customer(c_id, c_password, c_name, c_email, c_contact, c_address) values(#{userId}, #{userPassword}, #{userName}, #{userEmail}, #{userContact}, #{userAddress})")
    void saveUser(User user);
}
