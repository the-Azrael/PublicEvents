public class Theatre extends Event {
    public Theatre(String title, int releaseYear, int age) {
        setTitle(title);
        setReleaseYear(releaseYear);
        setAge(age);
    }

    public Theatre() {
        this(null, 0, 0);
    }

    public Theatre(String title) {
        this(title, 0, 0);
    }
}
