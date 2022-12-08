public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[] {
                new Movie("Начало", 2010, 16),
                new Movie("Матрица", 1999, 16),
                new Movie()
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Ревизор", 2017, 12)
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle() == null || event.getAge() == 0 || event.getReleaseYear() == 0) {
            throw new RuntimeException();
        }
    }

}
