<div align="center">

# 🚀 30-Day DSA Mastery Challenge

### *From Zero to Hero in Data Structures & Algorithms*

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![DSA](https://img.shields.io/badge/DSA-Master-green?style=for-the-badge)
![Progress](https://img.shields.io/badge/Progress-0%25-red?style=for-the-badge)

---

### *"The only way to learn a new programming language is by writing programs in it." - Dennis Ritchie*

</div>

---

## 📖 Table of Contents

- [About This Challenge](#about-this-challenge)
- [How to Use This Plan](#how-to-use-this-plan)
- [30-Day Roadmap](#30-day-roadmap)
- [Progress Tracker](#progress-tracker)
- [Resources](#resources)
- [Problem-Solving Framework](#problem-solving-framework)

---

## 🎯 About This Challenge

This is a **complete beginner-friendly** 30-day plan to master Data Structures and Algorithms using Java. Whether you're a complete beginner or someone looking to strengthen your foundation, this structured path will guide you from basic syntax to advanced problem-solving.

### ✨ What You'll Learn:
- ✅ Java fundamentals and syntax
- ✅ Problem-solving techniques
- ✅ Time & Space Complexity analysis
- ✅ Core Data Structures (Arrays, Strings, LinkedList, Stack, Queue, Trees)
- ✅ Essential Algorithms (Sorting, Searching, Recursion, Backtracking)
- ✅ Pattern recognition for coding interviews

---

## 📚 How to Use This Plan

1. **Start from Day 1** - Don't skip days, build your foundation
2. **Complete all tasks** - Theory + Practice problems
3. **Code yourself** - Don't copy-paste, type everything
4. **Mark checkboxes** - Track your progress daily
5. **Review weekly** - Every 7 days, revise previous topics
6. **Stay consistent** - 1-2 hours daily is better than 10 hours once a week

### 📂 Repository Structure:
```
DSAWITHJAVA/
├── Day01_Basics/
│   ├── Theory.md
│   ├── Problem1.java
│   └── Problem2.java
├── Day02_Loops/
│   ├── ...
└── README.md
```

---

## 🗓️ 30-Day Roadmap

### **Week 1: Foundations** 🏗️

<details open>
<summary><b>Day 1: Java Basics & Setup</b></summary>

### 📌 Learning Objectives:
- Install JDK and setup IDE (VS Code/IntelliJ)
- Learn variables, data types, operators
- Understand input/output in Java

### 📖 Resources:
- [Java Installation Guide](https://www.oracle.com/java/technologies/downloads/)
- [Java Basics - W3Schools](https://www.w3schools.com/java/)
- [Video: Java in 100 Minutes](https://www.youtube.com/watch?v=grEKMHGYyns)

### 💻 Practice Problems:
- [ ] Print "Hello World"
- [ ] Take two numbers as input and print their sum
- [ ] Swap two numbers without using third variable
- [ ] Check if a number is even or odd
- [ ] Find the largest of three numbers

### 📝 Problem-Solving Framework (Example):

**Problem:** Check if a number is even or odd

**Step 1: Understand the Problem**
```
Input: A number (int)
Output: "Even" or "Odd"
Logic: If number % 2 == 0, it's even
```

**Step 2: Draw on Paper**
```
Test Cases:
10 → 10 % 2 = 0 → Even ✓
7 → 7 % 2 = 1 → Odd ✓
```

**Step 3: Pseudocode**
```
1. Take input number
2. Check number % 2
3. If remainder is 0 → print "Even"
4. Else → print "Odd"
```

**Step 4: Code**
```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

**Step 5: Test**
```
Input: 10 → Output: Even ✓
Input: 7 → Output: Odd ✓
```

### 💪 Motivational Quote:
*"Every expert was once a beginner. Don't give up!"*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub
- [ ] Understood the framework

</details>

<details>
<summary><b>Day 2: Conditional Statements & Operators</b></summary>

### 📌 Learning Objectives:
- Master if-else, switch statements
- Learn logical operators (&&, ||, !)
- Understand nested conditions

### 📖 Resources:
- [Java If-Else](https://www.geeksforgeeks.org/java-if-else-statement/)
- [Video: Conditionals in Java](https://www.youtube.com/watch?v=ldYLYRNaucM)

### 💻 Practice Problems:
- [ ] [Leap Year Check](https://www.geeksforgeeks.org/program-check-given-year-leap-year/)
- [ ] Grade calculator (marks to grade conversion)
- [ ] Calculator using switch case (+, -, *, /)
- [ ] Check if a character is vowel or consonant
- [ ] Find maximum of 4 numbers using nested if

### 💪 Motivational Quote:
*"Code is like humor. When you have to explain it, it's bad." - Cory House*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 3: Loops - Part 1 (for & while)</b></summary>

### 📌 Learning Objectives:
- Understand for loop structure
- Learn while and do-while loops
- Know when to use which loop

### 📖 Resources:
- [Java Loops Tutorial](https://www.w3schools.com/java/java_for_loop.asp)
- [Striver's Video: Loops](https://www.youtube.com/watch?v=WR31ByTzAVQ)

### 💻 Practice Problems:
- [ ] Print numbers 1 to N
- [ ] Print sum of first N natural numbers
- [ ] Print multiplication table of any number
- [ ] Count digits in a number
- [ ] Reverse a number
- [ ] [Factorial of N](https://leetcode.com/problems/factorial-trailing-zeroes/)

### 💪 Motivational Quote:
*"The only way to learn programming is by doing programming."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 4: Loops - Part 2 (Nested Loops & Patterns)</b></summary>

### 📌 Learning Objectives:
- Master nested loops
- Understand row-column relationship
- Solve pattern problems

### 📖 Resources:
- [Pattern Programming Guide](https://www.geeksforgeeks.org/pattern-programming-in-java/)
- [Striver's Pattern Playlist](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/)

### 💻 Practice Problems:
- [ ] Square pattern (N x N stars)
- [ ] Right triangle pattern
- [ ] Inverted right triangle
- [ ] Number pyramid
- [ ] Diamond pattern
- [ ] Hollow square pattern
- [ ] [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)

### 💪 Motivational Quote:
*"First, solve the problem. Then, write the code." - John Johnson*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 5: Functions & Methods</b></summary>

### 📌 Learning Objectives:
- Create reusable functions
- Understand parameters and return types
- Learn function overloading

### 📖 Resources:
- [Java Methods](https://www.w3schools.com/java/java_methods.asp)
- [Video: Functions in Java](https://www.youtube.com/watch?v=vvanI8NRlSI)

### 💻 Practice Problems:
- [ ] Create a function to check prime number
- [ ] Function to find factorial
- [ ] Function to check palindrome number
- [ ] Function to find GCD of two numbers
- [ ] Function to check Armstrong number
- [ ] [Count Primes](https://leetcode.com/problems/count-primes/)

### 💪 Motivational Quote:
*"Functions are the building blocks of readable and maintainable code."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 6: Arrays - Part 1 (Basics)</b></summary>

### 📌 Learning Objectives:
- Declare and initialize arrays
- Access and modify array elements
- Traverse arrays using loops

### 📖 Resources:
- [Java Arrays Tutorial](https://www.geeksforgeeks.org/arrays-in-java/)
- [Striver's Array Playlist](https://takeuforward.org/data-structure/striver-a2z-dsa-course-sheet-2/)

### 💻 Practice Problems:
- [ ] Find largest element in array
- [ ] Find smallest element in array
- [ ] Calculate sum and average of array
- [ ] [Two Sum Problem](https://leetcode.com/problems/two-sum/)
- [ ] Reverse an array
- [ ] [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

### 💪 Motivational Quote:
*"An array of possibilities awaits those who practice."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 7: Arrays - Part 2 (Operations)</b></summary>

### 📌 Learning Objectives:
- Insert and delete in arrays
- Search in arrays (Linear search)
- Introduction to time complexity

### 📖 Resources:
- [Array Operations](https://www.geeksforgeeks.org/array-data-structure/)
- [Time Complexity Basics](https://www.geeksforgeeks.org/understanding-time-complexity-simple-examples/)

### 💻 Practice Problems:
- [ ] Linear search implementation
- [ ] [Remove Element](https://leetcode.com/problems/remove-element/)
- [ ] [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [ ] [Rotate Array](https://leetcode.com/problems/rotate-array/)
- [ ] Find second largest element
- [ ] [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

### 💪 Motivational Quote:
*"Week 1 completed! 🎉 You're building momentum!"*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub
- [ ] **Weekly Review: Revise Day 1-7**

</details>

---

### **Week 2: Building Blocks** 🧱

<details>
<summary><b>Day 8: Strings - Part 1 (Basics)</b></summary>

### 📌 Learning Objectives:
- String declaration and initialization
- String methods (length, charAt, substring)
- String immutability concept

### 📖 Resources:
- [Java Strings](https://www.geeksforgeeks.org/strings-in-java/)
- [Video: Strings in Java](https://www.youtube.com/watch?v=zL1DPZ0Ovlo)

### 💻 Practice Problems:
- [ ] Reverse a string
- [ ] [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)
- [ ] Count vowels and consonants
- [ ] [First Unique Character](https://leetcode.com/problems/first-unique-character-in-a-string/)
- [ ] Convert string to uppercase/lowercase without inbuilt function
- [ ] [Valid Anagram](https://leetcode.com/problems/valid-anagram/)

### 💪 Motivational Quote:
*"String manipulation is the art of coding elegance."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 9: Strings - Part 2 (Advanced)</b></summary>

### 📌 Learning Objectives:
- StringBuilder vs String
- String comparison methods
- String manipulation techniques

### 📖 Resources:
- [StringBuilder in Java](https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/)

### 💻 Practice Problems:
- [ ] [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)
- [ ] Remove all spaces from string
- [ ] Check if two strings are rotation of each other
- [ ] [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)
- [ ] Count frequency of each character
- [ ] [Group Anagrams](https://leetcode.com/problems/group-anagrams/)

### 💪 Motivational Quote:
*"Every string problem is a puzzle waiting to be solved."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 10: Sorting Algorithms - Part 1</b></summary>

### 📌 Learning Objectives:
- Understand Bubble Sort
- Understand Selection Sort
- Analyze time complexity O(n²)

### 📖 Resources:
- [Sorting Algorithms Visualized](https://www.geeksforgeeks.org/sorting-algorithms/)
- [Video: Bubble & Selection Sort](https://www.youtube.com/watch?v=xli_FI7CuzA)

### 💻 Practice Problems:
- [ ] Implement Bubble Sort
- [ ] Implement Selection Sort
- [ ] Sort array in descending order
- [ ] [Sort Colors (Dutch National Flag)](https://leetcode.com/problems/sort-colors/)
- [ ] Find kth smallest element using sorting
- [ ] [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

### 💪 Motivational Quote:
*"Sorting is not just arranging data; it's organizing chaos into clarity."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 11: Sorting Algorithms - Part 2</b></summary>

### 📌 Learning Objectives:
- Understand Insertion Sort
- Learn Merge Sort (Divide & Conquer)
- Compare different sorting algorithms

### 📖 Resources:
- [Merge Sort Explained](https://www.geeksforgeeks.org/merge-sort/)
- [Striver's Video: Merge Sort](https://www.youtube.com/watch?v=ogjf7ORKfd8)

### 💻 Practice Problems:
- [ ] Implement Insertion Sort
- [ ] Implement Merge Sort
- [ ] [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
- [ ] Count inversions in array
- [ ] [Kth Largest Element](https://leetcode.com/problems/kth-largest-element-in-an-array/)

### 💪 Motivational Quote:
*"Divide and conquer - both in algorithms and in life."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 12: Searching Algorithms</b></summary>

### 📌 Learning Objectives:
- Master Binary Search
- Understand search space reduction
- Learn binary search on answer pattern

### 📖 Resources:
- [Binary Search Guide](https://www.geeksforgeeks.org/binary-search/)
- [Striver's Binary Search Playlist](https://takeuforward.org/data-structure/binary-search-explained/)

### 💻 Practice Problems:
- [ ] Implement Binary Search
- [ ] [First Bad Version](https://leetcode.com/problems/first-bad-version/)
- [ ] [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
- [ ] [Find Peak Element](https://leetcode.com/problems/find-peak-element/)
- [ ] Square root using binary search
- [ ] [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)

### 💪 Motivational Quote:
*"Binary search: The art of eliminating half your problems at a time."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 13: 2D Arrays (Matrix)</b></summary>

### 📌 Learning Objectives:
- Declare and traverse 2D arrays
- Row-wise and column-wise operations
- Matrix problems

### 📖 Resources:
- [2D Arrays in Java](https://www.geeksforgeeks.org/multidimensional-arrays-in-java/)

### 💻 Practice Problems:
- [ ] Print matrix in spiral order
- [ ] [Transpose of Matrix](https://leetcode.com/problems/transpose-matrix/)
- [ ] [Rotate Image](https://leetcode.com/problems/rotate-image/)
- [ ] Search in 2D matrix
- [ ] [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
- [ ] Wave print of matrix

### 💪 Motivational Quote:
*"Think in dimensions beyond the obvious."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 14: Hashing Basics</b></summary>

### 📌 Learning Objectives:
- Understand HashMap and HashSet
- Frequency counting problems
- O(1) lookup advantage

### 📖 Resources:
- [HashMap in Java](https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/)
- [Video: Hashing Explained](https://www.youtube.com/watch?v=KEs5UyBJ39g)

### 💻 Practice Problems:
- [ ] [Two Sum using HashMap](https://leetcode.com/problems/two-sum/)
- [ ] Find frequency of array elements
- [ ] [First Repeating Element](https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/)
- [ ] [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)
- [ ] [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

### 💪 Motivational Quote:
*"Week 2 completed! 🚀 You're halfway to mastery!"*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub
- [ ] **Weekly Review: Revise Day 8-14**

</details>

---

### **Week 3: Advanced Concepts** 🚀

<details>
<summary><b>Day 15: Recursion - Part 1 (Basics)</b></summary>

### 📌 Learning Objectives:
- Understand recursion concept
- Learn base case and recursive case
- Trace recursive calls

### 📖 Resources:
- [Recursion in Java](https://www.geeksforgeeks.org/recursion-in-java/)
- [Striver's Recursion Series](https://takeuforward.org/data-structure/recursion-explained/)

### 💻 Practice Problems:
- [ ] Print 1 to N using recursion
- [ ] Print N to 1 using recursion
- [ ] Calculate factorial using recursion
- [ ] [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
- [ ] Sum of first N natural numbers
- [ ] [Power of Two](https://leetcode.com/problems/power-of-two/)

### 💪 Motivational Quote:
*"To understand recursion, you must first understand recursion."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 16: Recursion - Part 2 (Intermediate)</b></summary>

### 📌 Learning Objectives:
- Solve array problems using recursion
- Understand recursive tree
- Learn time complexity of recursion

### 📖 Resources:
- [Recursion Tree Method](https://www.geeksforgeeks.org/recursion-tree-method/)

### 💻 Practice Problems:
- [ ] Check if array is sorted (recursive)
- [ ] [Reverse String](https://leetcode.com/problems/reverse-string/) using recursion
- [ ] [Power(x, n)](https://leetcode.com/problems/powx-n/)
- [ ] Sum of digits using recursion
- [ ] Print all subsequences of a string
- [ ] [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

### 💪 Motivational Quote:
*"Recursion is thinking in smaller versions of the same problem."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 17: Recursion - Part 3 (Backtracking)</b></summary>

### 📌 Learning Objectives:
- Introduction to backtracking
- Generate all combinations/permutations
- Solve constraint satisfaction problems

### 📖 Resources:
- [Backtracking Algorithm](https://www.geeksforgeeks.org/backtracking-algorithms/)
- [Video: Backtracking Basics](https://www.youtube.com/watch?v=DKCbsiDBN6c)

### 💻 Practice Problems:
- [ ] [Subsets](https://leetcode.com/problems/subsets/)
- [ ] [Permutations](https://leetcode.com/problems/permutations/)
- [ ] [Combination Sum](https://leetcode.com/problems/combination-sum/)
- [ ] [Letter Combinations of Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
- [ ] [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/)

### 💪 Motivational Quote:
*"Backtracking: Try, fail, learn, retry smarter."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 18: Two Pointers Technique</b></summary>

### 📌 Learning Objectives:
- Master two pointers approach
- Solve array/string problems efficiently
- Reduce time complexity from O(n²) to O(n)

### 📖 Resources:
- [Two Pointers Technique](https://www.geeksforgeeks.org/two-pointers-technique/)

### 💻 Practice Problems:
- [ ] [Two Sum II - Sorted Array](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
- [ ] [3Sum](https://leetcode.com/problems/3sum/)
- [ ] [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
- [ ] [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [ ] [Move Zeroes](https://leetcode.com/problems/move-zeroes/)
- [ ] [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

### 💪 Motivational Quote:
*"Two pointers, infinite possibilities."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 19: Sliding Window Technique</b></summary>

### 📌 Learning Objectives:
- Understand sliding window pattern
- Fixed-size and variable-size windows
- Optimize subarray problems

### 📖 Resources:
- [Sliding Window Technique](https://www.geeksforgeeks.org/window-sliding-technique/)
- [Video: Sliding Window](https://www.youtube.com/watch?v=GcW4mgmgSbw)

### 💻 Practice Problems:
- [ ] Maximum sum subarray of size K
- [ ] [Maximum Average Subarray](https://leetcode.com/problems/maximum-average-subarray-i/)
- [ ] [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
- [ ] [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)
- [ ] [Fruits Into Baskets](https://leetcode.com/problems/fruit-into-baskets/)

### 💪 Motivational Quote:
*"Slide through problems with grace and efficiency."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 20: Bit Manipulation</b></summary>

### 📌 Learning Objectives:
- Learn bitwise operators (&, |, ^, ~, <<, >>)
- Solve problems using bit tricks
- Understand XOR properties

### 📖 Resources:
- [Bit Manipulation Basics](https://www.geeksforgeeks.org/bits-manipulation-important-tactics/)
- [Video: Bit Magic](https://www.youtube.com/watch?v=5rtVTYAk9KQ)

### 💻 Practice Problems:
- [ ] Check if number is power of 2
- [ ] Count set bits in a number
- [ ] [Single Number](https://leetcode.com/problems/single-number/)
- [ ] [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/)
- [ ] Swap two numbers using XOR
- [ ] [Power Set using Bits](https://leetcode.com/problems/subsets/)

### 💪 Motivational Quote:
*"Think in bits, solve in seconds."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 21: Greedy Algorithms</b></summary>

### 📌 Learning Objectives:
- Understand greedy approach
- Learn when greedy works
- Practice optimization problems

### 📖 Resources:
- [Greedy Algorithms](https://www.geeksforgeeks.org/greedy-algorithms/)
- [Striver's Greedy Playlist](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)

### 💻 Practice Problems:
- [ ] [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
- [ ] [Jump Game](https://leetcode.com/problems/jump-game/)
- [ ] [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
- [ ] [Minimum Platforms](https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/)
- [ ] [N meetings in one room](https://www.geeksforgeeks.org/find-maximum-meetings-in-one-room/)

### 💪 Motivational Quote:
*"Week 3 done! 💪 You're in the advanced zone now!"*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub
- [ ] **Weekly Review: Revise Day 15-21**

</details>

---

### **Week 4: Data Structures** 📊

<details>
<summary><b>Day 22: Stack - Basics</b></summary>

### 📌 Learning Objectives:
- Understand LIFO principle
- Implement stack using array
- Learn push, pop, peek operations

### 📖 Resources:
- [Stack Data Structure](https://www.geeksforgeeks.org/stack-data-structure/)
- [Video: Stack Implementation](https://www.youtube.com/watch?v=O1KeXo8lE8A)

### 💻 Practice Problems:
- [ ] Implement stack using array
- [ ] [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
- [ ] [Min Stack](https://leetcode.com/problems/min-stack/)
- [ ] [Next Greater Element](https://leetcode.com/problems/next-greater-element-i/)
- [ ] Reverse a string using stack
- [ ] [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)

### 💪 Motivational Quote:
*"Stack overflow? Not in your code, not in your determination!"*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 23: Queue - Basics</b></summary>

### 📌 Learning Objectives:
- Understand FIFO principle
- Implement queue using array
- Learn circular queue

### 📖 Resources:
- [Queue Data Structure](https://www.geeksforgeeks.org/queue-data-structure/)
- [Circular Queue](https://www.geeksforgeeks.org/circular-queue-set-1-introduction-array-implementation/)

### 💻 Practice Problems:
- [ ] Implement queue using array
- [ ] Implement circular queue
- [ ] [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)
- [ ] [Design Circular Queue](https://leetcode.com/problems/design-circular-queue/)
- [ ] Generate binary numbers from 1 to N
- [ ] [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)

### 💪 Motivational Quote:
*"Life is a queue. Wait for your turn, success will come."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 24: LinkedList - Part 1 (Basics)</b></summary>

### 📌 Learning Objectives:
- Understand node structure
- Implement singly linked list
- Learn insertion and deletion

### 📖 Resources:
- [LinkedList in Java](https://www.geeksforgeeks.org/linked-list-in-java/)
- [Striver's LinkedList Series](https://takeuforward.org/data-structure/linked-list-insertion-at-beginning/)

### 💻 Practice Problems:
- [ ] Implement singly linked list
- [ ] Insert at beginning, end, and middle
- [ ] Delete a node
- [ ] [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
- [ ] [Middle of Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
- [ ] [Detect Cycle](https://leetcode.com/problems/linked-list-cycle/)

### 💪 Motivational Quote:
*"Link by link, you're building mastery."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 25: LinkedList - Part 2 (Advanced)</b></summary>

### 📌 Learning Objectives:
- Doubly linked list
- Solve complex linked list problems
- Two-pointer technique on lists

### 📖 Resources:
- [Doubly Linked List](https://www.geeksforgeeks.org/doubly-linked-list/)

### 💻 Practice Problems:
- [ ] Implement doubly linked list
- [ ] [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
- [ ] [Remove Nth Node From End](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
- [ ] [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)
- [ ] [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)
- [ ] [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)

### 💪 Motivational Quote:
*"Complex problems are just simple steps linked together."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 26: Trees - Part 1 (Basics)</b></summary>

### 📌 Learning Objectives:
- Understand tree terminology
- Implement binary tree
- Learn tree traversals (Inorder, Preorder, Postorder)

### 📖 Resources:
- [Binary Tree Basics](https://www.geeksforgeeks.org/binary-tree-data-structure/)
- [Video: Tree Traversals](https://www.youtube.com/watch?v=WLvU5EQVZqY)

### 💻 Practice Problems:
- [ ] Implement binary tree
- [ ] [Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
- [ ] [Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
- [ ] [Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)
- [ ] [Maximum Depth](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
- [ ] [Same Tree](https://leetcode.com/problems/same-tree/)

### 💪 Motivational Quote:
*"Grow your skills like a tree - deep roots, strong branches."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 27: Trees - Part 2 (BST)</b></summary>

### 📌 Learning Objectives:
- Understand Binary Search Tree properties
- Learn BST operations
- Solve BST problems

### 📖 Resources:
- [Binary Search Tree](https://www.geeksforgeeks.org/binary-search-tree-data-structure/)

### 💻 Practice Problems:
- [ ] [Validate BST](https://leetcode.com/problems/validate-binary-search-tree/)
- [ ] [Search in BST](https://leetcode.com/problems/search-in-a-binary-search-tree/)
- [ ] [Insert into BST](https://leetcode.com/problems/insert-into-a-binary-search-tree/)
- [ ] [Delete Node in BST](https://leetcode.com/problems/delete-node-in-a-bst/)
- [ ] [Lowest Common Ancestor](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
- [ ] [Kth Smallest Element in BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)

### 💪 Motivational Quote:
*"Searching for success? BST shows you the optimal path."*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub

</details>

<details>
<summary><b>Day 28: Dynamic Programming - Introduction</b></summary>

### 📌 Learning Objectives:
- Understand memoization
- Learn tabulation approach
- Identify DP problems

### 📖 Resources:
- [DP Introduction](https://www.geeksforgeeks.org/dynamic-programming/)
- [Striver's DP Series](https://takeuforward.org/data-structure/dynamic-programming-introduction/)

### 💻 Practice Problems:
- [ ] [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
- [ ] [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) (DP approach)
- [ ] [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)
- [ ] [House Robber](https://leetcode.com/problems/house-robber/)
- [ ] [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) (Kadane's)

### 💪 Motivational Quote:
*"Week 4 almost complete! 🎯 Final push!"*

---

**Checklist:**
- [ ] Completed all practice problems
- [ ] Pushed code to GitHub
- [ ] **Weekly Review: Revise Day 22-28**

</details>

---

### **Final Days: Mastery** 🏆

<details>
<summary><b>Day 29: Revision & Mock Contest</b></summary>

### 📌 Learning Objectives:
- Revise all topics
- Time-bound problem solving
- Build exam/interview temperament

### 💻 Practice:
- [ ] Solve 5 random problems from each topic
- [ ] Take a virtual contest on LeetCode/Codeforces
- [ ] Review your weak areas
- [ ] Practice on whiteboard/paper

### 📖 Resources:
- [LeetCode Contest](https://leetcode.com/contest/)
- [CodeChef Practice](https://www.codechef.com/problems/school)

### 💪 Motivational Quote:
*"Success is the sum of small efforts repeated day in and day out."*

---

**Checklist:**
- [ ] Attempted mock contest
- [ ] Identified weak topics
- [ ] Revised notes

</details>

<details>
<summary><b>Day 30: Final Challenge & Next Steps</b></summary>

### 📌 Learning Objectives:
- Solve hard problems
- Plan your next learning path
- Celebrate your achievement!

### 💻 Final Challenge:
- [ ] Solve 3 Medium + 2 Hard problems
- [ ] Optimize your previous solutions
- [ ] Write a blog/post about your journey
- [ ] Plan next 30 days (Advanced DP, Graphs, etc.)

### 📖 Resources:
- [Striver's SDE Sheet](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)
- [LeetCode Top Interview Questions](https://leetcode.com/problem-list/top-interview-questions/)

### 💪 Motivational Quote:
*"🎉 CONGRATULATIONS! You did it! This is not the end, it's just the beginning of your DSA journey!"*

---

**Checklist:**
- [ ] Completed final challenge
- [ ] Updated GitHub profile
- [ ] **Planned next learning path**
- [ ] **🎊 CELEBRATED YOUR ACHIEVEMENT!**

</details>

---

## 📊 Progress Tracker

Track your daily progress here:

### Week 1: Foundations 🏗️
- [ ] Day 1: Java Basics & Setup
- [ ] Day 2: Conditional Statements
- [ ] Day 3: Loops - Part 1
- [ ] Day 4: Loops - Part 2 (Patterns)
- [ ] Day 5: Functions & Methods
- [ ] Day 6: Arrays - Part 1
- [ ] Day 7: Arrays - Part 2

### Week 2: Building Blocks 🧱
- [ ] Day 8: Strings - Part 1
- [ ] Day 9: Strings - Part 2
- [ ] Day 10: Sorting - Part 1
- [ ] Day 11: Sorting - Part 2
- [ ] Day 12: Searching
- [ ] Day 13: 2D Arrays
- [ ] Day 14: Hashing

### Week 3: Advanced Concepts 🚀
- [ ] Day 15: Recursion - Part 1
- [ ] Day 16: Recursion - Part 2
- [ ] Day 17: Backtracking
- [ ] Day 18: Two Pointers
- [ ] Day 19: Sliding Window
- [ ] Day 20: Bit Manipulation
- [ ] Day 21: Greedy Algorithms

### Week 4: Data Structures 📊
- [ ] Day 22: Stack
- [ ] Day 23: Queue
- [ ] Day 24: LinkedList - Part 1
- [ ] Day 25: LinkedList - Part 2
- [ ] Day 26: Trees - Part 1
- [ ] Day 27: Trees - Part 2 (BST)
- [ ] Day 28: Dynamic Programming

### Final Days: Mastery 🏆
- [ ] Day 29: Revision & Mock Contest
- [ ] Day 30: Final Challenge

---

## 📚 Resources

### 📺 YouTube Channels:
- [Striver (TakeUForward)](https://www.youtube.com/@takeUforward)
- [Kunal Kushwaha](https://www.youtube.com/@KunalKushwaha)
- [Apna College](https://www.youtube.com/@ApnaCollegeOfficial)
- [Abdul Bari](https://www.youtube.com/@abdul_bari)

### 🌐 Practice Platforms:
- [LeetCode](https://leetcode.com/)
- [GeeksforGeeks](https://www.geeksforgeeks.org/)
- [HackerRank](https://www.hackerrank.com/)
- [CodeChef](https://www.codechef.com/)
- [Codeforces](https://codeforces.com/)

### 📖 Important Sheets:
- [Striver's A2Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/)
- [Striver's SDE Sheet](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)
- [LeetCode Top 150](https://leetcode.com/studyplan/top-interview-150/)
- [Blind 75](https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions)

### 📚 Books:
- "Cracking the Coding Interview" by Gayle Laakmann McDowell
- "Introduction to Algorithms" by CLRS
- "Data Structures and Algorithms Made Easy" by Narasimha Karumanchi

---

## 🧠 Problem-Solving Framework

Use this framework for EVERY problem:

### **STEP 1: UNDERSTAND**
```
- Read problem 3 times
- Identify input and output
- Note constraints
- Think of edge cases
```

### **STEP 2: ANALYZE**
```
- Draw the problem on paper
- Work through 2-3 examples manually
- Find the pattern
```

### **STEP 3: PLAN**
```
- Think of brute force first
- Can you optimize?
- What data structure fits?
- Write pseudocode
```

### **STEP 4: CODE**
```
- Start with template
- Write clean, readable code
- Add comments
- Handle edge cases
```

### **STEP 5: TEST**
```
- Test with sample inputs
- Test edge cases
- Check time/space complexity
- Optimize if needed
```

---

## 🎯 Tips for Success

1. **Consistency > Intensity**: 1 hour daily beats 7 hours on Sunday
2. **Understand, Don't Memorize**: Focus on logic, not rote learning
3. **Code on Paper First**: Builds stronger problem-solving skills
4. **Review Weekly**: Every Sunday, revise the week's topics
5. **Don't Skip Basics**: Strong foundation = Easy advanced topics
6. **Use Debugger**: Step through code to understand flow
7. **Join Communities**: Discord, Reddit, GitHub discussions
8. **Track Progress**: Update this README daily
9. **Ask Questions**: No question is stupid in learning
10. **Celebrate Small Wins**: Completed a day? You're awesome! 🎉

---

## 🤝 Contributing

Found a great problem? Want to add resources? Contributions are welcome!

1. Fork this repository
2. Add your content
3. Submit a pull request

---

## 📝 Notes Section

### My Learning Notes:
```
Day 1: Learned about...
Day 2: Struggled with... but understood after...
Day 3: ...
```

### Patterns I've Mastered:
- [ ] Frequency Counter
- [ ] Two Pointers
- [ ] Sliding Window
- [ ] Divide & Conquer
- [ ] Backtracking
- [ ] Dynamic Programming

---

## 🌟 Motivational Corner

> "The expert in anything was once a beginner." - Helen Hayes

> "Code is like poetry. It should be elegant, efficient, and expressive."

> "Every master was once a disaster."

> "The only way to do great work is to love what you do." - Steve Jobs

> "Programming isn't about what you know; it's about what you can figure out."

---

## 📈 After 30 Days

### What's Next?
- [ ] **Graph Algorithms** (BFS, DFS, Dijkstra)
- [ ] **Advanced DP** (LCS, Knapsack, DP on Trees)
- [ ] **Segment Trees & Fenwick Trees**
- [ ] **Trie Data Structure**
- [ ] **System Design Basics**
- [ ] **Competitive Programming**
- [ ] **Open Source Contributions**

---

<div align="center">

## 🏆 Hall of Fame

**Completed the 30-Day Challenge?**  
Add your name here!

| Name | GitHub | Completion Date |
|------|--------|----------------|
| Your Name | [@yourusername](https://github.com/yourusername) | YYYY-MM-DD |

---

### Made with ❤️ and lots of ☕

**Star ⭐ this repo if it helped you!**

[![GitHub followers](https://img.shields.io/github/followers/SaiVardhanKallempudi?style=social)](https://github.com/SaiVardhanKallempudi)

</div>

---

<div align="center">

### 🚀 Ready to start? Begin with Day 1 NOW!

**"The journey of a thousand miles begins with a single step."**

![Coding](https://media.giphy.com/media/qgQUggAC3Pfv687qPC/giphy.gif)

</div>