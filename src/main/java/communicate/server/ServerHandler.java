package communicate.server;

import communicate.commutils.CodecUtils;
import communicate.commutils.MessageFactory;
import communicate.constants.State;
import communicate.entity.IOMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ServerHandler extends SimpleChannelInboundHandler<IOMessage> {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ChannelManager.putChanel(ctx.channel());
        ChannelManager.setChannelState(ctx.channel(), State.GETTING_S_ID);
        ctx.writeAndFlush(MessageFactory.requestSterilizerId());
    }

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, IOMessage ioMessage) throws Exception {
        if (ChannelManager.getSterilizerIdByChannel(channelHandlerContext.channel()) == null
                && ChannelManager.getStateByChannel(channelHandlerContext.channel()) == State.GETTING_S_ID) {
            ServerTaskHandler.execute(() -> {
                String sterilizerId = CodecUtils.getSterilizerId(ioMessage);
                if (Service.checkSterilizer(sterilizerId)) {
                    ChannelManager.putChannelWithId(sterilizerId, channelHandlerContext.channel());
                } else {
                    ChannelManager.remove(channelHandlerContext.channel());
                }
            });
        }
        else {
            //业务逻辑处理
            ServerTaskHandler.execute(() -> {
                Service.readMessage(channelHandlerContext, ioMessage);
            });
        }

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("Something Error: " + cause.getMessage());
        ChannelManager.remove(ctx.channel());
        ctx.close();
    }


}
