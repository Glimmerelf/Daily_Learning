/**
 * @author Glimmer
 * @version v1.0
 * @ClassName AssignOperator
 * @Description 演示赋值运算符
 * @CreateTime 2024/8/20 18:00
 */
public class AssignOperator {
    public static void main(String[] args) {
        int n1 = 10;
        n1 += 4;// n1 = n1 + 4;
        System.out.println(n1);// 14
        n1 /= 3;// n1 = n1 / 3;
        System.out.println(n1);// 4
        //复合赋值运算符会进类型转换
        byte b = 3;
        //b = b + 2;// 编译错误，复合赋值运算符会强制进行类型转换
        b += 2;// 等价b = (byte)(b + 2);类型转换
        b++;// 等价b = (byte)(b + 1);类型转换
    }
}
