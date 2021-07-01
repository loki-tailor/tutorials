package com.lambda_expressions;

/*
 * created @ Thu Jul 01 2021 8:16:14 am
 * ref @ 
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.logics.t8.Product;
import com.logics.t8.ExampleData;

public class LambdaWithExceptions {
    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        try (FileWriter fw = new FileWriter("../resources/demo.txt")) {
            System.out.println("writing data to file...");

            products.forEach(product -> {
                fw.write(product.toString() + "\n");
                /*- above will give compile error:  Unhandled exception type IOExceptionJava(16777384)
                
                Reason: 
                    * forEach accepts a Consumer<? super Product>
                    * java.util.function.Consumer is an interface wtih 1 abstract method
                    * accept(Object o); 
                    * this method is called by forEach as "action.accept(t)"
                    * this method does not throw any checked exception
                    * that is this method does not have any throws clause
                    * hence when using forEach in lambda-expression
                    * checked exceptions are to be handled explicitly
                
                    > handling checked exceptions in side a lambda-expression
                    > makes the syntax verbose and defeats the purpose of using lambda expressoin
                    > as we have to handle checked exceptions inside try...catch in inside lambda expr.
                    > even if we catch, then what to do with it?
                    > now way to send-back outside - the checked exceptions which are raised inside-lambda expr
                
                */
            });

            // ###########################################################################
            /*- using enhanced for-loop 
            // to fie
            for (Product product : products) {
                fw.write(product.toString() + "\n");
            }
            System.out.println("data written to file using enhanced-for loop");
            */
            // ###########################################################################

        } catch (IOException e) {
            System.err.println("Exception occured : " + e.getMessage());
        } finally {
            System.out.println("this is finally...");
        }

    } // main-end

} // class-end
