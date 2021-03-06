package com.greatonce.oms.consumer;

import com.greatonce.core.util.JsonUtil;
import com.greatonce.oms.domain.OmsException;
import com.greatonce.oms.domain.SysExceptions;
import com.greatonce.oms.message.Message;
import com.rabbitmq.client.Channel;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息处理抽象类.
 *
 * @author ginta
 * @author Shenzhen Greatonce Co Ltd
 * @version 2018/3/23
 */
public abstract class AbstractConsumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractConsumer.class);

  protected <T extends Message> void run(T message, final Channel channel, long tag,
      Runnable runnable) throws IOException {
    try {
      if (LOGGER.isDebugEnabled()) {
        LOGGER.debug("{}处理消息：{}", this.getClass().getName(), message);
      }
      runnable.run();
      channel.basicAck(tag, true);
    } catch (OmsException e) {
      LOGGER.error("消息处理异常！{},{},{}", this.getClass().getName(), message, e.getMessage());
      if (e.equals(SysExceptions.VERSION_CHANGED)) {
        channel.basicReject(tag, true);
      } else {
        channel.basicReject(tag, false);
      }
    } catch (Exception e) {
      LOGGER.error("消息处理异常！{},{}", this.getClass().getName(), JsonUtil.toJson(message));
      LOGGER.error("消息处理异常！", e);
      channel.basicReject(tag, false);
    }
  }
}
