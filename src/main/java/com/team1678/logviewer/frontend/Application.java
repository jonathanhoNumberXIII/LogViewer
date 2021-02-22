package com.team1678.logviewer.frontend;

import com.team1678.logviewer.backend.Input;
import com.team1678.logviewer.backend.Processor;
import com.team1678.logviewer.io.Logger;
import com.team1678.logviewer.io.Severity;

import java.io.FileNotFoundException;
import java.util.List;

public final class Application {

    private static final String PATH = "sample_log.csv";
    List<List<String>> rawData = Input.read(PATH);

    private Application() throws FileNotFoundException {
    }

    public static Application app = null;
    private static Processor processor = new Processor();

    static {
        try {
            app = new Application();
            Logger.log("App Initializing", Severity.NORMAL);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Logger.log("Error Initializing", Severity.FATAL);
        }
    }

    /**
     * Run the application forever (or until an exit request is sent)
     */
    public void mainloop() {
        // Mainloop
    }
}
