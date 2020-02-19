"""
#author lokeshwar
@created 19 Feb 2020
"""

str1 = "lokeshwar"
str2 = "tailor"
str3 = "My name is lokeshwar"
number = 3

# print only first two characters
print("\nstr1[:2]")
print(str1[:2])  # lo

# prints string w/o last 2 chars
print("\nstr1[:-2]")
print(str1[:-2])  # lokeshw

# prints string w/o 1st 2 chars
print("\nstr1[2:]")
print(str1[2:])  # keshwar

# prints last 2 chars
print("\nstr1[-2:]")
print(str1[-2:])  # ar

# prints by jumping | print every x::n => nth char from x
print("\nstr1[1::1]")
print(str1[1::1])  # okeshwar
print("\nstr1[2::2]")
print(str1[2::2])  # kswr