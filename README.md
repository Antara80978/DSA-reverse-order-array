# DSA - Reverse Order Array

This project explains the **reverse order logic** of an array in **Java** and **Python**.
# Array Reverse - DSA Solution

This repository contains the **Data Structures and Algorithms (DSA)** solution to reverse an array in optimal time.  
Languages: Python / Java / C++  
Use cases: Coding interviews, practice problems, learning algorithm fundamentals.

## Features
- Simple and clean code
- Explanation of the approach
- Time complexity: O(n)
- Space complexity: O(1)

## How to run
```bash
python reverse_array.py


---

## 🔍 LET'S UNDERSTAND THE BASIC LOGIC BEHIND REVERSING AN ARRAY

We assume you're already familiar with how to initialize and print arrays.  
Now let's break down the logic step by step:

---

### 🧠 Steps to Reverse an Array:

step 1: make an array  

step 2: note down arrays length  

step 3: intilaize new variable ie make new array **temp** for *reverse order array elements*  

step 4 : formula is   
      
      **temp = arr[n - 1 - i]**  
      here n = length of array , 1 = for easy pivot , i = array elements  

step 5 : temp array ke elements arr array mai copy kro for final result  

step 6 :print result  

#EXAMPLE   
we  have  
1.arr : [ 5 ,7, 9, 2 ,1 ,4 ]  
2.arrays length= 6  
3.temp   
4. **temp = arr[n - 1 - i]**  
calculations   
| i | `n - i - 1`     | `arr[n - i - 1]` | `temp[i]`    |  
| - | --------------- | ---------------- | ------------ |  
| 0 | `6 - 0 - 1 = 5` | arr[5] = 4      | temp[0] = 4 |  
| 1 | `6 - 1 - 1 = 4` | arr[4] = 1      | temp[1] = 1 |  
| 2 | `6 - 2 - 1 = 3` | arr[3] = 2      | temp[2] = 2 |  
| 3 | `6 - 3 - 1 = 2` | arr[2] = 9      | temp[3] = 9 |  
| 4 | `6 - 4 - 1 = 1` | arr[1] = 7      | temp[4] = 7 |  
| 5 | `6 - 5 - 1 = 0` | arr[0] = 5      | temp[5] = 5 |  

thus we got reversed array as temp = [ 4,1,2,9,7,5]  
