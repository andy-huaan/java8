package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件读取类使用Lambda表达式
 */
public class FileLambda {

    public static void main(String[] args) {
        //普通方式
        File file = new File("E:\\常用数据库和相关驱动程序及相关资料\\");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        });
        for (File f : files) {
            System.out.println("普通方式:"+f.getName());
        }
        //Lambda方式
        File[] files2 = file.listFiles(f -> {
            return f.getName().endsWith(".txt");
        });
        for (File f: files2){
            System.out.println("Lambda方式:"+f.getName());
        }
    }
}
