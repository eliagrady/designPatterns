package commonClasses;

/**
 * Created by Elia on 15/07/2014.
 */
public class Wall extends MapSite {
    private static int _wallCount = 1;
    private int _wallNumber;

    public Wall() {
        _wallNumber = _wallCount++;
        System.out.println("creating Wall #" + new Integer(_wallNumber).toString());
    }

    public String toString() {
        return "Wall #" + new Integer(_wallNumber).toString();
    }
}
