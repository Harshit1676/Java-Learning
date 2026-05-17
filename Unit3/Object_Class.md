Every class in Java IMPLICITLY extends Object class.
Even if you write:  class Animal { }
Java sees it as:    class Animal extends Object { }

Object class provides fundamental methods:
  toString()  → String representation of object
  equals()    → Content comparison
  hashCode()  → Integer hash for use in collections
  getClass()  → Returns Class object (reflection)
  clone()     → Creates copy (must implement Cloneable)
  finalize()  → Called before GC (deprecated)
  wait()/notify()/notifyAll() → Thread coordination