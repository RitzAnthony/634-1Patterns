package commandPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: commandPattern
 * Date: 3/24/2018
 */
public class Game implements ICommand {
    private Car car;
    private IUndo undoMethod;

    public Game() {
        this.car = new Car();
        this.undoMethod = car::backward;
    }

    public void pushKey(int keyNumber) {
        switch (keyNumber) {
            case 0: up();
                    undoMethod = car::backward;
                    break;
            case 1: down();
                    undoMethod = car::forward;
                    break;
            case 2: left();
                    undoMethod = car::right;
                    break;
            case 3: right();
                    undoMethod = car::left;
                    break;
        }
    }

    public void undo() {
        undoMethod.undo();
    }

    @Override
    public void up() {
        car.forward();
    }

    @Override
    public void down() {
        car.backward();
    }

    @Override
    public void left() {
        car.left();
    }

    @Override
    public void right() {
        car.right();
    }

    @FunctionalInterface
    public interface IUndo {
        public void undo();
    }
}
