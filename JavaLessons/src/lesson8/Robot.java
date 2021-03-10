package lesson8;

public class Robot implements PhysicalAction {
    private String name;
    protected int maxRunLength;
    protected int maxJumpHeight;

    public Robot(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean jump(int height) {
        if (maxJumpHeight <= height) {
            System.out.println("Робот перепрыгнул стену!");
            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть стену!");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (maxRunLength <= length) {
            System.out.println("Робот с трудом  пробежал на беговой дорожке!");
            return true;
        } else {
            System.out.println("Робот не смог  пробежать на беговой дорожке!");
            return false;
        }
    }
}
