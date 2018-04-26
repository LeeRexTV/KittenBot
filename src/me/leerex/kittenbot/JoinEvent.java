package me.leerex.kittenbot;

import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.List;

public class JoinEvent extends ListenerAdapter {

    public void onGuildMemberJoin(GuildMemberJoinEvent e) {

        List<TextChannel> channels = e.getGuild().getTextChannels();
        for (TextChannel channel: channels) {
            if(channel.getName().equalsIgnoreCase("welcome")) {
                channel.sendMessage("Welcome " + e.getMember().getAsMention() + " to **" + e.getGuild().getName() + "**").queue();
            }
        }
    }
}
