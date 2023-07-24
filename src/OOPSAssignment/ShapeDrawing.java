package OOPSAssignment;

abstract class Shapes {
    public abstract void draw();
}
class Line extends Shapes {
    @Override
    public void draw() {
        System.out.println("Drawing a Line.");
    }
}

class Rectangle extends Shapes {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Cube extends Shapes {
    @Override
    public void draw() {
        System.out.println("Drawing a Cube.");
    }
}

public class ShapeDrawing {
    public static void main(String[] args) {
        Shapes line = new Line();
        Shapes rectangle = new Rectangle();
        Shapes cube = new Cube();


        line.draw();
        rectangle.draw();
        cube.draw();
    }
}
