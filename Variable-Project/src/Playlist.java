import java.util.ArrayList;

public class Playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
	    desertIslandPlaylist.add("Shakira - Waka Waka");
	    desertIslandPlaylist.add("We are the world");
	    desertIslandPlaylist.add("WestLife - I have a dream");
	    desertIslandPlaylist.add("Cameroon Anthem - O cameroonair");
	    desertIslandPlaylist.add("Bob Mayley - Don't about a thing'");
	    System.out.println(desertIslandPlaylist);

	    desertIslandPlaylist.remove(3);
	    int a = desertIslandPlaylist.indexOf("Shakira - Waka Waka");
	    int b = desertIslandPlaylist.indexOf("WestLife - I have a dream");
	    String tempA = "Shakira - Waka Waka";
	    
	    // desertIslandPlaylist.get(2);
	    System.out.println(desertIslandPlaylist);
	    
	    desertIslandPlaylist.set(a, "WestLife - I have a dream");
	    desertIslandPlaylist.add("P-Square - Chop my money");
	    System.out.println(desertIslandPlaylist);
	    System.out.println(desertIslandPlaylist.size());

	}

}
