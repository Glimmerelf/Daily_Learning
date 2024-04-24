/**
 * @author Glimmer
 * @version v1.0
 * @ClassName AutoConvert.java
 * @Description  演示Java中的自动类型转换
 * @CreateTime 2024/4/25 02:14
 */
public class AutoConvert {
    public static void main(String[] args) {
        //演示自动转换
        int num = 'a';//char -> int
        double d1 = 80;//int -> double
        System.out.println(num);//输出97
        System.out.println(d1);//输出80.0
    }
}
