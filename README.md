# AHappyNumber
202. Happy Number
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:

Input: n = 2
Output: false
 

Constraints:

1 <= n <= 2^31 - 1

Solution :

we use something called as cycles means if there is a cycle present such that it repeates and goes into a cycle format then 
we can say that it is not a happt number.

ex : n = 12 

12 -> 5 -> 25 -> 29 -> 85 -> 89 -> 145 -> 42 -> 20 
                             |                   |
                             58 <- 37 <- 16  <-  4

we can see cycle in the above example this should not be present in a happy number and if there is no cycle and also not
a happy number the it will go infinite times.
