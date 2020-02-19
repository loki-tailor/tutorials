"""
@author lokeshwar
@created 19 Feb 2020
"""

# ***************************************************************************

# e.g. 1
review = 11.5
if review > 4:
    print("good")
elif review > 3 and review < 4:
    print("fair")
else:
    print("poor")

# ***************************************************************************

# e.g. 2
# printing opposite of a boolean
print("##############################################")
light = True
print(light)
light = not light
print(light)

# ***************************************************************************

# e.g. 3
# find inputted number is odd or even
print("##############################################")
a = int(input("Enter a number: "))
if a % 2 == 0:
    print(a,"even")
else:
    print(a,"is odd")

# ***************************************************************************
