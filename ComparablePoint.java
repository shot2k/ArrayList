public int compareTo(Point2D other) {
    double distance = Math.sqrt((getX()*getX()) + (getY()*getY()));
    double otherDistance = Math.sqrt((other.getX()*other.getX()) + (other.getY()*other.getY()));
    if (distance < otherDistance) {
        return -1;
    } else if (distance == otherDistance) {
        return 0;
    } else {
        return 1;
    }
}