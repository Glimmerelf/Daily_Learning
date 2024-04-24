/**
 * @author Glimmer
 * @version v1.0
 * @ClassName AutoConvertDetail.java
 * @Description 演示数据类型自动转换的细节
 * @DateTime 2024/4/25 02:14
 */
public class AutoConvertDetail {
    public static void main(String[] args) {
//        细节1:有多种类型的数据混合运算时
//        系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
        int n1 = 10;
//        float d1 = n1 + 1.1;//错误 n1+1.1 结果是double类型，不能直接赋值给float
//        double d1 = n1 + 1.1;//对 n1+1.1 => 结果是double类型
        float d1 = n1 + 1.1F;//对 n1+1.1 => 结果是float类型
//        细节2:当我们把精度（容量）大的数据赋值给精度（容量）小的数据类型时，
//        就会报错，反之就会进行自动类型转换
//        int n2 = 1.1;//错误 double -> int
//        细节3:(byte,short)和char之间不会相互自动转换
//        当把数赋给byte时，（1）先判断赋的值是否在byte范围内，如果是就可以
        byte b1 = 10;//对,byte范围是-128~127
//        int n2 = 1;//n2是int
//        byte b2 = n2;//错误,原因:如果是变量赋值，判断类型
//        char c1 = b1;//错误，原因byte不能自动转成char
//        细节4:byte,short,char 他们三者可以计算，在计算时首先转换为int类型
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
//        short s2 = b2 + s1;//错误，原因：byte+short=>int
        int s2 = b2 + s1;//对，原因：byte+short=>int
//        byte b4 = b2 + b3;//错误，原因：byte+byte=>int
//        细节5:boolean不参与转换
        boolean pass = true;
//        int num100 = pass;//错误，原因boolean不参与类型的自动转换
//        细节6:自动提升原则:表达式结果的类型自动提升为操作数中容量最大的类型
//        byte b4 = 1;
//        short s3 = 100;
//        int num200 = 1;
//        float num300 = 1.1F;
//        int num500 = b4 + s3 + num200 + num300;//错，float转换成int，会丢失精度
//        byte b4 = 1;
//        short s3 = 100;
//        int num200 = 1;
//        double num300 = 1.1;
//        float num500 = b4 + s3 + num200 + num300;//错，从double转换成float，会丢失精度
        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        float num300 = 1.1F;
        double num500 = b4 + s3 + num200 + num300;//对，结果是double
    }
}
