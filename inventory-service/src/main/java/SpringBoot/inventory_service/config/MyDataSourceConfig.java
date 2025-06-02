package SpringBoot.inventory_service.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@ConditionalOnProperty(name="app.datasource.enabled",havingValue = "true",matchIfMissing = false)
@Configuration
public class MyDataSourceConfig {
    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create().url("jdbc:mysql://localhost:3306/mydb")
                .username("root")
                .password("Deepak@9951")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();


    }
}
