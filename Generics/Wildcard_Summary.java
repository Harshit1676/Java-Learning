// HIERARCHY:
//           Object
//             |
//           Number
//         /   |   \
//     Integer Double Float
//       |
//     (nothing below Integer as primitive wrapper)

// WILDCARD CHEAT SHEET:
// ┌──────────────────┬────────────────────────────┬──────────┬──────────┐
// │ Wildcard         │ Accepts                    │ Can Read │ Can Write│
// ├──────────────────┼────────────────────────────┼──────────┼──────────┤
// │ List<?>          │ Any List                   │ Object   │ No       │
// │ List<? extends N>│ List<N> + subclasses       │ N        │ No       │
// │ List<? super N>  │ List<N> + superclasses     │ Object   │ Yes (N)  │
// │ List<Number>     │ ONLY List<Number>          │ Number   │ Yes      │
// └──────────────────┴────────────────────────────┴──────────┴──────────┘