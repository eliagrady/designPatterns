package commonClasses;

/**
 * This class represents a 4-way direction element.
 * It has four strongly typed directions that represent
 * each of the four basic sides: North ,South ,East and West.
 */
public final class Direction {
    private String _direction;
    private Direction(String direction) {
        _direction = direction;
    }
    public final static Direction North = new Direction("North");
    public final static Direction South = new Direction("South");
    public final static Direction East = new Direction("East");
    public final static Direction West = new Direction("West");

    public String toString() {
        return _direction;
    }
}
