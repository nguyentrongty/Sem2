package lession17;

public class Line {

    private Point begin, end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
    }
}
