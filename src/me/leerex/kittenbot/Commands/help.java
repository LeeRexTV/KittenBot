package me.leerex.kittenbot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class help {
    public void action(MessageReceivedEvent e){
        EmbedBuilder builder = new EmbedBuilder();

        builder.setTitle("Meow... I see you need help!!");
        builder.setDescription("If you are in need of help you can join our discord: [Click Here](https://discord.gg/cnH7EMz)!" +
                "\nor if you are looking for commands you can check our google docs page for help on those: [Click Here](https://google.com)");
        builder.setColor(Color.green);

        Message message = new MessageBuilder()
                .setEmbed(builder.build())
                .build();
        e.getChannel().sendMessage(message).queue();
    }
}
