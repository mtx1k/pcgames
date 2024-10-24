package dci.pcgames;

public record PCGame(
        Long id,
        String name,
        Category category,
        double price
) {
}
