/**
 * @author Glimmer
 * @version v1.0
 * @ClassName day1.java
 * @Description  Java基础
 * @CreateTime  2024/4/25 02:14
 */
public class Java_Basics {
    public static void main(String[] args) {
        //\t :一个制表位，实现对齐的功能
        System.out.println("北京\t天津\t上海");
        //\n :换行符
        System.out.println("java\nday1\ntest");
        //\\ :一个\
        System.out.println("c:\\windows\\system32\\cmd.exe");
        //\" :一个"
        System.out.println("\"好好学习\"");
        //\' :一个'
        System.out.println("\'天天向上\'");
        //\r :表示一个回车符
        //清空前面的内容输出后面的
        System.out.println("努力学习中\r认真");
        System.out.println("书名\t作者 \t价格\t销量\n三国\t罗贯中\t120\t1000");
        float num1 = 1.1F;
        double num2 = 1.1;
        double num3 = .123;//等价0.123
        System.out.println(5.12e2);//5.12是deuble类型，所以值为512.0
        System.out.println(5.12e-2);//0.0512
        double num4 = 2.1234567851;
        float num5 = 2.1234567851F;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        double num6 = 2.7;
        double num7 = 8.1 / 3;
        System.out.println(num6);
        System.out.println(num7);//接近2.7的一个小数，而不是2.7
        //对运算的结果的小数进行相等判断
        //错误写法
        if (num6 == num7) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
        //正确的写法
        //以两个数的差值的绝对值，在某个精度范围类判断
        if (Math.abs(num6 - num7) < 0.000001) {
            System.out.println("差值非常小，到我的规定精度，认为相等...");
        }
        //num6-num7差值的绝对值
        System.out.println(Math.abs(num6 - num7));
        //字符类型
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '龚';
        char c4 = 97;//字符类型可以直接存放一个数字
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);//输出Unicode码对应的字符'a'
        //在Java中char的本质是一个整数，在输出时，是输出Unicode码对应的字符
        char c5 = 98;
        System.out.println(c5);//b

        char c6 = 'a';//输出'b'对应的数字
        System.out.println((int) c6);
        char c7 = '龚';
        System.out.println((int) c7);//40858
        char c8 = 40858;
        System.out.println(c8);//龚
        System.out.println('a'+10);//107
        char c9 = 'b'+1;//98+1 ==> 99
        System.out.println((int)c9);//99
        System.out.println(c9);//对应的字符 -> 编码表ASCII -> 99 -> c
        boolean isPass =true;
        if (isPass == true) {
            System.out.println("恭喜你，考试通过");
        }else {
            System.out.println("很遗憾，考试未通过");
        }
    }
}