
package fuentes;

import java.util.ArrayList;

public class Team {
    private ArrayList<SoccerPlayer> team;
    public Team(){
        team = new ArrayList<>();
    }

    public ArrayList<SoccerPlayer> getTeam() {
        return team;
    }
    
    public void searchByPosition(String position){
        for (int i = 0; i < team.size(); i++) {
            if(position.equals(team.get(i).getPosition()))
                System.out.println("Player: "+team.get(i));
        }
    }
}
