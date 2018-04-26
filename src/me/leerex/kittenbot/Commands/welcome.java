package me.leerex.kittenbot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class welcome {
    public void action(MessageReceivedEvent e){
        EmbedBuilder builder = new EmbedBuilder();

        builder.setTitle("Meow... Someone wants to send you some welcoming love!!");
        builder.setDescription("Welcome  "  + e.getMember().getAsMention() +  " we are all glad you joined our server!!");
        builder.setColor(Color.green);

        Message message = new MessageBuilder()
                .setEmbed(builder.build())
                .build();
        e.getChannel().sendMessage(message).queue();
    }
}
