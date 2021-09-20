
public class MadLibs {
	/* 
	In this project, I’ll use Java to write a Mad Libs word game! 
	Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).

	Mad Libs require:

	A short story with blank spaces (asking for different types of words).
	Words from the player to fill in those blanks.
	“Roses are Red” poem example:
	 */
	
	/*
	  Your description here
	  This program generates a mab libbed story.
	  Authir: Laura
	  Date: 2/19/2049
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "Jean Baptiste";
	    String adjective1 = "Strong";
	    String adjective2 = "Powerful";
	    String adjective3 = "Active";
	    String verb1 = "Playing";
	    String noun1 = "Chelsea";
	    String noun2 = "Didier Drogba";
	    String noun3 = "Football";
	    String noun4 = "Cameroon";
	    String noun5 = "Lion";
	    String noun6 = "Tiger";
	    String name2 = "Elias Asong";
	    int number = 1880;
	    String place1 = "Linden";
	    
	      
	      //The template for the story
	      String story = "This morning "+name1+" woke up feeling "+adjective1+"."
	      		+ " 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s "
	      				+ "were protesting to keep "+noun2+" in stores. They began to "+verb1+" "
	      						+ "to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". "
	      								+ "Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" "
	      										+ "in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
	      
	      System.out.println(story);
	      
	}
}