"""
List:
    - Contains collection of values in square brackets []
    - Each value is an 'element'
    - Each value can be - float, int, string or a variable
    - List can contain -
        - Nested lists
        - Tuples
        - Sets
        - Dictionaries
        - Series
        - DataFrames
    - Elements in List are MUTABLE

Range:
    - generates a specified list of numbers
    - used with loops
"""

#simple e.g. of list
from typing import List

num = [10,20,30]
print(f'num - {num}')
num[0] = "hello"
print(f'list after modification (num) - {num}')
print()

#simple e.g. of range:
print(f'range(10,110,10) - {range(10,110,10)}')
print(f'list(range(10,110,10)) - {list(range(10,110,10))}')
numbers = list(range(10,160,10))
print(f'numbers - {numbers}')
print(f'type(numbers) - {type(numbers)}')
print(f'type([]) - {type([])}')
print()

#example of nested list
nested_list = [ [1,2,3,4], [5,6], [7,8,9] ]
print(f'nested_list - {nested_list}')
nested_range = [ list(range(4)), list(range(10,15)), list(range(20,25)) ]
print(f'nested_range - {nested_range}')
print()

#append(), pop(), insert(), sort()
basket1 = [1,9,10,4]
print(f'basket1 - {basket1}')
basket1.append(55)
print(f'basket1 (after using append() - {basket1}')
pop_value = basket1.pop()
print(f'basket1 (after using pop() - {basket1}')
print(f'basket1 - pop_value - {pop_value}')
insert_value = basket1.insert(2,200)
print(f'basket1 (after using insert() - {basket1}')
print(f'basket1 - insert_value - {insert_value}')
print(f'basket1 - sort() - {basket1.sort()}')
print(f'basket1 - after using sort() - {basket1}')
print()

#list within a list e.g.
try:
    basket2 = [10,20,30,basket1]
    print(f'basket2 - {basket2}')
    print(f"basket2's basket1 4th value - basket2[3][5] - {basket2[3][4]}")
    #(*) print(f"basket2's basket1 4th value - basket2[3][5] - {basket2[3][5]}") #this will do nothing and further block below statems from being printed
except Exception as e:
    print("Reached exception which was caught on line marked as (*) in comments.")
finally:
    print()

#more examples of list
basket3: List[str] = ["apples", "pears", "berries", "bananas"]
basket4 = [basket2, basket3]
print(f'basket3 - {basket3}')
print(f'basket4 - {basket4}')
print(f'basket4[0][2] + basket4[0][3][-2] - {basket4[0][2] + basket4[0][3][-2]}')
basket5 = ["a","a","a",1,1,1,1,1,3,3,3,3,3,3,50,50,50,50,50,50]
print(f'basket5 - {basket5}')
print(f'basket5.count(50) - {basket5.count(50)}')
print()

#more examples of list with slice, stride
basket6 = ["a","b","c","d",10,20,30,40,True,False, -1, "car",-2,"bar",-3,"star"]
print(f'basket6 - {basket6}')
print(f'len(basket6) - {len(basket6)}')
print(f'basket6[4:8] - {basket6[4:8]}')
print(f'basket6[11::2] - {basket6[11::2]}')
print(f'basket6[15::-2] - {basket6[15::-2]}')
print(f'basket6[15:8:-2] - {basket6[15:8:-2]}')
print(f'basket6[10:15:2] - {basket6[10:15:2]}')

#adding values using -ve indexes
print(f'basket1 - {basket1}')
basket1[-1] = "Chips"
print(f'basket1 (after doing basket1[-1] - {basket1}')