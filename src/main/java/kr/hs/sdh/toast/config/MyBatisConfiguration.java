package kr.hs.sdh.toast.config;

import kr.hs.sdh.toast.config.handler.UUIDTypeHandler;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.UUID;

@Configuration
class MyBatisConfiguration {

    @Bean
    SqlSessionFactory sqlSessionFactory(final DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        final TypeHandler<UUID> uuidTypeHandler = new UUIDTypeHandler();

        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.addTypeHandlers(uuidTypeHandler);

        return sqlSessionFactoryBean.getObject();
    }

}