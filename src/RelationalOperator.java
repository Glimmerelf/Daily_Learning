/**
 * @author Glimmer
 * @version v1.0
 * @ClassName RelationalOperators
 * @Description 演示关系运算符的作用
 * @CreateTime 2024/4/26 12:43
 */
public class RelationalOperator {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        System.out.println(a > b); // 输出 true
        System.out.println(a >= b); // 输出 true
        System.out.println(a <= b); // 输出 false
        System.out.println(a < b);// 输出 false
        System.out.println(a == b); // 输出 false
        System.out.println(a != b); // 输出 true
        boolean flag = a > b;// 关系运算符的结果是布尔值,可以赋值给布尔类型的变量
        System.out.println("flag的值为：" + flag);// 输出 true
    }
}
