package project;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    public static void main(String[] args) {
        startThread();
    }

    // 1.  user
    // static 修饰的方法 和 变量 都是通过 类名.方法 调用. 未修饰的是实例的
    public static List<User> initUser(){
        List<User> users = new ArrayList<User>();

        return users;
    }
        // 2. 线程
    public static void startThread(){
        new Thread(new CurrentThread()).start();
    }

}

// 2. 线程
class CurrentThread implements Runnable{

    @Override
    public void run() {
        // 处理需要做的事。 比如 发邮件
        System.out.println("111111");
    }
}