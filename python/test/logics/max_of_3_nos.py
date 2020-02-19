"""
@author lokeshwar
@created 19 Feb 2020
"""

_list = [1, 2, 44, 556, 2, 2, 1, 2, 0, 2, 1010, 999, 9762, 20, 2902, 9383, 10283, 192]

# ********************* My Way *********************************
_list.sort(reverse=True)
print(_list[:3])

# ********************* another way ******************************
max1 = max2 = max3 = min(_list)
for n in _list:
    if n > max3:
        max1 = max2
        max2 = max3
        max3 = n
    elif n > max2:
        max1 = max2
        max2 = n
    elif n > max1:
        max1 = n
print(max1, max2, max3)
