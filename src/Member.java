public class Member {

    private int power;
    private boolean result;

    public Member(int power, boolean result) {
        this.power = power;
        this.result = result;
    }

    public void setPower(int power) {
        if (power <= 0) {
            System.out.println("Нет энергии для прохождения препядствия!");
        }
        else {
            this.power = power;
        }
    }

    public void overcome(int cour) {
        power = power - cour;
    }

    public void overcomeRez() {
        result = true;
    }

    public int powerDoIt() {
        return power;
    }

    public void showResultsMem() {
            System.out.println("энергии осталось " + power + " преодаление " + result);
    }
}
