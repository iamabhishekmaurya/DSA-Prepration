## :one: Binary Search :arrow_double_down:

Given an array of integers `nums` which is sorted in ascending order, and an integer target, write a function to search `target` in `nums`. If `target` exists, then return its index. Otherwise, return `-1`.

**Example: 1**
> Input: nums = [-1,0,3,5,9,12], target = 9<br />Output: 4<br />Explanation: 9 exists in nums and its index is 4

**Example: 2**
> Input: nums = [-1,0,3,5,9,12], target = 2<br/>Output: -1<br/>Explanation: 2 does not exist in nums so return -1

**Constraints:**
- `1 <= nums.length <= 104`
- `-104 < nums[i], target < 104`
- All the integers in `nums` are **unique**.
- `nums` is sorted in ascending order.

Practices on: <a href="https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i" target="_blank">LeetCode</a> <br>
Solution:

## :two: First Bad Version :arrow_double_down:

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have `n` versions `[1, 2, ..., n]` and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API `bool isBadVersion(version)` which returns whether `version` is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

**Example: 1**
> Input: n = 5, bad = 4<br/>
Output: 4<br/>
Explanation:<br/>
call isBadVersion(3) -> false<br/>
call isBadVersion(5) -> true<br/>
call isBadVersion(4) -> true<br/>
Then 4 is the first bad version.

**Example: 2**
> Input: n = 1, bad = 1<br/>
Output: 1

**Constraints:**
- `1 <= bad <= n <= 231 - 1`

Practices on: <a href="https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=algorithm-i" target="_blank">LeetCode</a> <br>
Solution:

## :three: Search Insert Position :arrow_double_down:

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with `O(log n)` runtime complexity.

**Example: 1**
> Input: nums = [1,3,5,6], target = 5 <br /> Output: 2

**Example: 2**
> Input: nums = [1,3,5,6], target = 7 <br /> Output: 4

**Example: 3**
> Input: nums = [1,3,5,6], target = 2<br>Output: 1

**Constraints:**
- `1 <= nums.length <= 104`
- `-104 <= nums[i] <= 104`
- `nums` contains **distinct** values sorted in **ascending** order.
- `-104 <= target <= 104`

Practices on: <a href="https://leetcode.com/problems/search-insert-position/?envType=study-plan&id=algorithm-i " target="_blank">LeetCode</a> <br>
Solution: 

