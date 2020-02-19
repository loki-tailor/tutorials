"""
@author lokeshwar
@created 18 Feb 2020
"""

a = 20
b = 10
print("original values      : a = ", a, " & b = ", b)

# swapping using basic method
temp = a
a = b
b = temp
print("swap (basic) values  : a = ", a, " & b = ", b)

a,b = b,a
print("swap (python) values : a = ", a, " & b = ", b)

