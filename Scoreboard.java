public class Scoreboard{
    private boolean team1Active = true;
    private int team1Score;
    private int team2Score;
    private String team1;
    private String team2;
    public Scoreboard(String one, String two){
        team1 = one;
        team2 = two;
    }
    //private String teamOnName=team1;
    public void recordPlay(int pointsScored){
        if(pointsScored == 0){
            team1Active = !team1Active;
        }
        else{
            if (team1Active == true && pointsScored > 0) {
                team1Score=team1Score+pointsScored;
                team1Active = true;                
            }
            if (team1Active == false && pointsScored > 0){
                team2Score = team2Score + pointsScored;
                team1Active = false;
            }
        }
            
        
    }

    public String getScore(){
        String s = team1Score + "-" + team2Score + "-";
        if(team1Active) s += team1;
        else s+= team2;
        return s;
    }
}