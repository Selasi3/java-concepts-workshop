/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    private int numberOfPlayers =11;
    private String name ="Football";


    @Override
    String getName() {
        return this.name;
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println( "Each team has " + this.numberOfPlayers + " players in " + this.getName());
    }


}

