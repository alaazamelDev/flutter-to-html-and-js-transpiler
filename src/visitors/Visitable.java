package visitors;

public interface Visitable {

    <T> T accept(Visitor<T> visitor);
}
