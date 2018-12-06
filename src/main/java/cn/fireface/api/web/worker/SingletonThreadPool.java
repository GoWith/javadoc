package cn.fireface.api.web.worker;

import java.util.concurrent.*;

/**
 * Create by 灰色十三月 on 2018/11/28
 * don't worry be happy!
 * @author 灰色十三月
 */
public class SingletonThreadPool {

    private static ThreadPoolExecutor threadPoolExecutor;

    public static ExecutorService getThreadPoolInstance() {
        if (threadPoolExecutor == null) {
            init();
        }
        return threadPoolExecutor;
    }


    private static synchronized void init() {
        threadPoolExecutor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), r -> {
            Thread thread = new Thread(r);
            thread.setName("pull javadoc thread" + thread.getId());
            return thread;
        });
    }
}
