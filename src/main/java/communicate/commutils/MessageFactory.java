package communicate.commutils;

import communicate.entity.IOMessage;

public class MessageFactory {
    public static IOMessage requestSterilizerId(){
        return new IOMessage(0, "hello".getBytes());
    }
}
