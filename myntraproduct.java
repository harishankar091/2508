public class myntraproduct {
    public static void main(String[] args) {
        // Product Info
        String brand = "HIGHLANDER";
        String productName = "Men Comfort Relaxed Fit Textured Spread Collar Casual Shirt";

        // Ratings
        double rating = 4.6;
        int numberOfRatings = 5;

        // Pricing
        double mrp = 3949.00;
        double discountPercentage = 81.0;
        double sellingPrice = 750.00;

        // Sizes
        int size1 = 39;
        int size2 = 40;
        int size3 = 42;
        int size4 = 44;

        // Output
        System.out.println("Brand: " + brand);
        System.out.println("Product: " + productName);
        System.out.println("Rating: " + rating + " stars (" + numberOfRatings + " ratings)");
        System.out.println("MRP: ₹" + mrp);
        System.out.println("Discount: " + discountPercentage + "% OFF");
        System.out.println("Selling Price: ₹" + sellingPrice);
        System.out.println("Available Sizes: " + size1 + ", " + size2 + ", " + size3 + ", " + size4);
    }
}

