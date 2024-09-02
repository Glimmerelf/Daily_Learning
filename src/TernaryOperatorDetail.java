/**
 * @author Glimmer
 * @version v1.0
 * @ClassName TernaryOperatorDetail
 * @Description 三元运算符使用细节
 * @CreateTime 2024/8/20 18:39
 */
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        //表达式1和表达式2要为可以赋给接收的类型（可以自动转换/或者强制转换）
        int a = 3;
        int b = 8;
        int c = a > b ? (int)1.1 : (int) 3.4;//可以的，强制转换
        double d = a > b ? a : b + 3;//可以的，满足int -> double
    }
}
