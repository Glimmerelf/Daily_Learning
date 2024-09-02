/**
 * @author Glimmer
 * @version v1.0
 * @ClassName TernaryOperator
 * @Description 三元运算符使用
 * @CreateTime 2024/8/20 18:22
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        //解读
        //1.a > b 为false
        //2.返回b--,先返回b的值,再执行b--，等价于b = b - 1;
        //3.返回的结果是99
        //4.只执行相应的表达式
        int result = a > b ? a++ : b--;//a=10,b=98,result=99
        System.out.println("result=" + result);
    }
}
