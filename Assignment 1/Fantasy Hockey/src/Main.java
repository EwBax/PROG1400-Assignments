import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //constants / magic numbers
    static final int TEAM_ROSTER_SIZE = 3;
    static final int AMOUNT_OF_TEAMS = 3;
    static final int MIN_NAME_LENGTH = 3;
    static final int MIN_GOALS_OR_ASSISTS = 0;
    //Scanner used for getting user input from terminal
    static Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        //print welcome message
        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("================================");

        //calling method to get user input for team names
        Team[] teamList = inputTeamNames();

        System.out.println("\nPLAYER ENTRY");
        System.out.println("================================");

        //loop for each team to get user to input roster
        for(int i = 0; i < AMOUNT_OF_TEAMS; i++) {
            System.out.printf("Enter players for team %s:\n", teamList[i].teamName);
            //calling method to get user to input player details
            teamList[i].roster = inputRoster();
        }

        System.out.println("\nREPORT: Stats per Team");
        System.out.println("================================");

        //for each team
        for(Team t: teamList) {
            //team stats report
            t.statsReport();
        }

        System.out.println("\nREPORT: Stats per Player");
        System.out.println("================================");

        //for each team
        for(Team t: teamList) {
            //for each player
            for(Player p: t.roster) {
                //prints team name
                System.out.println(t.teamName);
                //player stats report
                p.statsReport();
            }
        }
    }

    //Method for user to enter integer value with prompt
    public static int getIntInput(String prompt) {
        //variable for user input
        int input = 0;
        //boolean to control while loop
        boolean goodInput = false;
        while(!goodInput) {
            System.out.print(prompt);
            try{
                input = terminal.nextInt();
                //only reaches this line if valid int entered, so loops infinitely until then
                goodInput = true;
            } catch (InputMismatchException e) {
                //tells user they must enter an integer
                System.out.println("You must enter an integer value.");
            }
            //clears the scanner buffer of unwanted/unused characters
            terminal.nextLine();
        }
        return input;
    }

    //Method for user to enter String value with prompt
    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        return  terminal.nextLine();
    }

    //Method to get team names from user input
    static Team[] inputTeamNames() {
        //array to hold the teams
        Team[] teamList = new Team[AMOUNT_OF_TEAMS];
        //loop for each team
        for(int i = 0; i < AMOUNT_OF_TEAMS; i++) {
            //creating the team
            teamList[i] = new Team();
            String teamName = "";
            //while loop and if statement validate name is proper length
            while(teamName.length() <  MIN_NAME_LENGTH) {
                teamName = getStringInput("Enter name for team # " + (i + 1) + ":\n");
                if(teamName.length() < MIN_NAME_LENGTH) {
                    System.out.printf("Team name must be at least %d characters long.\n",
                            MIN_NAME_LENGTH);
                }
            }
            teamList[i].teamName = teamName;
        }
        return teamList;
    }

    //Method for user input for player details
    static Player[] inputRoster() {
        Player[] roster = new Player[TEAM_ROSTER_SIZE];
        for(int i = 0; i < TEAM_ROSTER_SIZE; i++) {
            roster[i] = new Player();
            roster[i].playerName = inputPlayerName(i + 1);
            //user enters players goals
            roster[i].numGoals = inputGoalsOrAssists(roster[i], "goals");
            //user enters players assists
            roster[i].numAssists = inputGoalsOrAssists(roster[i], "assists");
        }
        return  roster;
    }

    //method for user to input player name
    static String inputPlayerName(int rosterPosition) {
        String playerName = "";
        //user enters player name. While loop and if statement validate name proper length
        while(playerName.length() <  MIN_NAME_LENGTH) {
            playerName = getStringInput("Enter name for player # " + rosterPosition + ":\n");
            if(playerName.length() < MIN_NAME_LENGTH) {
                System.out.printf("Player names must be at least %d characters long.\n",
                        MIN_NAME_LENGTH);
            }
        }
        return playerName;
    }

    static int inputGoalsOrAssists(Player p, String goalsOrAssists) {
        //starting at MIN_GOALS_OR_ASSISTS-1 so that we are guaranteed to enter the while loop
        int input = MIN_GOALS_OR_ASSISTS - 1;
        //while loop condition and if statement validate goals and assists not < 0
        while(input < MIN_GOALS_OR_ASSISTS) {
            input = getIntInput("Enter number of " + goalsOrAssists + " for player "
                    + p.playerName + ":\n");
            if(input < MIN_GOALS_OR_ASSISTS) {
                System.out.printf("Players cannot have less than %d %s.\n",
                        MIN_GOALS_OR_ASSISTS, goalsOrAssists);
            }
        }
        return input;
    }
}
