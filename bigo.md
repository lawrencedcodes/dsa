# Big O Notation

A theoretical measure of the execution of an algorithm, usually the time or memory needed, given the problem size which is usually the number of items. Informally, saying some equation f(n) = O(g(n)) means it is less than some constant multiple of g(n). The notation is read "f of n is big oh of g of n".
Also see: Big Theta, Big Omega, asymptotic upper bound


## Common Notations

- O(1) - Constant Time. Random access of an element in an array. Inserting at the beginning of a Linked List
- O(log n) - logarithmic time. Binary search
- O(n) - linear time. Looping through elements in an array. Searching through a linked list
- O(n log n) - quasilinear time. quicksort, mergesort, heapsort
- O(n^^2) - quadratic time. insertion sort, selection sort, bubblesort, nested for loops
- O(n!) - factorial time. Travelling salesman problem

### Helpful hints

- Drop the constants
- Drop the less significant terms
- We're typically interested in the behavior as the input set gets very large (scales)
- Another way to think about it is usually, we're talking about the "worst case"

### Strings

- Know comparison, joining, splitting, searching, replaing, parsing
- Know how they're represented in memory
- Know String class and StringBuilder class
- Know charAt, compareTo, concat, contains, endsWith, indexOf, lastIndexOf, length, replae, split, startsWith, substring, toCharArray, toLowerCase, trim
- Know apppend, charAt, delete, deleteCharAt, insert, replace, toString 
