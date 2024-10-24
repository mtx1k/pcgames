package dci.pcgames;

public record PCGame(
        Long id,
        String name,
        Long categoryId,
        Double price
) {
}
