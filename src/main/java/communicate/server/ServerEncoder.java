package communicate.server;

import communicate.commutils.CodecUtils;
import communicate.entity.IOMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ServerEncoder extends MessageToByteEncoder<IOMessage> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, IOMessage ioMessage, ByteBuf byteBuf) throws Exception {
        byteBuf.writeBytes(CodecUtils.makePrefix());
        byteBuf.writeBytes(CodecUtils.buildMessageLength(ioMessage.getLength()));
        byteBuf.writeBytes(ioMessage.getContent());
    }
}
