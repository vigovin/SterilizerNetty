package communicate.server;

import communicate.commutils.BidirectionalMap;
import communicate.constants.State;
import communicate.entity.ChannelState;
import io.netty.channel.Channel;

import java.util.concurrent.ConcurrentHashMap;

public class ChannelManager {
    private static final ConcurrentHashMap<Channel, ChannelState> channelStateMap = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Channel> channelMap = new ConcurrentHashMap<>();

    public static ChannelState getChannelStateByChannel(Channel channel) {
        return channelStateMap.get(channel);
    }

    public static State getStateByChannel(Channel channel) {
        ChannelState channelState = channelStateMap.get(channel);
        if (channelState == null) {
            return null;
        }
        return channelState.getState();
    }

    public static String getSterilizerIdByChannel(Channel channel) {
        ChannelState channelState = channelStateMap.get(channel);
        if (channelState == null) {
            return null;
        }
        return channelState.getSterilizerId();
    }

    public static Channel getChannelBySterilizerId(String sterilizerId) {
        return channelMap.get(sterilizerId);
    }

    /**
     * 外部调用仅发生在Worker线程 没有线程安全问题
     * @param channel
     */
    public static void putChanel(Channel channel) {
        channelStateMap.put(channel, new ChannelState());
    }

    /**
     * 外部调用发生在工作线程池 可能存在线程安全问题
     * @param channel
     * @param state
     */
    public static void setChannelState(Channel channel, State state) {
        synchronized (channelStateMap) {
            if (!channelStateMap.containsKey(channel)) {
                putChanel(channel);
            }
            channelStateMap.get(channel).setState(state);
        }
    }

    /**
     * 外部调用发生在工作线程池 可能存在线程安全问题
     * @param sterilizerId
     * @param channel
     */
    public static void putChannelWithId(String sterilizerId, Channel channel) {
        if (channelMap.contains(sterilizerId))
            return;
        synchronized (channelStateMap) {
            if (!channelMap.containsKey(sterilizerId)) {
                if (!channelStateMap.containsKey(channel)) {
                    putChanel(channel);
                }
                channelStateMap.get(channel).setSterilizerId(sterilizerId);
                channelMap.put(sterilizerId, channel);
            }
        }
    }

    /**
     * 外部调用发生在工作线程池 可能存在线程安全问题
     * @param channel
     */
    public synchronized static void remove(Channel channel) {
        String sterilizerId = channelStateMap.get(channel).getSterilizerId();
        if (sterilizerId != null) {
            channelMap.remove(sterilizerId);
        }
        channelStateMap.remove(channel);
    }

    /**
     * 外部调用发生在工作线程池 可能存在线程安全问题
     * @param sterilizerId
     */
    public synchronized static void remove(String sterilizerId) {
        Channel channel = channelMap.get(sterilizerId);
        if (channel != null) {
            channelStateMap.remove(channel);
        }
        channelMap.remove(sterilizerId);
    }
}
