"""
@author lokeshwar
@created 19 Feb 2020

* set contains unique values only
* set does not support indexing
* set is not sorted
"""

_set = {1, 2, 3, 4, 5, 10}
print(_set)
# print(_set[1]) # TypeError: 'set' object does not support indexing
_set.remove(10)
print(_set)


