package com.hng.slackbot;

import com.slack.api.bolt.AppConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SlackApp {

    @Bean
    public AppConfig loadSingleWorkSpaceAppConfig() {
        return AppConfig.builder()
                .singleTeamBotToken(System.getenv("SLACK_BOT_TOKEN"))
                .signingSecret(System.getenv("SLACK_SIGNING_SECRET"))
                .build();
    }
}
