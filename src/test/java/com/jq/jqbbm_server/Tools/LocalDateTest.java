package com.jq.jqbbm_server.Tools;

import com.jq.jqbbm_server.Utils.DateCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

/**
 * @author Tammy
 * @date 2025/3/27 上午8:41
 */
@SpringBootTest
public class LocalDateTest {
    @Test
    public void test() {
        LocalDate localDate = DateCalculator.calculateFutureDate(365);
        System.out.println(localDate);
    }
}
