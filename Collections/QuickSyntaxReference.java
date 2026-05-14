// // ArrayList
// ArrayList<String> list = new ArrayList<>();
// list.add("x"); list.add(0,"x"); list.get(0); list.remove(0);
// list.set(0,"x"); list.contains("x"); list.size(); list.clear();
// list.sort(Comparator.naturalOrder());

// // TreeSet — natural order
// TreeSet<Integer> ts = new TreeSet<>();
// // TreeSet — custom order
// TreeSet<Student> ts = new TreeSet<>((a,b) -> a.marks - b.marks);
// ts.add(x); ts.remove(x); ts.first(); ts.last();
// ts.headSet(x); ts.tailSet(x); ts.subSet(a,b);

// // HashMap
// HashMap<String,Integer> map = new HashMap<>();
// map.put(k,v); map.get(k); map.remove(k);
// map.containsKey(k); map.getOrDefault(k, def);
// map.putIfAbsent(k,v); map.entrySet(); map.keySet(); map.values();

// // Deque (as Stack)
// Deque<Integer> stack = new ArrayDeque<>();
// stack.push(x); stack.pop(); stack.peek();

// // Deque (as Queue)
// Deque<String> queue = new ArrayDeque<>();
// queue.offer(x); queue.poll(); queue.peek();

// // Deque (full)
// deque.addFirst(x); deque.addLast(x);
// deque.removeFirst(); deque.removeLast();
// deque.peekFirst(); deque.peekLast();



// ARRAYLIST:
//   ✓ Internal: Object[] array, default capacity 10
//   ✓ Growth: 1.5× (oldCap + oldCap>>1)
//   ✓ get/set: O(1) | add-end: O(1)* | add-mid/remove: O(n)
//   ✓ Use: random access, read-heavy operations

// TREESET:
//   ✓ Internal: Red-Black Tree (via TreeMap)
//   ✓ Always sorted, no duplicates, no null
//   ✓ Requires Comparable or Comparator
//   ✓ compareTo()==0 means duplicate → rejected
//   ✓ All ops: O(log n)
//   ✓ Use: sorted unique elements, range queries

// HASHMAP:
//   ✓ Internal: array of linked lists (buckets)
//   ✓ Default: 16 buckets, 0.75 load factor
//   ✓ All ops: O(1) average
//   ✓ Must override hashCode() AND equals() for custom keys
//   ✓ Keys should be immutable (String, Integer best)
//   ✓ Java 8+: chains → tree when length > 8

// DEQUE (ArrayDeque):
//   ✓ Internal: circular array
//   ✓ All ops: O(1) amortized
//   ✓ Prefer over Stack class (no synchronization overhead)
//   ✓ Use as stack (push/pop) or queue (offer/poll) or both