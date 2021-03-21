// 实现 Runnable 实现 thread
public class Demo3 {
    public static void main(String[] args){
        // C + A + v = 返回值
        LiymThread t = new LiymThread();
        Thread thread = new Thread(t);
        thread.start();
        for (int i = 0; i < 20; i++){
            System.out.println("man() i:" + i);
        }
    }
}

// 继承只能继承一个。 实现了接口还能继续继承
class LiymThread implements Runnable {

    // 执行线程需要执行的代码
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println("run() i:" + i);
        }
    }
}