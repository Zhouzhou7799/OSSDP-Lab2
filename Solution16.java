import java.util.*;

/*
 * @Description
 * 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 */
class Solution16 {

//      修改思路
//    1、nums.length 是一个属性而不是方法。
//    2、数组元素赋值时应该使用方括号 [] 而不是圆括号 ()。
//    3、比较函数的实现是基于字符串拼接后比较大小，而不是数学计算。
//    4、使用 StringBuilder 时，初始化应使用等号 = 而不是 ===。
//    5、在返回结果之前检查数组是否全为零。
//    6、字符串拼接的方法调用应该是 toString() 而不是 toString。


    public String largestNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return "";
        }

        //nums.length 是一个属性而不是方法。

        // 将 int 数组转换为 Integer 数组
        Integer[] numsArr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsArr[i] = nums[i];
        }


        // 自定义比较器，用于决定两个数字拼接后的顺序
        Arrays.sort(numsArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                String xy = x.toString() + y.toString();
                String yx = y.toString() + x.toString();
                return yx.compareTo(xy);
            }
        });

        // 如果最大的数是 0，则直接返回 "0"，避免输出以多个 0 开头的情况
        if (numsArr[0] == 0) {
            return "0";
        }

        // 构建最终的结果字符串
        StringBuilder ret =new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }
        return ret.toString();
    }
}
