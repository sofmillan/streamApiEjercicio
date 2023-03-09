import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Rice",30.5,"Food",50));
        products.add(new Product("Milk",20.0,"Food",0));
        products.add(new Product("Laptop",1500.0,"Electronics",10));
        products.add(new Product("TV",800.0,"Electronics",5));
        products.add(new Product("Table",120.0,"Home",50));



        List<Product> group1 =
                products.stream()
                        .filter(product -> product.getStock()>0 && product.getPrice()<50)
                        .collect(Collectors.toList());


        List<String> group2 =
                products.stream()
                        .filter(product -> product.getCategory() == "Food")
                        .map(product->product.getName())
                        .collect(Collectors.toList());

     
        double total = products.stream()
                .mapToDouble(product->product.getPrice())
                .sum();




    }
}