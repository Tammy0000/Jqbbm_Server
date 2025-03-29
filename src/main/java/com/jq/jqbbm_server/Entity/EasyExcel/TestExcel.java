package com.jq.jqbbm_server.Entity.EasyExcel;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Tammy
 * @date 2025/3/29 上午10:50
 * @description  Excel测试类
 */
@Data
@Accessors(chain = true)
public class TestExcel{
    @ExcelProperty("姓名")
    private String name;

    @ExcelProperty("年龄")
    private Integer age;

    @ExcelProperty("性别")
    private String sex;

    @ExcelProperty("地址")
    private String address;
}
