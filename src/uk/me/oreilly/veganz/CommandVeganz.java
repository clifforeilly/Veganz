package uk.me.oreilly.veganz;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by cliff on 03/04/16.
 */
public class CommandVeganz implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String player, String[] switches){

        if (sender instanceof Player){
            Player plyr = (Player) sender;
            plyr.getInventory().addItem(new ItemStack(Material.DIAMOND));
        }

        return true;
    }

}
