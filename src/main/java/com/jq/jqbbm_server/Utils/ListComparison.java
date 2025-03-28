package com.jq.jqbbm_server.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Tammy
 * @date 2025/3/28 下午4:37
 */
public class ListComparison {
    public static List<Long> getDifferentElements(List<Long> list1, List<Long> list2) {
        Set<Long> set1 = new HashSet<>(list1);
        Set<Long> set2 = new HashSet<>(list2);

        // 找出 list1 中有而 list2 中没有的元素
        Set<Long> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2); // 合并两个集合
        Set<Long> commonSet = new HashSet<>(set1);
        commonSet.retainAll(set2); // 取交集
        resultSet.removeAll(commonSet); // 删除交集部分，剩下的就是不相同的元素

        return new ArrayList<>(resultSet); // 返回一个 List<Long>
    }
}
