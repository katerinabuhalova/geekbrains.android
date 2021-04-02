package lesson8;

public class Person  implements PhysicalAction {
    private String name;
    protected int maxRunLength;
    protected int maxJumpHeight;

    public Person(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean jump(int height) {
        if (maxJumpHeight <= height) {
            System.out.println("Человек без труда перепрыгнул стену!");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть стену!");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (maxRunLength <= length) {
            System.out.println("Человек пробежал по беговой дорожке успешно!");
            return true;
        } else {
            System.out.println("Человек не смог пробежать по беговой дорожке успешно!");
            return false;
        }
    }
}
