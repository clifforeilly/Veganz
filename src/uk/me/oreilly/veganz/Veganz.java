package uk.me.oreilly.veganz;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by cliff on 03/04/16.
 */
public class Veganz extends JavaPlugin{

    @Override
    public void onEnable(){

        //this.getCommand("veganz").setExecutor(new CommandVeganz());
    }

    @Override
    public void onDisable(){

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String player, String[] switches){

        if(cmd.getName().equalsIgnoreCase("veganz")) {
            sender.sendMessage("Giving diamonds...");

            if (sender instanceof Player){
                Player plyr = (Player) sender;
                plyr.getInventory().addItem(new ItemStack(Material.DIAMOND));
            }
        }

        return true;
    }

}
