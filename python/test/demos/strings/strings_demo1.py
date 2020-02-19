"""
#author lokeshwar
@created 18 Feb 2020
"""

str1 = "lokeshwar"
str2 = "tailor"
str3 = "My name is lokeshwar"
number = 3

print("\nstr1 + str2")
print(str1 + str2)  # won't add space
print("\nstr1, str2")
print(str1, str2)  # will ad space

# multiply string with number
print("\nstr1 * 3")
print(str1 * 3)
print("\nnumber * (\" \" + str1)")
print(number * (" " + str1))
print("\nlen(str1)")
print(len(str1))

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

# split()
print("\nstr3.split(" ")")
print(str3.split(" "))

# replace()
print('\nstr3.replace("lokeshwar","guess what ?")')
print(str3.replace("lokeshwar", "guess what ?"))
print('\nstr3')
print(str3)

# find()
print("\nstr3.find('lokeshwar')")
print(str3.find('lokeshwar'))
