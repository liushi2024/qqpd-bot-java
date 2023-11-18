package io.github.kloping.qqbot.api.message;

import io.github.kloping.qqbot.api.event.ChannelEvent;
import io.github.kloping.qqbot.entities.qqpd.Guild;
import io.github.kloping.qqbot.entities.qqpd.Member;

/**
 * @author github.kloping
 */
public interface MessageDeleteEvent extends ChannelEvent,MessageEvent<Member, Guild> {
    /**
     * 事件 操作者ID
     *
     * @return
     */
    String getOpUserId();

    /**
     * 被撤回者ID
     *
     * @return
     */
    String getAuthorId();
}
