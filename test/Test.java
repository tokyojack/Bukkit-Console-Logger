package nameOfPackage;

public class Test {

	public void complementPlayer(String playerName) {
		Player player = Bukkit.getPlayer(playerName);
		
		if (player == null) {
			Console.ERROR.log("Cannot get player! (offline)");
			return;
		}

		player.sendMessage("You're a nice person :).");
		Console.SUCCESS.log("Successfully messaged a person!");
	}

}