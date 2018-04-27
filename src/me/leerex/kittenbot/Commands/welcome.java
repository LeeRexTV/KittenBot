package me.leerex.kittenbot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.List;

public class welcome {
    public void action(String[] args,MessageReceivedEvent e){
        List<Member> memberList = e.getGuild().getMembers();
        EmbedBuilder builder = new EmbedBuilder();

        for (Member member : memberList) {
            if (args[1].equals(member.getAsMention())) {

                builder.setTitle("Meow... "+e.getAuthor().getName()+" wants to send you some welcoming love!!");
                builder.setDescription("Welcome  " + member.getAsMention() + " we are all glad you joined our server!!");
                builder.setColor(Color.green);

                Message message = new MessageBuilder()
                        .setEmbed(builder.build())
                        .build();
                e.getChannel().sendMessage(message).queue();
            }
        }
    }
}
