public class Account {
    public String id;
    public String name;

    @Override
    public String toString() {
        return String.format("%s/%s", id, name);
    }
}
