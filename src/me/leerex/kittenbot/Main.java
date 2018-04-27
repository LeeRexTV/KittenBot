package me.leerex.kittenbot;

import me.leerex.kittenbot.Commands.CommandExecutor;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;

import javax.security.auth.login.LoginException;

public class Main {

    public static JDABuilder builder;
    public static JDA jda;
    public static final String BOT_TOKEN = "NDM4Nzk0NDc2NTQ3NDczNDA5.DcJyuQ.Fsz9kvMRBPYOCyJeRMg_E33Jvvw";

    public static void main(String[] args) {
        builder = new JDABuilder(AccountType.BOT);

        builder.setToken(BOT_TOKEN);
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.ONLINE);

        try {
            jda = builder.buildBlocking();

            jda.addEventListener(new CommandExecutor());
            jda.addEventListener(new JoinEvent());


        } catch (LoginException | IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}