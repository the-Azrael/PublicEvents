public class Movie extends Event {
    public Movie() {
    }

    public Movie(String title, int releaseYear, int age) {
        setTitle(title);
        setReleaseYear(releaseYear);
        setAge(age);
    }
}
