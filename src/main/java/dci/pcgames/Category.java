package dci.pcgames;

public record Category(
        long id,
        String name,
        Category category,
        double price
) {
}
