public class Player {

    //player properties - name, number of goals, number of assists, team name
    String playerName;
    int numGoals;
    int numAssists;

    //constructor method with parameters
    public Player(String playerName, int numGoals, int numAssists) {
        this.playerName = playerName;
        this.numGoals = numGoals;
        this.numAssists = numAssists;
    }

    //blank constructor
    public Player() {
        this.playerName = "default";
        this.numGoals = 0;
        this.numAssists = 0;
    }

    //playerReport method
    public void statsReport() {
        /*output nicely formatted report with team name, player name, goals, assists,
            total(goals+assists)*/
        System.out.printf("%-30s\tG - %3d\t\tA - %3d\t\tTotal - %3d\n",
                (this.playerName + ":"),
                this.numGoals,
                this.numAssists,
                (this.numGoals + this.numAssists));
    }
}
