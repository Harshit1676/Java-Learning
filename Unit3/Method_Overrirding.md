OVERRIDING: Child class provides its OWN implementation
            of a method already defined in parent class.

RULES:
  ✓ Same method NAME
  ✓ Same parameter LIST (type, number, order)
  ✓ IS-A relationship (child overrides parent's method)
  ✓ Return type: same OR covariant (subtype of parent's return type)
  ✓ Access: child's access can be SAME or MORE permissive
            (can't narrow: protected → private is ILLEGAL)
  ✗ Cannot override: static, final, private methods

OVERRIDING vs OVERLOADING:
  Overloading → SAME class, different parameters  → COMPILE TIME
  Overriding  → PARENT-CHILD classes, same params → RUNTIME