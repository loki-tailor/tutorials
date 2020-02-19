"""
@author lokeshwar
@created 19 Feb 2020

Sorting based on length of string
"""

strList = ["lokeshwar", 'lok', "loki", "a", 'bb']

print("strList\t\t\t\t\t\t\t\t\t :", strList)
print("sorted(strList,key=len)\t\t\t\t\t :", sorted(strList, key=len))

print("strList\t\t\t\t\t\t\t\t\t :", strList)
print("sorted(strList,key=len, reverse=True)\t :", sorted(strList, key=len, reverse=True))
