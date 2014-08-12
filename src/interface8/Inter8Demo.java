package interface8;

/**
 * JDK8 接口中可以定义静态实现方法和默认实现方法
 * 接口不能提供对Object类的任何方法的默认实现
 */
public interface Inter8Demo {

    /**
     * 接口中可以定义静态方法，用接口名调用
     */
    public static void sayHello() {
        System.out.println("你好");
    }

    /**
     * 接口中定义默认方法，利用子类对象调用，接口中德默认方法，实现类并不是必须实现
     * @param name
     */
    public default void sayHello(String name) {
        System.out.println("你好:" + name);
    }
}
