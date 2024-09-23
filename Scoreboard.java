public class Scoreboard{
    private boolean team1Active;
    private boolean team1Score;
    private boolean team2Score;
    private String teamOnName
    public Scoreboard(String team1, String team2){
        team1Active = true;
        if team1Active = true{
            teamOnName= team1;
        }
        else{
            teamOnName = team2
        }
    }
    public static void recordPlay(int pointsScored)
    {
        if (pointsScored > 0 && team1Active = true){
            int team1Score += pointsScored;
            if(pointsScored > 0 && team1Active = false){
                int team2Score += pointsScored;
            }
        else{
            !team1Active;
        }
        }
    }
    public static void getScore(){
        return System.out.print("The current score is " + team1Score + "-" + team2Score + "- Team active is" + teamOnName);
    }
}
