/**
 * @author Glimmer
 * @version v1.0
 * @ClassName InverseOperator
 * @Description !取反^逻辑异或
 * @CreateTime 2024/4/26 18:38
 */
public class InverseOperator {
    public static void main(String[] args) {
//        !操作是取反 True 变为 False，False 变为 True
        System.out.println(60 > 20);// 输出 True
        System.out.println(!(60 > 20));// 输出 False
//        a^b 逻辑异或，当a和b不同时，结果为True，否则为False
        boolean a = (10 > 1) ^ (3 > 5);
        System.out.println("a = " + a);// 输出 True
        boolean b = (10 > 1) ^ (3 < 5);
        System.out.println("b = " + b);// 输出 False
    }
}
