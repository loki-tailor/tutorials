package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExercise03 {

    public enum PriceRange {
        CHEAP, MEDIUM, EXPENSIVE
    }

    /**
     * Exercise 3: Group products by price range.
     *
     * @param products       A list of products.
     * @param cheapLimit     Products cheaper than this are considered cheap.
     * @param expensiveLimit Products more expensive than this are considered expensive.
     * @return A map containing the cheap, medium and expensive products in separate lists.
     */
    public Map<PriceRange, List<Product>> groupProductsByPriceRange(List<Product> products, BigDecimal cheapLimit, BigDecimal expensiveLimit) {
        // TODO: Group products by price range.
        //
        // - A product is CHEAP if its price is less than cheapLimit.
        // - A product is EXPENSIVE if its price is more than expensiveLimit.
        // - A product is MEDIUM if its price is between cheapLimit and expensiveLimit.
        //
        // Hint: Look carefully at the type of the keys of the map that this method should return. It tells you something about the classifier function.
        // What relation does this have with the classifier function that you use when using a grouping operation?

//        return products.stream()...;

        /*- APPROACH 1 : my approach
        Map<Boolean, List<Product>> cheap = products.stream().collect(Collectors.partitioningBy(product -> product.getPrice().compareTo(cheapLimit) < 0));
        Map<Boolean, List<Product>> expensive = products.stream().collect(Collectors.partitioningBy(product -> product.getPrice().compareTo(expensiveLimit) > 0));
        Map<Boolean, List<Product>> medium = products.stream().collect(Collectors.partitioningBy(product -> product.getPrice().compareTo(cheapLimit) > 0 && product.getPrice().compareTo(expensiveLimit) < 0));

        List<Product> cheapList = products.stream().filter(product -> product.getPrice().compareTo(cheapLimit) < 0).collect(Collectors.toList());

        Map<PriceRange, List<Product>> map = new HashMap<>();
        map.put(PriceRange.CHEAP, cheapList);
        map.put(PriceRange.EXPENSIVE, expensive.get(true));
        map.put(PriceRange.MEDIUM, medium.get(true));

        return  map;

        */

        /*- APPROACH 2 : in the discussion forum */

        Map<PriceRange, List<Product>> collect = products.stream()
                .collect(
                        Collectors.groupingBy(
                                product -> priceClassifier(product, cheapLimit, expensiveLimit),
                                Collectors.toList()
                        )
                );

        return collect;

//        throw new UnsupportedOperationException("Not yet implemented"); // Remove this line
    }

    private static PriceRange priceClassifier(Product product, BigDecimal cheapLimit, BigDecimal expensiveLimit) {
        if (product.getPrice().compareTo(cheapLimit) < 0) {
            return PriceRange.CHEAP;
        }
        if (product.getPrice().compareTo(expensiveLimit) < 0 && product.getPrice().compareTo(cheapLimit) > 0) {
            return PriceRange.MEDIUM;
        }
        return PriceRange.EXPENSIVE;
    }
}
