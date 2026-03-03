# Data Structures and Algorithms Portfolio

This repository demonstrates the level of my understanding of fundamental data structures and algorithms implemented in Java.

The aim of this portfolio is to provide the academic evidence of competency which is equivalent to an undergraduate level *Data Structures and Algorithms* course, which I did not have the opportunity to formally complete during my previous studies. 

This portfolio is for supporting my applications to:

- KTH Royal Institute of Technology - MSc Machine Learning Program. 
- Stockholm University - MSc Data Science, Statistics and Data Analysis. 
- Malmö University - MSc Applied Data Science. 

---

## Queue (FIFO - First-In First-Out)

A *Queue* is a linear data structure which follows **FIFO (First-In First-Out)** principle: the first element inserted,  is the first element removed.

---

### Operations

- `enqueue` - add an element to the back of the queue.
- `queue` - remove and return the front element.
- `peek` - return the front element without removing it. 
- `isEmpty` - check whether the queue is empty. 
- `size` - return the number of elements in the queue.

---

### Time Complexity
| Operation | Complexity |
|-----------|------------|
|  enqueue  | O(1) |
|  dequeue  | O(1) |
|  peek     | O(1) |
|  isEmpty  | O(1) |
|  size     | O(1) |

---

### Implementation notes

This implementation uses `java.util.LinkedList` internally to achieve constant-time insertion and removal at the ends of the queue. 




