package communicate.server;

import communicate.constants.ServerConstants;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerTaskHandler {
    private static final ExecutorService taskHandlerPool = Executors.newCachedThreadPool();
    public static void execute(Runnable runnable) {
        taskHandlerPool.execute(runnable);
    }
}
