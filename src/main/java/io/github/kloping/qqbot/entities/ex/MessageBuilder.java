package io.github.kloping.qqbot.entities.ex;

import io.github.kloping.qqbot.entities.qqpd.data.Emoji;
import io.github.kloping.qqbot.entities.qqpd.message.RawMessage;

/**
 * @author github.kloping
 */
public class MessageBuilder {
    private MessagePre pre = new MessagePre();

    public MessageBuilder append(String text) {
        pre.setContent(pre.getContent() + text);
        return this;
    }

    public MessageBuilder append(Image image) {
        pre.setImage(image);
        return this;
    }

    public MessageBuilder append(At at) {
        pre.setContent(pre.getContent() + at);
        return this;
    }

    public MessageBuilder append(AtAll at) {
        pre.setContent(pre.getContent() + "@everyone");
        return this;
    }

    public MessageBuilder append(Emoji emoji) {
        pre.setContent(pre.getContent() + emoji);
        return this;
    }

    public MessageBuilder reply(RawMessage message) {
        pre.setReplyId(message.getId());
        return this;
    }

    public MessagePre build() {
        return pre;
    }
}