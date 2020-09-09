package communicate.commutils;

import communicate.entity.IOMessage;

public class CodecUtils {
    /**
     * TODO Finish All Methods
     * @param bytes 从通道读取一个字节，判断是否是符合规定的消息
     * @return 是否校验通过
     */
    public static boolean checkPrefix(byte[] bytes) {

        return true;
    }

    public static byte[] makePrefix() {

        return null;
    }

    public static int getMessageLength(byte b) {

        return 0;
    }

    public static byte[] buildMessageLength(int len) {

        return null;
    }

    public static String getSterilizerId(IOMessage ioMessage) {
        return null;
    }
}
