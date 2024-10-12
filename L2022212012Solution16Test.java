import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class L2022212012Solution16Test {

    @Test
    public void testLargestNumber() {
        Solution16 solution = new Solution16();

        // 测试目的：验证正常情况下能否得到正确的最大数
        // 测试用例：[10, 2]
        int[] nums1 = {10, 2};
        assertEquals("210", solution.largestNumber(nums1));

        // 测试目的：验证多个数字的情况下能否得到正确的最大数
        // 测试用例：[3, 30, 34, 5, 9]
        int[] nums2 = {3, 30, 34, 5, 9};
        assertEquals("9534330", solution.largestNumber(nums2));

        // 测试目的：验证当所有数字都是0时的情况
        // 测试用例：[0, 0, 0, 0]
        int[] nums3 = {0, 0, 0, 0};
        assertEquals("0", solution.largestNumber(nums3));

        // 测试目的：验证只有一个数字的情况
        // 测试用例：[8]
        int[] nums4 = {8};
        assertEquals("8", solution.largestNumber(nums4));

        // 测试目的：验证包含重复数字的情况
        // 测试用例：[9, 99, 999, 9999]
        int[] nums5 = {9, 99, 999, 9999};
        assertEquals("9999999999", solution.largestNumber(nums5));
    }

    @Test
    public void testEdgeCases() {
        Solution16 solution = new Solution16();

        // 测试目的：验证空数组的情况
        // 测试用例：[]
        int[] emptyNums = {};
        assertEquals("", solution.largestNumber(emptyNums));

        // 测试目的：验证单个零的情况
        // 测试用例：[0]
        int[] singleZero = {0};
        assertEquals("0", solution.largestNumber(singleZero));
    }
}