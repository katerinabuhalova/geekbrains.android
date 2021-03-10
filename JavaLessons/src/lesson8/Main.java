package lesson8;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик", 50, 30);
        Person person = new Person("Игорь", 30, 15);
        Robot robot = new Robot("Tod", 100, 20);
        RunningTrack track = new RunningTrack(40);
        Wall wall = new Wall(20);

        PhysicalAction[] participants = {cat, person, robot};
        Obstacle[] obstacles = {track, wall};

        for (PhysicalAction p : participants) {
            for (Obstacle o : obstacles) {
                if (!o.pass(p)) {
                    break;
                }
            }
        }
    }
}
