#----------------------------------------------------------------------------------------------------------------
#List - A collection which is ordered and changable

fruits = ['apple','mango','banana', 'pineapple']

print("list - " + str(fruits))

print("2nd element of the list - " + fruits[1])

print("2nd to 3rd element of the list - " + fruits[1:3].__str__())

another_list = ['one', 'two', 'three']

z = [fruits, another_list]

print("list within list - " + z.__str__())

print('3rd item of 1st list - ' + z[1][2].__str__())

#change the item
fruits[0] = "Green Apple"

print("Modified list -" + fruits.__str__())

print("length of the list - " + str(len(fruits)))

#append() - adding an element to the end of the list
fruits.append('grapes')

print("list after using append() - " + fruits.__str__() )

#insert item at x position
fruits.insert(1,'orange')
print('list after using insert() - ' + fruits.__str__())

#remove an element form the list
fruits.remove('Green Apple')
print('list after using remove() - ' + fruits.__str__())

'''
More methods:
clear() -   removes all the values from the list
copy()  -   returns a copy of the list
count() -   returns the number of elements with the specified value in the list
extend()-   storing 2 list in one list i.e. appending the new list to the end of the present list
pop()   -   removes an element at the specified position from the list
remove()-   removes the item with the specified value from the list
reverse()   reverse the order of the list
sort()  -   sort the list
'''

#----------------------------------------------------------------------------------------------------------------