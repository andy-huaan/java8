package lambda;

import common.Static;
import interface8.Inter8Child;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * JDK8引入了Lambda表达式，简化了匿名内部类的使用。仅适用于函数式接口
 * Lambda表达式语法结构：(参数1,参数2...)->{
 *  重写方法的内容，不定义方法名
 * }
 */
public class Lambda {
    public static void main(String[] args) {
        //Lambda在多线程中的应用
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("新线程:" + i);
            }
        });
        thread.start();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // 以下第一个循环可以利用第二个循环代替
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer it) {
                System.out.println(it);
            }
        });

        numbers.forEach(it -> {
            System.out.println(it);
        });


        // 调用自定义函数式接口
        LambdaInter li = (String name) -> {
            System.out.println(">>>>"+name);
        };
        li.run("嘻嘻哈哈");

        // java.util.function 包下提供的函数式接口
        Function<Static,String> f = (Static s)->{
            return s.toString();
        };
        System.out.println(f.apply(new Static()));

        // 比较接口中的方法
        Comparator<String> c = (o1, o2) -> {
            return o1.length()-o2.length();
        };
        System.out.println(c.compare("abcd","abc"));


    }
}

