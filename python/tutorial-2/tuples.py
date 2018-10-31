"""
Tuples:
    - Similar to list
    - Contains collection of elements in () - parenthesis
    - They are IMMUTABLE
    - They have only 2 functions:
        - insert()
        - count()
"""

#simple examples
print(f'type(()) - {type(())}')
tup1 = 10,20,30
print(f'tup1 - {tup1}')
tup1 = (40,50,60)
print(f'tup1 - {tup1}')
print(f'type((tup1)) - {type((tup1))}')
print()

#list to tuple
myList = [1,2,3]
print(f'myList - {myList}')
print(f'tuple(myList) - {tuple(myList)}')
print(f'type(tuple(myList)) - {type(tuple(myList))}')
print()

#tuple to list
print(f'list(tup1) - {list(tup1)}')
print(f'type(list(tup1)) - {type(list(tup1))}')
print()

#tuple inside tuple
tup2 = ((10,10,10,10,2,3,2,3,2,3,),("cat","dog","bird"),tup1)
print(f'tup2 - {tup2}')
print()

#tuple count()
print(f'tup2.count(2) - {tup2.count(2)}')
print(f'tup2[0].count(2) - {tup2[0].count(2)}')
print()

#tuple index()
print(f'tup2[1].index("bird") - {tup2[1].index("bird")}')
print(f'tup2[1][2] - {tup2[1][2]}')
print()

#tuple with range()
tup3 = tuple(range(0,21,2))
print(f'tup3 = tuple(range(0,21,2)) - {tup3}')
print()

#list vs tupple, mutable vs immutable
print(f'myList - {myList}')
myList[2] = "Hello"
print(f'myList (after modification) - {myList}')
print(f'tup3[3] - {tup3[3]}')
#tup3[3] = 2 #this will throw err - 'tuple' object does not support item assingment
#print(f'tup3[3] - {tup3[3]}')

#sum()
print(f'sum(tup3) - {sum(tup3)}')
