package myPackage;

public class Main {
    public static void main(String[] args) {

    }
}




























//public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer();
//
//        Thread thread1 = new Thread(new MyRunnable(stringBuffer, "Thread 1"));
//        thread1.start();
//
//        Thread thread2 = new Thread(new MyRunnable(stringBuffer, "Thread 2"));
//        thread2.start();
//    }
//
//    static class MyRunnable implements Runnable {
//        private StringBuffer stringBuffer;
//        private String threadName;
//
//        public MyRunnable(StringBuffer stringBuffer, String threadName) {
//            this.stringBuffer= stringBuffer;
//            this.threadName=threadName;
//        }
//
//        @Override
//        public void run () {
//            synchronized (stringBuffer) {
//                stringBuffer.append(threadName + ": 1\n");
//                stringBuffer.append(threadName + ": 2\n");
//                stringBuffer.append(threadName + ": 3\n");
//                stringBuffer.append(threadName + ": 4\n");
//                stringBuffer.append(threadName + ": 5\n");
//            }
//        }
//    }