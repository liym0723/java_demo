public class ThreadApi {
    public static void main(String[] args) {
        new Thread1().start();
        Thread1 thread1 = new Thread1();
        thread1.setName("线程-1");
        thread1.start();

        new Thread(new Thread2()).start();

    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println("man() i:" + i);
            try {
                Thread.sleep(100); // 1S 暂停一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 线程ID 是一个随机 不重复的主键
        System.out.println("thread id :" + getId() + " . name :" + getName());
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println("man() i:" + i);
        }

        // 获取当前对象
        Thread.currentThread().setName("runnable 线程");

        // 线程ID 是一个随机 不重复的主键
        System.out.println("thread id :" + Thread.currentThread().getId() + " . name :" + Thread.currentThread().getName());
    }
}