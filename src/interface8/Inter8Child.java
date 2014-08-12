package interface8;

/**
 * Created by thatboy on 2014/8/10.
 */
public class Inter8Child implements Inter8Demo {
    private String mm;

    /**
     * 此处重写接口中德默认方法，但是实现类中不能写default修饰符
     * @param name
     */
    @Override
    public void sayHello(String name) {
        System.out.println("子类重写:" + name);
    }

    public static void main(String[] args) {
        Inter8Demo.sayHello();

        Inter8Demo child = new Inter8Child();
        child.sayHello("赵华安");
    }
}
