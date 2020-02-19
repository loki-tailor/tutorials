"""
@author lokeshwar
@created 19 Feb 2020
"""

list1 = [1, 2, 2, 2, 2, 9, 3, 4, 4, 5, 6, 20, 7, 7, 7, 7, 10]
set1 = set(list1)
print("list1 = " + str(list1))
print("set1 = " + str(set1))
list1 = list(set1)
print("list1 = " + str(list1))
