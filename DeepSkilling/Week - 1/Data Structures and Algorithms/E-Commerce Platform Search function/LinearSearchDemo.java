public class LinearSearchDemo {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Education")
        };

        int searchId = 104;

        Product result = linearSearch(products, searchId);

        if (result != null) {
            System.out.println("Product Found:");
            System.out.println(result);
        } else {
            System.out.println("Product Not Found");
        }
    }
}