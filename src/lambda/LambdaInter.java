package lambda;

/**
 * 定义一个函数式接口
 * 函数式接口:接口里有且只有一个抽象方法，这样的接口就称为函数式接口.任何函数式接口的调用都可以使用lambda表达式替换(不包含抽象类)
 */
@FunctionalInterface //此注解标识该接口为函数式接口，必须符合函数式接口的定义规则
public interface LambdaInter {
    public void run(String name);
}
