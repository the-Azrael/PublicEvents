public abstract class Event {
    private String title;
    private int releaseYear;
    private int age;

    @Override
    public String toString() {
        return this.title + " - " + this.releaseYear + " - " + this.age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }
}
