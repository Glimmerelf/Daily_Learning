/**
 * @author Glimmer
 * @version v1.0
 * @ClassName ForceConvertDetail
 * @Description 演示数据类型强制转换的细节
 * @CreateTime 2024/4/25 10:37
 */
public class ForceConvertDetail {
    public static void main(String[] args) {
//        细节1:当进行数据的大小从大-->小，就需要使用到强制转换
//        细节2:强转符号只针对最近的操作数有效，往往会使用小括号提升优先级
//        int x = (int) 10*3.5+6*1.5; //编译错误: double -> int
        int x = (int)(10*3.5+6*1.5); //(int)44.0 -> 44
        System.out.println(x);
//        细节3:char类型可以保存int的常量值，但不能保存int的变量值，需要强制
        char c1 = 100;
        int m = 100;
//        char c2 = m;//编译错误: int -> char
        char c3 = (char)m;
        System.out.println(c3);//100对应的字符，即d
//        细节4:byte和short,char类型在进行运算时，当作int类型处理
    }
}
