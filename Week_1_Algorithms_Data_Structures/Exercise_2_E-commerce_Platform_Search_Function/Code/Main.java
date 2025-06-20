import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> productId = new ArrayList<>();
        List<String> productName = new ArrayList<>();
        List<String> category = new ArrayList<>();

        productId.add("P001");
        productId.add("P002");
        productId.add("P003");

        productName.add("aaa");
        productName.add("bbb");
        productName.add("ccc");

        category.add("xxx");
        category.add("yyy");
        category.add("zzz");

        Product p = new Product(productId, productName, category);
        System.out.println(p.searchProductId("P002"));
        System.out.println(p.searchProductName("aaa"));
        System.out.println(p.searchCategory("zzz"));
    }
}