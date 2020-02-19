"""
@author lokeshwar
@created 19 Feb 2020
"""

for number in range(10):
    print(number)
print("####################################################")

for number in range(0, 10, 2):
    print(number)
print("####################################################")

for number in range(10, 1, -1):
    print(number)
print("####################################################")

strings = ['one', 'two', 'three']

for item in strings[:1]:
    print(item)
print("####################################################")

for each in strings:
    print(each)
print("####################################################")

for each in range(len(strings)):
    print(strings[each])
print("####################################################")