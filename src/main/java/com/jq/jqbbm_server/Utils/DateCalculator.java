package com.jq.jqbbm_server.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Tammy
 * @date 2025/3/26 下午5:13
 * 时间工具类
 */
public class DateCalculator {
    /**
     * 计算从今天开始往后多少天，返回相应的 LocalDate
     *
     * @param days 未来的天数
     * @return 计算后的 LocalDate
     */
    public static LocalDate calculateFutureDate(int days) {
        return LocalDate.now().plusDays(days);
    }

    /**
     * 计算从今天开始往前多少天，返回相应的 LocalDate
     *
     * @param days 过去的天数
     * @return 计算后的 LocalDate
     */
    public static LocalDate calculatePastDate(int days) {
        return LocalDate.now().minusDays(days);
    }

    /**
     * 计算输入日期距离今天有多少天
     *
     * @param date 输入的 LocalDate
     * @return 距离今天的天数
     */
    public static long daysBetweenTodayAndGivenDate(LocalDate date) {
        return ChronoUnit.DAYS.between(date, LocalDate.now());
    }

    /**
     * 将 LocalDateTime 转换为 LocalDate
     *
     * @param localDateTime 输入的 LocalDateTime
     * @return 转换后的 LocalDate
     */
    public static LocalDate convertToLocalDate(LocalDateTime localDateTime) {
        return localDateTime.toLocalDate();
    }

    /**
     * 将 LocalDate 转换为字符串
     *
     * @param localDate 输入的 LocalDate
     * @param format 格式化字符串，例如 "yyyy-MM-dd"
     * @return 转换后的字符串
     */
    public static String localDateToString(LocalDate localDate, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return localDate.format(formatter);
    }

    /**
     * 将 LocalDateTime 转换为字符串
     *
     * @param localDateTime 输入的 LocalDateTime
     * @param format 格式化字符串，例如 "yyyy-MM-dd HH:mm:ss"
     * @return 转换后的字符串
     */
    public static String localDateTimeToString(LocalDateTime localDateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return localDateTime.format(formatter);
    }

    /**
     * 将字符串转换为 LocalDate
     *
     * @param dateStr 输入的日期字符串
     * @param format 日期格式，例如 "yyyy-MM-dd"
     * @return 转换后的 LocalDate
     */
    public static LocalDate stringToLocalDate(String dateStr, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(dateStr, formatter);
    }

    /**
     * 将字符串转换为 LocalDateTime
     *
     * @param dateTimeStr 输入的日期时间字符串
     * @param format 日期时间格式，例如 "yyyy-MM-dd HH:mm:ss"
     * @return 转换后的 LocalDateTime
     */
    public static LocalDateTime stringToLocalDateTime(String dateTimeStr, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(dateTimeStr, formatter);
    }
}
