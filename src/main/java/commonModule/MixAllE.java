package commonModule;

/**
 * @author zhanglbjames@163.com
 * @version Created on 17-12-8.
 */

import java.io.File;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * 混合的一些系统属性值工具类
 */
public class MixAllE {

    public static void traverseSystemProperties() {
        Properties props = System.getProperties();

        // 打印所有属性
        props.list(System.out);

        // 设置新的属性
        props.setProperty("MY_NAME", "zhanglbjames");

        System.out.println(props.getProperty("MY_NAME"));

        props.remove("MY_NAME");
        //System.clearProperty("MY_NAME");

        System.out.println(props.getProperty("MY_NAME"));
    }

    public static void getPID() {
        String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(processName);
    }

    public static void getPIDPlus() {
        String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();

        String[] splits = processName.split("@");
        System.out.println(Integer.parseInt(splits[0]));
    }

    public static void getFileProperties(String fileName) {
        File file = new File(fileName);
        // 返回fileName这条文件路径的父级目录字符串，如果没有则返回null
        System.out.println("getParent: " + file.getParent());
        // 返回fileName这条文件路径的父级目录的File对象，如果没有则返回null
        System.out.println("getParentFile: " + file.getParent());
    }

    public static void mkdirOrmkdirs(String fileName,boolean flag) {
        File file = new File(fileName);
        File parentFile = file.getParentFile();

        // 只创建这个parentFile目录
        if (parentFile != null && flag) {
            if (parentFile.mkdir()){
                System.out.println("mkdir create success");
            }
        }

        // 按照parentFile的目录结构创建必要的文件目录，使得parentFile这条路径上的文件目录都存在
        if (parentFile != null && !flag) {
            if (parentFile.mkdirs()) {
                System.out.println("mkdirs create success");
            }
        }
    }

    public static void objectPropReflect(final Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field :
                fields) {
            System.out.println(field.getName());
        }

    }


}
