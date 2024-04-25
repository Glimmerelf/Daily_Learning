/**
 * @author Glimmer
 * @version v1.0
 * @ClassName ArithmeticOperator
 * @Description 演示算术运算符的作用
 * @CreateTime 2024/4/25 14:08
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
//        /的使用
        System.out.println(10 / 4); // 从数学角度来说，结果应该是2.5，但在Java中，结果是2，因为整数除法会自动向下取整
        System.out.println(10.0 / 4);// 结果是2.5，因为其中一个操作数是浮点数
        double d = 10 / 4; // 结果是2.0，因为变量d被声明为double类型
        System.out.println(d);// 输出2.0

//        % 取模，取余
//        在%的本质，看一个公式 a % b = a - a / b * b
//        -10 % 3 = -10 - (-10) / 3 * 3 = -10 + 9 = -1
//        10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
//        -10 % -3 = (-10) - (-10) / (-3) * (-3) = -10 + 9 = -1
        System.out.println(10 % 3); // 结果是1，因为10除以3的余数是1
        System.out.println(-10 % 3); // 结果是-1，因为-10除以3的余数是-1
        System.out.println(10 % -3);// 结果是1，因为10除以-3的余数是1
        System.out.println(-10 % -3);// 结果是-1，因为-10除以-3的余数是-1

//        ++的使用
        int i = 10;
        i++;// 自增 等价于i = i + 1;=> i = 11
        ++i;// 自增 等价于i = i + 1;=> i = 12
        System.out.println("i=" + i);// 输出i的值，应该是12
/*
        作为表达式使用
        前++:++i先自增后赋值
        后++:i++先赋值后自增
 */
        int j = 8;
//        int k = ++j;//等价 j = j + 1;k = j;k = 9;j = 9;
        int k = j++;//等价 j = j + 1;k = j;k = 8;j = 9;
        System.out.println("k=" + k + "j=" + j);// 输出k和j的值
//        --,+,-,*:是一个道理,可以类推
    }
}
