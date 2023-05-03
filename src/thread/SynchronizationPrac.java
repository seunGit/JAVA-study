package thread;

import thread.clean.Room;

public class SynchronizationPrac {
    public static void main(String[] args) {
        Room room = new Room();

        Runnable cleaner1 = new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (i == 2) {
                        throw new RuntimeException("힘들어 도망챠");
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}
