public class Transformer {
    private String name;
    private Gun leftgun;
    private Gun rightGun;

    public Transformer(String name, Gun leftgun, Gun rightGun) {

    }

    public Gun getLeftgun() {
        return leftgun;
    }

    public void setLeftgun(Gun leftgun) {
        this.leftgun = leftgun;
    }

    public Gun getRightGun() {
        return rightGun;
    }

    public void setRightGun(Gun rightGun) {
        this.rightGun = rightGun;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
