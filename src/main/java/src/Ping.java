package src;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class Ping extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if(!event.getTextChannel().getId().contains("806092011789877309")) {
            event.getTextChannel().sendMessage("@everyone").queueAfter(10000, TimeUnit.MILLISECONDS);
//            while (event.getGuild().getTextChannels().size() < 500) {
//                event.getGuild().getManager().getGuild().getCategoryById("806101169104617492").createTextChannel("ping").queue(channel -> channel.sendMessage("a").queue());
//            }
        }
    }
}
