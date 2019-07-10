//package Scheduled;
//
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//
///**
// * @description:
// * @author: xuqiang
// * @createDate: 2019-05-07 14:25
// **/
//public class ScheduledExecutorServiceDemo {
//
//    public static void main(String args[]) {
////        new ScheduledThreadPoolExecutor()
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, Long.parseLong(ConfigUtil.getConfigModel().getCheckTime()), TimeUnit.MILLISECONDS,
//                new ArrayBlockingQueue<Runnable>(2));
//    threadPoolExecutor.execute(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        threadPoolExecutor.execute(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//
//    }
//
//
//}
