package test;
import fuentes.SoccerPlayer;
import fuentes.Team;

public class TestTeam {
    public static void main(String[] args) {
        Team bestOfWorld=new Team();
        SoccerPlayer sp1=new SoccerPlayer("Lionel Messi",29,10,"Forward","Argentinian",170,60);
        SoccerPlayer sp2=new SoccerPlayer("Neymar",23,11,"Forward","Brazilian",175,55);
        SoccerPlayer sp3=new SoccerPlayer("Chichadios",28,7,"Forward","Mexican",175,75);
        bestOfWorld.getTeam().add(sp3);
        bestOfWorld.getTeam().add(sp1);
        bestOfWorld.getTeam().add(sp2);
        bestOfWorld.searchByPosition("Forward");
        bestOfWorld.searchByName("Chichadios");
        bestOfWorld.searchByNationality("Brazilian");
    }
}
