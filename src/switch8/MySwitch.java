package switch8;

/**
 * JDK8中的switch表达式中可以使用String
 */
public class MySwitch {
    public static void main(String[] args) {
        int param = 1;
        //JDK8之前仅适合byte/char/int
        switch (param){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println(3);
                break;
        }
        //JDK8可以使用String
        String paramStr = "abc";
        switch (paramStr){
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "abc":
                System.out.println("abc");
                break;
            default:
                System.out.println("默认!");
                break;
        }
    }
}
