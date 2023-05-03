package thread.box;

public class BoxThread {
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            System.out.println("=== A 상품 준비 시작 ===");
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비" + i + "/5");
            }
            System.out.println("--- A 상품 준비 완료 ---");
        };

        Runnable runnableB = () -> {
            System.out.println("=== B 상품 준비 시작 ===");
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비" + i + "/5");
            }
            System.out.println("--- B 상품 준비 완료 ---");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        while(threadA.isAlive() || threadB.isAlive()) {
            // 스레드A나 스레드B가 살아있는 동안은 아무것도 안하고 기다린다.
            // join문과 동일한 코드이다.
        }
//        try {
//            threadA.join();
//            threadB.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        Runnable runnableSet = () -> {
            System.out.println("== 세트 상품 포장 시작 ==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트상품 포장" + i + "/5");
            }
            System.out.println("--- 세트 상품 포장 완료 ---");
        };

        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
}
