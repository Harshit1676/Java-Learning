// Object class methods demonstration
class Product {
    String name;
    double price;
    int    id;

    Product(int id, String name, double price) {
        this.id    = id;
        this.name  = name;
        this.price = price;
    }

    // ── OVERRIDING toString() ──────────────────────────────────────
    // Default: "Product@1b6d3586" (ClassName@hashCode) — useless!
    // Override: provide meaningful string representation
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name +
               "', price=₹" + price + "}";
    }

    // ── OVERRIDING equals() ───────────────────────────────────────
    // Default: == comparison (checks if SAME object in memory)
    // Override: compare by business logic (same id = same product)
    @Override
    public boolean equals(Object obj) {
        // Step 1: Same reference? Definitely equal.
        if (this == obj) return true;

        // Step 2: Is obj null? Can't be equal.
        if (obj == null) return false;

        // Step 3: Same class? Must be same type to compare.
        if (getClass() != obj.getClass()) return false;

        // Step 4: Cast and compare meaningful fields
        Product other = (Product) obj;   // Safe cast — we verified class
        return this.id == other.id;      // Same product ID = same product
        // Or compare multiple fields:
        // return this.id == other.id && this.name.equals(other.name);
    }

    // ── OVERRIDING hashCode() ─────────────────────────────────────
    // RULE: If equals() returns true, hashCode() MUST return same value
    // Used by HashMap, HashSet, etc.
    @Override
    public int hashCode() {
        return Integer.hashCode(id);  // Based on id (same as equals logic)
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 75000.0);
        Product p2 = new Product(101, "Laptop", 75000.0);  // Same content
        Product p3 = new Product(102, "Phone",  25000.0);  // Different

        // toString() — called automatically in println!
        System.out.println(p1);
        // WITHOUT override: Product@1b6d3586
        // WITH override:    Product{id=101, name='Laptop', price=₹75000.0}

        // equals() — content comparison
        System.out.println(p1 == p2);         // false (different objects in heap!)
        System.out.println(p1.equals(p2));    // true  (same id!)
        System.out.println(p1.equals(p3));    // false (different id)

        // getClass() — runtime class info
        System.out.println(p1.getClass().getName());       // "Product"
        System.out.println(p1.getClass().getSimpleName()); // "Product"
    }
}