// 匿名内部类 实现 thread
public class Demo4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++){
                    System.out.println("run() i:" + i);
                }
            }
        }).start();
        for (int i = 0; i < 20; i++){
            System.out.println("man() i:" + i);
        }
    }
}
