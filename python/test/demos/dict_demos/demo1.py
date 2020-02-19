"""
@author lokeshwar
@created 19 Feb 2020
"""

dict = {"apple": "green", "bananas": 5, 5: "this is value with key 5"}
print("\ndict =", dict)
print("\ndict.keys() =", dict.keys())
print("dict.values() =", dict.values())
print("dict[5] =", dict[5])
print("dict['apple'] =", dict['apple'])
dict['bananas'] += 5
print("dict['bananas'] += 5 =", dict)
del dict[5]
print("del dict['5'] =", dict)
