package io.github.kloping.qqbot.api;

import io.github.kloping.qqbot.api.event.BotContent;

/**
 * @author github.kloping
 */
public interface SenderAndCidMidGetter extends Sender, BotContent {
    /**
     * 获取 channel id
     *
     * @return
     */
    String getCid();

    /**
     * 获取 message id
     *
     * @return
     */
    default String getMid() {
        return null;
    }
}
