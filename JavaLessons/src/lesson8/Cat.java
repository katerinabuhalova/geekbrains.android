package lesson8;

public class Cat implements PhysicalAction {
    private String name;
    protected int maxRunLength;
    protected int maxJumpHeight;

    public Cat(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int length) {
        if (maxRunLength <= length) {
            System.out.println("Кот пробежал по беговой дорожке!");
            return true;
        } else {
            System.out.println("Кот не смог пробежать по беговой дорожке!");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (maxJumpHeight <= height) {
            System.out.println("Кот успешно перепрыгнул стену!");
            return true;
        } else {
            System.out.println("Кот не смог  перепрыгнуть  стену!");
            return false;
        }
    }
}
