public class HW_Lessons1 {

    public static void main(String[] args) {
        Member[] member1 = new Member[4];
        Member[] member2 = new Member[4];

        member1[0] = new Member(500, false);
        member1[1] = new Member(200, false);
        member1[2] = new Member(425, false);
        member1[3] = new Member(312, false);

        member2[0] = new Member(451, false);
        member2[1] = new Member(357, false);
        member2[2] = new Member(300, false);
        member2[3] = new Member(112, false);

        Team team1 = new Team("Сильнее", member1); // Создаем команду
        Team team2 = new Team("Выше", member2);

        int[] cour = {20, 30, 40, 50, 6};

        Course course = new Course(cour); // Создаем полосу препятствий

        course.doIt(team1); // Просим команду пройти полосу
        team1.showResults(); // Показываем результаты
        course.doIt(team2);
        team2.showResults();
    }
}
