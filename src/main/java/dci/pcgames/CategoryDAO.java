package dci.pcgames;

import java.util.List;

public interface CategoryDAO {
    List<Category> getCategories();
    List<Category> getCategoriesById(Long id);
}
