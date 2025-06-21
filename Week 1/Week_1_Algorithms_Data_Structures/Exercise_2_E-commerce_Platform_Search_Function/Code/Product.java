import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> productId;
    private List<String> productName;
    private List<String> category;

    Product(List<String> productId, List<String> productName, List<String> category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int searchProductId(String key) {
        return Search.binarySearch(productId, key);
    }

    public int searchProductName(String key) {
        return Search.binarySearch(productName, key);
    }

    public int searchCategory(String key) {
        return Search.binarySearch(category, key);
    }
}
