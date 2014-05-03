package net.blay09.mods.eirairc.bot;

import net.blay09.mods.eirairc.api.base.IIRCChannel;
import net.blay09.mods.eirairc.api.base.IIRCUser;
import net.blay09.mods.eirairc.api.bot.IIRCBot;
import net.blay09.mods.eirairc.api.bot.IBotCommand;
import net.blay09.mods.eirairc.util.Utils;

public class BotCommandWho implements IBotCommand {

	private String name;
	
	public BotCommandWho(String name) {
		this.name = name;
	}
	
	@Override
	public String getCommandName() {
		return name;
	}

	@Override
	public boolean isChannelCommand() {
		return true;
	}

	@Override
	public void processCommand(IIRCBot bot, IIRCChannel channel, IIRCUser user, String[] args) {
		Utils.sendUserList(user);
	}
	
}