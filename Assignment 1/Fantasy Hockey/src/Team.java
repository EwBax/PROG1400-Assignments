public class Team {
    //constants/magic numbers
    //BUDGET_MAX is 10 000 000 instead of 100 000.00 so that cents are randomly generated too
    static final double BUDGET_MAX = 10000000;
    static final double BUDGET_MIN = 0;
    static final int THREE_STAR_MIN_POINTS = 21;
    static final int TWO_STARS_MIN_POINTS = 10;
    static final int ONE_STAR_MIN_POINTS = 1;

    //Team properties - team name, players (3) - array, budget (random $0 - $100 000.00)
    String teamName;
    Player[] roster;
    double budget;

    //constructor method with parameters
    public Team(String teamName, Player[] roster) {
        this.teamName = teamName;
        this.roster = roster;
        //rounding then dividing by 100 for cents
        this.budget = (Math.random() * (BUDGET_MAX - (BUDGET_MIN + 1)) + BUDGET_MIN ) / 100;
    }

    //Constructor with no parameters
    public Team() {
        this.teamName = "default";
        this.roster = new Player[3];
        this.budget = (Math.random() * (BUDGET_MAX - (BUDGET_MIN + 1)) + BUDGET_MIN) / 100;
    }

    //total goals method
    public int totalGoals() {
        //loop through players and add goals
        int totalGoals = 0;
        for(Player p: roster) {
            totalGoals += p.numGoals;
        }
        return totalGoals;
    }

    //total assists method
    public int totalAssists() {
        //loop through players and add assists
        int totalAssists = 0;
        for(Player p: roster) {
            totalAssists += p.numAssists;
        }
        return totalAssists;
    }

    //team rating method
    public String rating() {
        //use totalGoals and totalAssists methods
        int totalPoints = this.totalGoals() + this.totalAssists();
        //calculating how many stars based on total points
        if(totalPoints >= THREE_STAR_MIN_POINTS) {
            return "*** stars";
        } else if (totalPoints >= TWO_STARS_MIN_POINTS) {
            return "** stars";
        } else if(totalPoints >= ONE_STAR_MIN_POINTS) {
            return "* star";
        } else {
            return "0 stars";
        }
    }

    //Team stats report method
    public void statsReport() {
        /*using totalGoals, totalAssists, teamRating methods output nicely formatted report
            including budget*/
        System.out.printf("%-30s\tG - %3d\t\tA - %3d\t\tTotal - %3d\t\tBudget - $%.2f\n",
                this.teamName + ":",
                this.totalGoals(),
                this.totalAssists(),
                this.totalGoals() + this.totalAssists(),
                this.budget
        );
        System.out.printf("Rating: %s\n", this.rating());
    }

}
