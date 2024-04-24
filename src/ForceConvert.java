/**
 * @author Glimmer
 * @version v1.0
 * @ClassName ForceCovert
 * @Description 强制类型转换
 * @CreateTime 2024/4/25 02:18
 */
public class ForceConvert {
    public static void main(String[] args) {
        int n1 = (int) 1.9; // 强制将1.9转换为int类型，结果为1
        System.out.println(n1);// 输出：1，造成精度丢失
        int n2 = 2000;
        byte b1 = (byte) n2; // 强制将n2转换为byte类型，结果为-48
        System.out.println("b1="+b1);// 输出：b1=-48,造成数据溢出
    }
}
