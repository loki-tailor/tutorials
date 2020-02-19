"""
@author lokeshwar
@created 18 Feb 2020
"""

import sys

int=20
print(20)

# below will give: SyntaxError: invalid syntax
#import=20
#print(import)

print="lokeshwar"
sys.stdout.write(print)

# in below, we will get error as: TypeError: 'str' object is not callable
#var=20
#print(var)