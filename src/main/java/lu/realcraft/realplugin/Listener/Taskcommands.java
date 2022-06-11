package lu.realcraft.realplugin.Listener;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lu.realcraft.realplugin.main.RealMain;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ClickEvent.Action;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class Taskcommands implements CommandExecutor{


	


	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	Player p = (Player) sender;
	if(sender instanceof Player) {
		if(sender.hasPermission("RealCraft.tasks")) {
			if(args.length == 3)  {
				if(args[0].equalsIgnoreCase("set")) {

					try
					{
						if(Integer.parseInt(args[1]) <= 14 && Integer.parseInt(args[1]) > 0)
                        					{
												TaskConfigController.settask(p, args[1], args[2]);
							return true;
                        					}

						throw new NumberFormatException();

					}catch (NumberFormatException numberFormatException)
					{
						sender.sendMessage("§4you wanna add a number from another universe!PLEASE type again but an corrct §4NUMBER!!!");
						return true;
					}
				}else if(args[0].equalsIgnoreCase("remove")) {
					if(args[1].equals("1")||args[1].equals("2")||args[1].equals("3")||args[1].equals("4")||args[1].equals("5")||args[1].equals("6")||args[1].equals("7")||args[1].equals("8")||args[1].equals("9")||args[1].equals("10")||args[1].equals("11")||args[1].equals("12")||args[1].equals("13")||args[1].equals("14"))  {
						if(args[2].equals("!")) {
							TaskConfigController.settask(p, args[1], " ");
						}else {sender.sendMessage("§d/Realtask <remove> <number> <!>");}
					}else {sender.sendMessage("§4you wanna add a number from another universe!PLEASE type again but an corrct §4NUMBER!!!");}
				}else {sender.sendMessage("§d/Realtask <set/remove> <number> <task/!>");}
			}else if (args.length == 2){
				if(args[0].equalsIgnoreCase("reset")) {
					if(args[1].equals("!")) {
						p.sendMessage("Tasks reseted");
						TaskConfigController.settask(p, "1", " ");
						TaskConfigController.settask(p, "2", " ");
						TaskConfigController.settask(p, "3", " ");
						TaskConfigController.settask(p, "4", " ");
						TaskConfigController.settask(p, "5", " ");
						TaskConfigController.settask(p, "6", " ");
						TaskConfigController.settask(p, "7", " ");
						TaskConfigController.settask(p, "8", " ");
						TaskConfigController.settask(p, "9", " ");
						TaskConfigController.settask(p, "10", " ");
						TaskConfigController.settask(p, "11", " ");
						TaskConfigController.settask(p, "12", " ");
						TaskConfigController.settask(p, "13", " ");
						TaskConfigController.settask(p, "14", " ");
					}else {p.sendMessage("§d typ <!> after /Realtask <reset> to reset you Tasks");}
				}else if(args[0].equalsIgnoreCase("finish")){
					if(args[1].equals("!")) {
					    TextComponent tc1er = new TextComponent();
						tc1er.setText(TaskConfigController.gettask(p, "1")+"          "); 
					    tc1er.setBold(true);
					    
					    TextComponent tc2er = new TextComponent();
						tc2er.setText(TaskConfigController.gettask(p, "2")+"          "); 
					    tc2er.setBold(true);
					    
					    TextComponent tc3er = new TextComponent();
						tc3er.setText(TaskConfigController.gettask(p, "3")+"          "); 
					    tc3er.setBold(true);
					    
					    TextComponent tc4er = new TextComponent();
						tc4er.setText(TaskConfigController.gettask(p, "4")+"          "); 
					    tc4er.setBold(true);
					    
					    TextComponent tc5er = new TextComponent();
						tc5er.setText(TaskConfigController.gettask(p, "5")+"          "); 
					    tc5er.setBold(true);
					    
					    TextComponent tc6er = new TextComponent();
						tc6er.setText(TaskConfigController.gettask(p, "6")+"          "); 
					    tc6er.setBold(true);
					    
					    TextComponent tc7er = new TextComponent();
						tc7er.setText(TaskConfigController.gettask(p, "7")+"          "); 
					    tc7er.setBold(true);
					    
					    TextComponent tc8er = new TextComponent();
						tc8er.setText(TaskConfigController.gettask(p, "8")+"          "); 
					    tc8er.setBold(true);
					    
					    TextComponent tc9er = new TextComponent();
						tc9er.setText(TaskConfigController.gettask(p, "9")+"          "); 
					    tc9er.setBold(true);
					    
					    TextComponent tc10er = new TextComponent();
					    tc10er.setText(TaskConfigController.gettask(p, "10")+"          "); 
					    tc10er.setBold(true);
					    
					    TextComponent tc11er = new TextComponent();
					    tc11er.setText(TaskConfigController.gettask(p, "11")+"          "); 
					    tc11er.setBold(true);
					    
					    TextComponent tc12er = new TextComponent();
					    tc12er.setText(TaskConfigController.gettask(p, "12")+"          "); 
					    tc12er.setBold(true);
					    
					    TextComponent tc13er = new TextComponent();
					    tc13er.setText(TaskConfigController.gettask(p, "13")+"          "); 
					    tc13er.setBold(true);
					    
					    TextComponent tc14er = new TextComponent();
						tc14er.setText(TaskConfigController.gettask(p, "14")+"          "); 
					    tc14er.setBold(true);
						
						
					    TextComponent tc1e = new TextComponent();
						tc1e.setText("§0§l[§4X§0§l]§0");
					    tc1e.setBold(true);
					    tc1e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 1 !"));
					    tc1e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc1e.addExtra(tc1er);
					    TextComponent tc2e = new TextComponent();
						tc2e.setText("§0§l[§4X§0§l]§0"); 
					    tc2e.setBold(true);
					    tc2e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 2 !"));
					    tc2e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc2e.addExtra(tc2er);
					    TextComponent tc3e = new TextComponent();
						tc3e.setText("§0§l[§4X§0§l]§0"); 
					    tc3e.setBold(true);
					    tc3e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 3 !"));
					    tc3e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc3e.addExtra(tc3er);
					    TextComponent tc4e = new TextComponent();
						tc4e.setText("§0§l[§4X§0§l]§0"); 
					    tc4e.setBold(true);
					    tc4e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 4 !"));
					    tc4e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc4e.addExtra(tc4er);
					    TextComponent tc5e = new TextComponent();
						tc5e.setText("§0§l[§4X§0§l]§0"); 
					    tc5e.setBold(true);
					    tc5e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 5 !"));
					    tc5e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc5e.addExtra(tc5er);
					    TextComponent tc6e = new TextComponent();
						tc6e.setText("§0§l[§4X§0§l]§0"); 
					    tc6e.setBold(true);
					    tc6e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 6 !"));
					    tc6e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc6e.addExtra(tc6er);
					    TextComponent tc7e = new TextComponent();
						tc7e.setText("§0§l[§4X§0§l]§0"); 
					    tc7e.setBold(true);
					    tc7e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 7 !"));
					    tc7e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc7e.addExtra(tc7er);
					    TextComponent tc8e = new TextComponent();
						tc8e.setText("§0§l[§4X§0§l]§0"); 
					    tc8e.setBold(true);
					    tc8e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 8 !"));
					    tc8e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc8e.addExtra(tc8er);
					    
					    TextComponent tc9e = new TextComponent();
						tc9e.setText("§0§l[§4X§0§l]§0"); 
					    tc9e.setBold(true);
					    tc9e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 9 !"));
					    tc9e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc9e.addExtra(tc9er);
					    TextComponent tc10e = new TextComponent();
					    tc10e.setText("§0§l[§4X§0§l]§0"); 
					    tc10e.setBold(true);
					    tc10e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 10 !"));
					    tc10e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc10e.addExtra(tc10er);
					    TextComponent tc11e = new TextComponent();
					    tc11e.setText("§0§l[§4X§0§l]§0"); 
						tc11e.setBold(true);
					    tc11e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 11 !"));
					    tc11e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc11e.addExtra(tc11er);
					    TextComponent tc12e = new TextComponent();
					    tc12e.setText("§0§l[§4X§0§l]§0"); 
						tc12e.setBold(true);
					    tc12e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 12 !"));
					    tc12e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc12e.addExtra(tc12er);
					    TextComponent tc13e = new TextComponent();
					    tc13e.setText("§0§l[§4X§0§l]§0"); 
						tc13e.setBold(true);
					    tc13e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 13 !"));
					    tc13e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc13e.addExtra(tc13er);
					    
					    TextComponent tc14e = new TextComponent();
					    tc14e.setText("§0§l[§4X§0§l]§0"); 
					    tc14e.setBold(true);
					    tc14e.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/Realtask remove 14 !"));
					    tc14e.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4§lARE YOU SURE").create()));
					    tc14e.addExtra(tc14er);
					    p.sendMessage("-------------------");
					    p.spigot().sendMessage(tc1e);
					    p.spigot().sendMessage(tc2e);
					    p.spigot().sendMessage(tc3e);
					    p.spigot().sendMessage(tc4e);
					    p.spigot().sendMessage(tc5e);
					    p.spigot().sendMessage(tc6e);
					    p.spigot().sendMessage(tc7e);
					    p.spigot().sendMessage(tc8e);
					    p.spigot().sendMessage(tc9e);
					    p.spigot().sendMessage(tc10e);
					    p.spigot().sendMessage(tc11e);
					    p.spigot().sendMessage(tc12e);
					    p.spigot().sendMessage(tc13e);
					    p.spigot().sendMessage(tc14e);
					    p.sendMessage("-------------------");
					}else {p.sendMessage("§d typ <!> after /Realtask <finish> to finish you Tasks");}
				}else {sender.sendMessage("§d/Realtask <reset/finish> <!>");}	
			}else if (args.length == 1){
				if(args[0].equalsIgnoreCase("open")) {
					OpenTaskBook(p);
				}else{ sender.sendMessage("§d/Realtask <set/remove/reset/open> <number/!> <task/!>");}
			}else{ sender.sendMessage("§d/Realtask <set/remove/reset> <number/!> <task/!>");}
		}else {sender.sendMessage("§4you missing Permission");}
	}else {sender.sendMessage("§4you Have To be a Human-entity");}
	return true; 
}
	

  public void openBookInHand(Player player)
  {

        ByteBuf buf = Unpooled.buffer(256);
        buf.setByte(0, (byte)0);
        buf.writerIndex(1);
notify();
				try {
						Class<?> packetPlayOutCustomPayLoad = Class.forName("PacketPlayOutCustomPayload");
                		Class<?> packetDataSerializer = Class.forName("PacketDataSerializer");
                		Object packetData = packetDataSerializer.getConstructor(ByteBuf.class).newInstance(buf);
                		Object packet = packetPlayOutCustomPayLoad.getConstructor(String.class, packetDataSerializer).newInstance("MC|BOpen", packetData);

                		Object craftPlayer = player.getClass().getMethod("getHandle").invoke(player);
                		craftPlayer = craftPlayer.getClass().getField("playerConnection").get(craftPlayer);
                		craftPlayer.getClass().getMethod("sendPacket", Object.class).invoke(craftPlayer, packet);
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}


		/*PacketPlayOutCustomPayload packet = new PacketPlayOutCustomPayload("MC|BOpen", new PacketDataSerializer(;));
        CraftPlayer craftP = (CraftPlayer)player;
        craftP.g("")).playerConnection.sendPacket(packet);*/
    }
	
	
    public int getNextIDTask(String db) {
		ResultSet rs = RealMain.getMySQL().query("SELECT * FROM " + db + ";");
		int i = 0;
		try {
			while (rs.next()) {
				if (rs.getInt("ID") > i ) {
					i = rs.getInt("ID");
				}
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return i+1;
	}
    
    public void OpenTaskBook(Player p) {


		
		ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
		BookMeta bm = (BookMeta) book.getItemMeta();

	    
	    bm.setTitle("Tasks");
	    bm.setLore(Arrays.asList("You","§5Taskys"));
	    bm.setDisplayName("Tasks");
	    bm.addPage("§0§l[§a1 §0§l]§0"+TaskConfigController.gettask(p, "1")+ " \n"
	    			+ "§0§l[§a2 §0§l]§0"+TaskConfigController.gettask(p, "2")+" \n"
	    			+ "§0§l[§a3 §0§l]§0"+TaskConfigController.gettask(p, "3")+" \n"
	    			+ "§0§l[§a4 §0§l]§0"+TaskConfigController.gettask(p, "4")+" \n"
	    			+ "§0§l[§a5 §0§l]§0"+TaskConfigController.gettask(p, "5")+" \n"
	    			+ "§0§l[§a6 §0§l]§0"+TaskConfigController.gettask(p, "6")+" \n"
	    			+ "§0§l[§a7 §0§l]§0"+TaskConfigController.gettask(p, "7")+" \n"
	    			+ "§0§l[§a8 §0§l]§0"+TaskConfigController.gettask(p, "8")+" \n"
	    			+ "§0§l[§a9 §0§l]§0"+TaskConfigController.gettask(p, "9")+" \n"
	    			+ "§0§l[§a10§0§l]§0"+TaskConfigController.gettask(p, "10")+" \n"
	    			+ "§0§l[§a11§0§l]§0"+TaskConfigController.gettask(p, "11")+" \n"
	    			+ "§0§l[§a12§0§l]§0"+TaskConfigController.gettask(p, "12")+" \n"
	    			+ "§0§l[§a13§0§l]§0"+TaskConfigController.gettask(p, "13")+" \n"
	    			+ "§0§l[§a14§0§l]§0"+TaskConfigController.gettask(p, "14")+" \n");
	    book.setItemMeta(bm);
	    
	    
	    ItemStack s = p.getItemInHand();
	    ItemMeta sm = p.getItemInHand().getItemMeta();
	    RealMain.getMySQL().update("INSERT INTO player_task_ItemMata_save(ID , UUID , ITEM) VALUES (" + getNextIDTask("player_task_ItemMata_save") + ", '" + p.getUniqueId().toString() + "' , '" + sm + "' );");
	    s.setItemMeta(null);
		
	    RealMain.getMySQL().update("INSERT INTO player_task_Item_save(ID , UUID , ITEM) VALUES (" + getNextIDTask("player_task_Item_save") + ", '" + p.getUniqueId().toString() + "' , '" + s + "' );");        
	    
		RealMain.getMySQL().update("DELETE * FROM player_task_Item_save WHERE UUID='" + p.getUniqueId().toString() + "'AND ITEM= '" + s + "';");
		RealMain.getMySQL().update("DELETE * FROM player_task_ItemMata_save WHERE UUID='" + p.getUniqueId().toString() + "'AND ITEM= '" + sm + "';");
							    
	    
		p.setItemInHand(book);

		try
		{
			Object reflectionObject = p.getClass().getMethod("getHandle").invoke(p);
			Object itemStack = Class.forName("org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack").getMethod("asNMSCopy", ItemStack.class).invoke(null, book);
			reflectionObject.getClass().getMethod("openBook", itemStack.getClass()).invoke(reflectionObject, itemStack);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}

		openBookInHand(p);
		
		p.setItemInHand(s);
		p.getItemInHand().setItemMeta(sm);
    }
    
}