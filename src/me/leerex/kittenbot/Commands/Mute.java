package me.leerex.kittenbot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.List;

public class Mute {
    public void action(String[] args, MessageReceivedEvent e) {
        List<Member> memberList = e.getGuild().getMembers();
        EmbedBuilder builder = new EmbedBuilder();

        for (Member member : memberList) {
            e.getChannel().sendMessage("RandomUserFound!").queue();

            if (args[1].equals(member.getAsMention())) {

                builder.setTitle("Meow... Bad cat, you have been silenced by a big cat!!");
                builder.setDescription("**User** " + member.getAsMention() + " has been muted!");
                builder.setColor(Color.PINK);

                Message message = new MessageBuilder()
                        .setEmbed(builder.build())
                        .build();
                e.getChannel().sendMessage(message).queue();
            }
        }
    }
}