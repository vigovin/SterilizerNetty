package communicate.server;

import communicate.entity.IOMessage;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

public class Service {

    public static boolean checkSterilizer(String sterilizerId) {
        return false;
    }

    public static void readMessage(ChannelHandlerContext ctx, IOMessage message) {
        //根据ctx解析Message
        ChannelManager.getStateByChannel(ctx.channel());
        //访问数据库
        //生成IOMessage
        //ctx.writeAndFlush()
    }

    public static void sendMessageById(String sterilizerId, IOMessage message) {
        Channel channel = ChannelManager.getChannelBySterilizerId(sterilizerId);
        //TODO 记录
        channel.writeAndFlush(message);
    }

    public static void startSterilizer(String sterilizerId) {
        //生成IOMessage
        IOMessage ioMessage = new IOMessage();
        sendMessageById(sterilizerId, ioMessage);
    }
}
