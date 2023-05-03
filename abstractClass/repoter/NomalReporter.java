package abstractClass.repoter;

public class NomalReporter implements Reportable{
    @Override
    public void report() {
        System.out.println("일반 화재신고를 진행합니다.");
    }
}
