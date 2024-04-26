/**
 * @author Glimmer
 * @version v1.0
 * @ClassName LogicOperator
 * @Description 演示逻辑运算符的作用
 * @CreateTime 2024/4/26 14:12
 */
public class LogicOperator {
    public static void main(String[] args) {
//        && 和 & 演示
        int age = 50;
        if (age > 20 && age < 90) {
//        && 短路与, 当age > 20 为false时，整个表达式为false,不会判断age < 90
            System.out.println("ok100");
        }
//        & 使用
        if (age > 20 & age < 90) {
//            & 逻辑与,只有当age > 20 和 age < 90 都为true时，整个表达式才为true,否则为false
            System.out.println("ok200");
        }
//        区别
        int a = 4;
        int b = 9;
//        对于&&短路与来说，如果第一个条件为false，后面的表达式不再判断执行
        if (a < 1 && ++b < 50) {//只执行a < 1，b不会自增，if语句为false
            System.out.println("ok300");//不会执行
        }
        System.out.println("a=" + a + "b=" + b);//a=4 b=9
//        对于&逻辑与来说，如果第一个条件为false，后面的表达式仍然会判断执行
         if (a < 1 & ++b < 50) {//a < 1为false,b会自增，if语句为false
            System.out.println("ok300");//不会执行
        }
        System.out.println("a=" + a + "b=" + b);//a=4 b=10
//        ||短路或 和 |逻辑或 演示
//        || 规则:两个条件中只要有一个成立，结果为true,否则为false
//        | 规则:两个条件中只要有一个成立，结果为true,否则为false
        int age1 = 50;
//        短路或||
        if (age1 > 20 || age1 < 30) {
            System.out.println("ok1000");
        }
//        逻辑或|
        if (age1 > 20 | age1 < 30) {
            System.out.println("ok2000");
        }
//        区别
//        短路或||:如果第一个条件为true,后面的表达式不再判断执行，效率高
        if (a > 1 || ++b > 4) {
            System.out.println("ok3000");
        }
        System.out.println("a=" + a + "b=" + b);//a=4 b=9
//        逻辑或|:两个条件都会判断执行，效率低
        if (a > 1 | ++b > 4) {
            System.out.println("ok3000");
        }
        System.out.println("a=" + a + "b=" + b);//a=4 b=10
    }
}
