"""
#author lokeshwar
@created 18 Feb 2020
"""

str1 = "lokeshwar"
str2 = "tailor"

print(str1 + str2)  # won't add space
print(str1, str2)  # will ad space

# multiply string with number
print(str1 * 3)

# print only first two characters
print(str1[:2])  # lo

# prints string w/o last 2 chars
print(str1[:-2])  # lokeshw

# prints string w/o 1st 2 chars
print(str1[2:])  # keshwar

# prints last 2 chars
print(str1[-2:])  # ar

# prints by jumping | print every x::n => nth char from x
print(str1[1::1])  # okeshwar
print(str1[2::2])  # kswr