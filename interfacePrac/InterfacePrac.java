package interfacePrac;

import abstractClass.repoter.NomalReporter;
import abstractClass.repoter.Reportable;
import abstractClass.repoter.VideoReporter;

public class InterfacePrac {
    public static void main(String[] args) {
        Reportable nomalReporter = new NomalReporter();
        nomalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();
    }
}
