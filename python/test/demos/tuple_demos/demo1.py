"""
@author lokeshwar
@created 19 Feb 2020
"""

listNumbers = (1, 3, 2, 5, 4, 2, 6, 7, 8, 2, 9, 10)
listStrings = ('one', 'two', 'three')

flistStrings[1] = "four"
# above will give error: TypeError: 'tuple' object does not support item assignment

print(listStrings[1])

print(listStrings.index('three'))
