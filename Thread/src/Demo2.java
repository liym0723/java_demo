// 继承 git test
public class Demo2{
    public static void main(String[] args){
        // 创建一个新线程
        createThread ct = new createThread();
        ct.start(); // start 启用线程。 执行run方法
        for (int i = 0; i < 20; i++){
            System.out.println("man() i:" + i);
        }
    }
}


class createThread extends Thread {
    // 执行需要线程执行的任务 代码
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println("run() i:" + i);
        }
    }
}