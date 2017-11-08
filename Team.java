package Chapter4;


public class Team
{
    private String teamName;
    private Athlete [] player;
    private int index;
    public Team(String team, int numPlayers)
    {
        this.teamName=team;
        this.player = new Athlete[numPlayers];
    }
    public void addAthlete(Athlete ag, int index) {
        player[index] = ag;
        
    }
    public String toString(){
        String output = "the team name is " + teamName + "there are " + player + "on the team";
        for(Athlete ag : player) {
            output += ag + "ln";
        }
        return output;
    }
}
