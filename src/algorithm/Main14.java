package algorithm;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 */
public class Main14 {

    public static String longestCommonPrefix(String[] strs)
    {
        if (strs.length == 0 || strs == null)
        {
            return "";
        }

        String str = strs[0];

        for (int i = 0; i < strs.length; i++)
        {
            if (strs[i].length() < str.length())
            {
                str = strs[i];
            }
        }

        return getStr(strs, str);

    }

    public static String getStr(String[] strs, String shortStr)
    {
        String s = shortStr;

        for (String string : strs)
        {
            if (!string.startsWith(shortStr))
            {
                s = shortStr.substring(0, shortStr.length() - 1);
            }
        }

        if (s.length() < shortStr.length())
        {
            return getStr(strs, s);
        }
        else
        {
            return s;
        }


    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(Main14.longestCommonPrefix(strs));
    }
}
