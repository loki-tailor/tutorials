"""
@author lokeshwar
@created 19 Feb 2020
"""

print("##################################################")
number = 1

while number <= 5:
    print(number)
    number += 1
print("##################################################")

number = 1

# while True:
#     print(number)
#     number += 1

number = 1

while True:
    print(number)
    if number == 5:
        break
    number += 1
print("##################################################")

number = 1

while True:
    number += 1
    if number == 5:
        break
    if number % 2:
        continue
    print(number)
print("##################################################")
