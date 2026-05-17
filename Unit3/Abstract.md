You're designing a Shape system (Circle, Rectangle, Triangle).
All shapes have area and perimeter — but calculation is DIFFERENT for each.

If you write a concrete Shape class with area() method:
  double area() { return 0; }  // What does "generic shape area" mean? NOTHING!

Child classes might FORGET to override area() — and use 0 silently!
No compile-time enforcement → bugs at runtime.

SOLUTION: Abstract method — force every child to provide implementation.