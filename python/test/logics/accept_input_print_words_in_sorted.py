"""
@author lokeshwar
@created 19 Feb 2020

Q:  Write a python program that accepts as input a comma separated
    sequence of words and prints the unique words in sorted form (alphanumerically)
"""

# ************* My Solution *******************
listStr = input("enter string: ").split(",")
set1 = set(listStr)
unique_ele_list = list(set1)
print("unique_ele_list = ", unique_ele_list)
unique_ele_list.sort()
print("sorted unique_ele_list =", unique_ele_list)

# ************* Other Solution *******************
print("sorted(set1) =", sorted(set1))
