package com.jq.jqbbm_server.Config.DataSource;

import com.jq.jqbbm_server.Config.AppConfig;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.jq.jqbbm_server.Dao.Primary",
        entityManagerFactoryRef = "primaryEntityManagerFactory",
        transactionManagerRef = "primaryTransactionManager"
)
@Slf4j
@RequiredArgsConstructor
public class PrimaryDataSourceConfig {

    private final AppConfig appconfig;

    @Bean(name = "primaryDataSource")
    public DataSource primaryDataSource() {
        DataSource dataSource = DataSourceBuilder.create()
                .url(appconfig.getPrimaryUrl()) // 手动设置 URL
                .username(appconfig.getPrimaryUser()) // 手动设置用户名
                .password(appconfig.getPrimaryPassword()) // 手动设置密码
                .driverClassName(appconfig.getPrimaryClassName()) // 手动设置驱动类
                .build();
        log.info("PrimaryDataSourceConfig: {}", dataSource.toString());
        return dataSource;
    }

    @Bean(name = "primaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean primaryEntityManagerFactory(
            @Qualifier("primaryDataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("com.jq.jqbbm_server.Entity.Primary");
        //设置方言
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");

        //JPA配置
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "none");
        properties.setProperty("hibernate.show_sql", "true");

        em.setJpaVendorAdapter(adapter);
        em.setJpaProperties(properties);
        return em;
    }

    @Bean(name = "primaryTransactionManager")
    public PlatformTransactionManager primaryTransactionManager(
            @Qualifier("primaryEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
