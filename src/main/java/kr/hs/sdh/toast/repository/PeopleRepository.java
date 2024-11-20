package kr.hs.sdh.toast.repository;

import kr.hs.sdh.toast.entity.People;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PeopleRepository {

    String PEOPLE = "kr.hs.sdh.toast.repository.PeopleRepository.people";

    @ConstructorArgs({
            @Arg(column = "p_uuid", name = "uuid"),
            @Arg(column = "p_name", name = "name"),
            @Arg(column = "p_english_name", name = "englishName"),
            @Arg(column = "p_identity", name = "identity"),
            @Arg(column = "p_email", name = "email"),
            @Arg(column = "p_contact", name = "contact"),
            @Arg(column = "p_address", name = "address"),
    })
    @Results(id = "people")
    @Select(value = "")
    People people();

}
