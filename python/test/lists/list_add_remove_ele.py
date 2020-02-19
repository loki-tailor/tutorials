"""
@author lokeshwar
@created 19 Feb 2020

Difference betweeen list.remove(), del list(), list.pop()
https://www.csestack.org/difference-between-remove-del-pop-python-list/#difference
* remove() delete the matching element/object whereas del and pop removes the element at a specific index.
* del and pop deals with the index. The only difference between two is that- pop return deleted the value from the list and del does not return anything.
* Pop is only way that returns the object.
* Remove is the only one that searches object (not index).
"""

# Operations => ADD
list1 = [1, 2, 3, 4, 5]
print('list1:\t', list1)

list1.append(5)
print('list1.append(5)\t\t\t\t : list1:\t', list1)

list1.append("lokeshwar")
print('list1.append("lokeshwar")\t : list1:\t', list1)

# Operatiosn => INSERT
list1.insert(0, "loki")
print('list1.insert(0, "loki")\t\t : list1:\t', list1)

# Operation => REMOVE
list1.remove("loki")
print('list1.remove("loki")\t\t : list1:\t', list1)

# OPERATION => DELETE
del list1[4]
print('del list1[3]\t\t\t\t : list1:\t', list1)

# Operation => POP
print('list1.pop(1)\t\t\t\t : list1 :"', list1, "\t ; pop'd item = ", list1.pop(1))

# DELETE LIST
del list1
print(list1)  # this gives error as we have previously deleted the list
