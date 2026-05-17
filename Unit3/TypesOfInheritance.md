1. SINGLE INHERITANCE:          A → B
   class B extends A {}

2. MULTILEVEL INHERITANCE:      A → B → C
   class B extends A {}
   class C extends B {}         (C gets A's AND B's members)

3. HIERARCHICAL INHERITANCE:    A → B
                                A → C
   class B extends A {}         (multiple children from one parent)
   class C extends A {}

4. MULTIPLE INHERITANCE:        A, B → C
   NOT SUPPORTED with classes!
   // class C extends A, B {}  ← COMPILE ERROR!
   // Reason: Diamond Problem (explained in Interfaces section)
   SOLUTION: Use Interfaces for multiple inheritance.