/**
 * @author Glimmer
 * @version v1.0
 * @ClassName StringToBasicDetail
 * @Description 字符串转换为基本数据类型细节
 * @CreateTime 2024/4/25 12:28
 */
public class StringToBasicDetail {
    public static void main(String[] args) {
        String str = "hello";
        //转成int
        int n1 = Integer.parseInt(str); // 抛出NumberFormatException异常
        System.out.println(n1);
    }
}
