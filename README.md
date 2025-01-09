# Who_Likes_It_String_Manipulation_and_Control_Flow

[CodeWars Kata Who likes it? Link](https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java)

## Problem Statement
Create a system to generate human-readable text based on an array of names representing individuals who "like" an item. The output format should adapt based on the number of names provided:
- No names → "no one likes this"
- One name → "Name likes this"
- Two names → "Name1 and Name2 like this"
- Three names → "Name1, Name2 and Name3 like this"
- Four or more names → "Name1, Name2 and X others like this" (where X is the count of additional names).

## Solution Concept
### Problem in Computer Science
This problem involves handling string concatenation and formatting based on variable-length input. The challenge lies in efficiently determining the correct grammatical output and managing edge cases for the array of names.

### How It Is Being Solved
The solution employs:
1. Conditional statements to handle different cases based on the length of the input array.
2. Iterative and indexing operations to access names.
3. String manipulation for the formatted output.
4. A switch-case construct to simplify specific scenarios.

## Learning Objectives
By working on this problem, you will learn:
- **String manipulation**: Concatenating strings dynamically based on input conditions.
- **Control flow**: Using conditional logic (if-else and switch-case) to manage multiple scenarios.
- **Input handling**: Managing variable-length inputs effectively.
- **Algorithm design**: Structuring efficient solutions for pattern-based outputs.

## Practical Applications
- **User feedback systems**: Generating dynamic messages based on user actions, like "likes," "comments," or "shares."
- **Notification systems**: Creating personalized notifications for users based on context.
- **Text formatting utilities**: Building tools that adapt outputs to human-readable formats from structured data.

## Algorithm Details
- Handle special cases:
  - Input array length is 0 → Output "no one likes this."
  - Input array length is 1 → Output "Name likes this."
- For 2-3 names, use concatenation to join names with "and" or commas as needed.
- For 4 or more names:
  - Use the first two names.
  - Calculate the remaining count of names.
  - Format the output as `"Name1, Name2 and X others like this."`
- Implementation considerations:
  - Use a loop to access names for cases with more than two names.
  - Handle empty inputs gracefully.

## Unit Tests:
```java


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Solution.whoLikesIt());
        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
