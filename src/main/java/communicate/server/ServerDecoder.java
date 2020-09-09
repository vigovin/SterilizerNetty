package communicate.server;

import communicate.commutils.CodecUtils;
import communicate.entity.IOMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

public class ServerDecoder extends ReplayingDecoder<Void> {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byte[] prefixBytes = new byte[2];
        byteBuf.readBytes(prefixBytes);
        if (CodecUtils.checkPrefix(prefixBytes)) {
            int len = CodecUtils.getMessageLength(byteBuf.readByte());
            byte[] content = new byte[len];
            byteBuf.readBytes(content);
            list.add(new IOMessage(len, content));
        } else {
            byteBuf.clear();
        }
    }
}
