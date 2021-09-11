public class Course {

    private int[] course;

    public Course(int[] course) {
        this.course = course;
    }

    public void doIt(Team team) {
        for (int i = 0; i < team.member.length; i++) {
            for (int j = 0; j < course.length; j++) {
                if (team.member[i].powerDoIt() < course[j]) {
                    System.out.println("Препядствие не преодалимо для " + i + " участника. Нет столько энергии");
                    break;
                }
                else {
                    team.member[i].overcome(course[j]);

                }
            }
            team.member[i].overcomeRez();
        }
    }
}
