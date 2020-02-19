"""
@author lokeshwar
@created 18 Feb 2020
"""

a, b = 10, 20
print('a =', a, 'b =', b)

a += b
print('a += b\t:', a)

a -= b
print('a -= b\t:', a)

a *= b
print('a *= b\t:', a)

a /= b
print('a /= b\t:', a)

a, b = 20, 10
print('\na =', a, 'b =', b)
a //= b
print('a //= b\t:', a)

a **= b
print('a **= b\t:', a)

# assignment can also happen thru new line using '\'s
c = d = e = \
    f = g = h = \
    i = a
print("c =", c, "d =", d)
