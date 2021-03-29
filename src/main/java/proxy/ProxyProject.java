package proxy;

import com.sun.deploy.perf.PerfRollup;
import com.sun.media.sound.RealTimeSequencerProvider;

public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null){
            realProject  = new RealProject(url);
        }
        realProject.run();

    }
}
