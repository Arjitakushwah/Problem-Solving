# Problem Solving

## question1
Given a array of size n. Answer q queries where you need to print the sum of values in a given range of indices for 1 to r(both inclusive).
NOTE: the values of 1 to r follow 1-base indexing

## question 2
Check if we can partition the array into two subarrays with equal sum. More formally, check thhe prefix sum of a part of the arrayis equal to the suffix sum of rest of the array.
 
## question 3
find the total number of pairs in the array whose sum is x(two sum problem)
--- using two loops(brute force appproach)

## question 4
(three sum problem)
--- using three loops(brute force approach)

## question 5
find the unique number in a given array where all the elements are repeated twice having one element unique

## question 6
second largest element in a given array
1st approach:
find maximum, replace maximum with min value, then again find maximum 


## question 7

given an array consist of integers. Return the first value that is repeating in this array. if no value is being repeated, reuturn -1.
Brute force approach: 
      using two for loops

## swaping
1. using temp variable
2. unsin sum and difference
a=a+b
b=a-b
a=a-b

## question 8
reverse an array consisting of integer values.
approach1:
      using traverse array reversely and add in second array
approach2:
      swaping the first and last element of array without using new array

## question 9
rotate the given array by k steps(k can be greater than size of array)
use k%n
two parts: 0 to n-k and n-k to n
approach 1: add elements using two loops in new array.
approach2: reverse array parts individually then again reverse the whole array.
reverse(arr, 0,n-k-1)
reverse(arr,n-k,n-1)
reverse(arr,0,n-1)

## question 10
given q queries, check if the given element is present in the array or not;
NOTE:
value of all the elements in the array is less than 10 to the power 5

# two pointer appraoch
 ## question 11
 sort an array consisting of only 0's and 1's
 1 step: for loop for count 0's in array
 step 2: for loop to put 0's in array then 1's
 approach 2:
 using 2 pointer approach left and right, left keeps track of 0's and right keeps track of 1's

 ## question 12
 given an array of integers "a", move all the even integers at the beginning of the array followed by all the odd integers. the relative order of the odd or even integer does not matter. return any array that satisfies the condition.
 
 approach will be same as the question 11

 ## question 13
 given an integer array sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.(also having negative numbers)