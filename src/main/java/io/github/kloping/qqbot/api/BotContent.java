package io.github.kloping.qqbot.api;

import io.github.kloping.qqbot.entities.Bot;

/**
 * @author github.kloping
 */
public interface BotContent {
    Bot getBot();

    void setBot(Bot bot);
}
