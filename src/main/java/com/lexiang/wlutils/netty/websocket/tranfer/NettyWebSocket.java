package com.lexiang.wlutils.netty.websocket.tranfer;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;

public interface NettyWebSocket {
    void handsShaker(ChannelHandlerContext ctx, FullHttpRequest request);

    void handsShakerClose(WebSocketServerHandshaker handsShaker, Channel channel, Object webSocketFrame);


    
    /**
     * 预关闭webSocket握手
     * @param handsShaker webSocket握手起到
     * @param channel 通道
     * @param webSocketFrame webSocket数据
     */
    public void handsShakerCloseFuture(WebSocketServerHandshaker handsShaker,Channel channel, Object webSocketFrame);
    /**
     * 传送text类型的websocket数据
     * @param channel 通道
     * @param message 消息文字
     *
     */
    public void sendMessage(Channel channel,String message);
}
