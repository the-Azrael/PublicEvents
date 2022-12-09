public class Movie extends Event {
    public Movie(String title) {
        this(title, 0, 0);
    }

    public Movie(String title, int releaseYear, int age) {
        setTitle(title);
        setReleaseYear(releaseYear);
        setAge(age);
    }
}
