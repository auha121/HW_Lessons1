public class Team {

    private String nameTeam;
    Member[] member;

    public Team(String nameTeam, Member[] member) {
        this.nameTeam = nameTeam;
        this.member = member;

    }

    public void infoTeam() {
        System.out.println();
    }

    public void showResults() {
        System.out.println("Команда " + nameTeam);
        for (int i = 0; i < member.length; i++) {
            System.out.print("У участника " + (i+1) + " ");
            member[i].showResultsMem();
        }
    }

    /*public int powerDoIt(Member member) {
        return member.powerDoIt();
    }*/
}
