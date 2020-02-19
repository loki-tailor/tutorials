"""
@author lokeshwar
@created 19 Feb 2020
"""

# list can contain any data type
list1 = [1, 2, 3.145, "my name is lokeshwar", True]
print(list1)

# referencing using index
print("list[1]\t\t:", str(list1[1]))

# slicing [x:y] => x is inclusive, y is exclusive
print("list1[2:4]\t:", list1[2:4])

# multiply elements 3 times, each should be present thrice
print('list1 * 3\t:', list1 * 3)

# length of list
print('len(list1)\t:', len(list1))

# last element from list
print('list1[-1:]\t:', list1[-1:])

# last 2 elements from list
print('list1[-2:]\t:', list1[-2:])

# except for 1st element, print all other elements
print('list1[1:]\t:', list1[1:])

# print 1st 2 elements
print('list1[:2]\t:', list1[:2])

# print all except last 2
print('list1[:-2]\t:', list1[:-2])

# print alternate chars from lsit
print('list1[0::2]\t:', list1[0::2])

# print alternate chars from list upto 3rd index
print('list1[0:3:2]:', list1[0:3:2])

# print first 3 elements
print('list1[0:3]\t:', list1[0:3])

# print first 3 elements - IN REVERSE ORDER
print('list1[0:3:-1]\t:', list1[3:0:-1])
