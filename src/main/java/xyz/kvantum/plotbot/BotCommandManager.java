package xyz.kvantum.plotbot;

import com.intellectualsites.commands.CommandManager;
import xyz.kvantum.plotbot.commands.Math;
import xyz.kvantum.plotbot.commands.*;
import xyz.kvantum.plotbot.commands.spigot.Spigot;
import xyz.kvantum.plotbot.github.GithubManager;

public class BotCommandManager extends CommandManager {

    BotCommandManager(final GithubManager githubManager) {
        if (BotConfig.CmdIssue.enable) {
            this.createCommand(new Issue(githubManager));
        }

        if (BotConfig.CmdSpigot.enable) {
            this.createCommand(new Spigot());
        }
        this.createCommand(new Nick());
        this.createCommand(new Trust());
        this.createCommand(new Help());
        this.createCommand(new MessageHistory());
        this.createCommand(new Math());
        this.createCommand(new Purge());
        this.createCommand(new Shutdown());
        this.createCommand(new Say());
        this.createCommand(new GoodHuman());
        this.createCommand(new Source());
        this.createCommand(new Repeat());
        this.createCommand(new Distrust());
        this.createCommand(new Annoy());
        this.createCommand(new SetupAutoRole());
        this.createCommand(new Identify());
        this.createCommand(new Material());
        this.createCommand(new Translate());
        this.createCommand(new RegionaIndicator());
        this.createCommand(new PlotSquaredCommand());
        this.createCommand(new PlotSquaredFlag());
        this.createCommand(new Paste());
        this.createCommand(new Google());
        this.createCommand(new CQuery());

        final Macro macro = new Macro();
        this.createCommand(macro);
        Macro.setInstance(macro);
        final Link link = new Link();
        this.createCommand(link);
        Link.setInstance(link);
        this.setInitialCharacter(BotConfig.initialCharacter.charAt(0));
    }

}
