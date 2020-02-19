"""
@author lokeshwar
@created 19 Feb 2020
"""

list1 = list(range(1, 11))
list1 += [10, 9, 20, 19]
print("list(range(1, 11))\t\t :", list1)

# max() & min()
print('max(list1)\t\t\t\t :', max(list1))
print('min(list1)\t\t\t\t :', min(list1))

# sort()
print('list.sort()\t\t\t\t :', list1.sort())
print('list1\t\t\t\t\t :', list1)

# sort() in reverse
print('list.sort(reverse=True)\t :', list1.sort(reverse=True))
print('list1\t\t\t\t\t :', list1)

# create a list with increment of 4
print('list(range(0,44,4))\t\t : ', list(range(0, 44, 4)))

# create a list in descending order with a difference of 3
print('list(range(30,0,-3))\t : ', list(range(30, 0, -3)))

# reverse {SAME GOES FOR SORT}
print("############################################")
print("list1\t\t\t\t\t :", list1)
print("list1.reverse()\t\t\t : ", list1.reverse())
print("list1\t\t\t\t\t :", list1)

# reverse and save the output in separate variable
# SAME GOES FOR {SORT}
reverseList = reversed(list1)  # returns iterator
print("############################################")
print('reversed(list1)\t\t\t :', reverseList)
print('list(reverseList)\t\t :', list(reverseList))