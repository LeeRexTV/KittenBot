package me.leerex.kittenbot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class invite {
    public void action(MessageReceivedEvent e){
        EmbedBuilder builder = new EmbedBuilder();

        builder.setTitle("Invite Link");
        builder.setDescription("~~ ~~~~ ~~~~ ~~> [Click Here](https://discordapp.com/oauth2/authorize?client_id=438794476547473409&permissions=499641463&scope=bot) <~~ ~~~~ ~~~~ ~~");
        builder.setColor(Color.CYAN);

        Message message = new MessageBuilder()
                .setEmbed(builder.build())
                .build();
        e.getChannel().sendMessage(message).queue();
    }
}
