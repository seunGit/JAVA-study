package thread;

import thread.clean.CleanThread;

public class ThreadPrac {
    public static void main(String[] args) {
//        cleanBySelf();
        CleanThread cleanThread = new CleanThread();
//        cleanThread.run(); // 직원 청소
        cleanThread.start();
        cleanByBoss(); // 사장 청소
    }

    public static void cleanBySelf() {
        System.out.println("--- 혼자서 청소 시장 ---");
        for(int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("--- 사장 청소 시작 ---");
        for(int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
