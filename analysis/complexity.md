# Complexity Analysis
This document summarizes the time and space complexity of the data structures and algorithms implemented in this repository.

## Core Data Structures

### Stack

Operations:

| Operation | Complexity |
|---|---|
| push | O(1) |
| pop | O(1) |
| peek | O(1) |
| size | O(1) |

Explanation:

A stack stores elements in LIFO (Last-In-First-Out) order.
Insertion and removal occur at the same end of the structure, allowing constant time operations.

### Queue

Operations:

| Operation | Complexity |
|---|---|
| enqueue | O(1) |
| dequeue | O(1) |
| peek | O(1) |

Explanation:

A queue follows FIFO (First-In-First-Out) order.

### Linked List

Operations:

| Operation | Complexity |
|---|---|
| addFirst | O(1) |
| addLast | O(n) |
| remove | O(n) |
| search | O(n) |

Explanation:

A linked list consists of nodes connected by references. Traversal requires sequential accesses. 

### Binary Search Tree (BST)

Average case:

| Operation | Complexity |
|---|---|
| insert | O(log n) |
| search | O(log n) |
| delete | O(log n) |

Worst case:

| Operation | Complexity |
|---|---|
| insert | O(n) |
| search | O(n) |

Explanation:

BST performance depends on tree balance.

### Hash Map

Average case:

| Operation | Complexity |
|---|---|
| put | O(1) |
| get | O(1) |
| remove | O(1) |

Worst case:

| Operation | Complexity |
|---|---|
| put | O(n) |
| get | O(n) |
| remove | O(n) |

Explanation:

Hash collisions may degrade performance.

## Sorting Algorithms

### Bubble Sort

| Case | Complexity |
|---|---|
| Best | O(n) |
| Average | O(n<sup>2</sup>) |
| Worst | O(n<sup>2</sup>) |

### Merge Sort

| Case | Complexity |
|---|---|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n log n) |

Space complexity: 

O(n)

### Quick Sort

| Case | Complexity |
|---|---|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n<sup>2</sup>) |

Worst case occurs when the pivot produces highly unbalanced partitions.

## Searching Algorithms

### Linear Search

O(n)

Works on unsorted arrays.

### Binary Search

O(log n)

Requires sorted data. 

## Graph Algorithms

### Breadth First Search (BFS)

O(V + E)

V = vertices
E = edges

### Depth First Search (DFS)

O(V + E)

## Mini Projects

### Task Scheduler

Uses a Max Heap priority queue.

Operations: 

| Operation | Complexity |
|---|---|
| addTask | O(log n) |
| executeTask | O(log n) |

### Text Search Engine

Uses an inverted index based on a HashMap.

Search complexity:

O(1) average

### Route planner

Uses BFS shortest path search.

O(V + E)