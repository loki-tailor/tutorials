#Python defines a module which allows to deep copy or shallow copy mutable object using the inbuilt functions present in the module “copy“.
#Assignment statements in Python do not copy objects, they create bindings between a target and an object.
#For collections that are mutable or contain mutable items, a copy is sometimes needed so one can change one copy without changing the other.
#In case of deepCopy(), a copy of object is copied to another object i.e. any changes made to one object will not get reflected to another object
#In case of shallow copy, a reference of object is copied in other object. It means that any changes made to a copy of object do reflect in the original object.

"""
Important Points:
* The difference between shallow and deep copying is only relevant for compound objects (objects that contain other objects, like lists or class instances):
* A shallow copy constructs a new compound object and then (to the extent possible) inserts references into it to the objects found in the original.
* A deep copy constructs a new compound object and then, recursively, inserts copies into it of the objects found in the original.
"""

"""
#e.g.1
l1 = [1,2,3,4,["a","b","c"]] ; l2 = list(l1)
print("l1 = ",l1,"and id(l1) = ",id(l1))
print("l2 = ",l2,"and id(l2) = ",id(l2))

l1[0] = 100;
print()
print("After - l1[0] = 100 :")
print("l1 = ",l1,"and id(l1) = ",id(l1))
print("l2 = ",l2,"and id(l2) = ",id(l2))

l2[0] = 200;
print()
print("After - l2[0] = 200 :")
print("l1 = ",l1,"and id(l1) = ",id(l1))
print("l2 = ",l2,"and id(l2) = ",id(l2))

"""

"""
#e.g.2
print()
t1 = (1,2,3,4) ; t2 = list(t1)
print("t1 = ",t1,"id(t1) = ",id(t1))
print("t2 = ",t2,"id(t2) = ",id(t2))

t2[0] = 300
print()
print("After t2[0] = 300 : ")
print("t1 = ",t1,"id(t1) = ",id(t1))
print("t2 = ",t2,"id(t2) = ",id(t2))
"""

"""
#e.g.3
t = (1,2,3,4,[5,6,7,8],9) ; lst = list(t).copy()
print(t) ; print(lst)
lst[4][0] = 100
print(t) ; print(lst)
"""

"""
#In below example, when num is copied to b, all the values are being copied to 'b' along with it references,
#Hence, when we change in inner-array of b, the value is also changed in inner array of 'num'
num = [1,2,[3,4]]
print(num)
b = num
print(b)
b[2][1] = 5
print(num,b)
"""


"""
#e.g. demonstrating deepCopy
import copy
#first list
l1 = [1,2,[3,4],5,6]
#second list using deepCopy() i.e. this will be not conned to first list
l2 = copy.deepcopy(l1)
#printing values of list1
print("Original elements of 1st list before modifyiing some elements of l2: ",end="")
for i in range(0,len(l1)):
    print(l1[i],end=" ")
print("\r")
#printing values of list2
print("Values of l2 after deepcopying = ",end="")
for i in range(0,len(l2)):
    print(l2[i],end=" ")
#modifying values in list2
l2[2][1]=100
#printing first list after modifying an inner-array in 1st list
print()
print("Values of l1 after modifying values in l2: ",end="")
print(" ".join(str(n) for n in l2))

"""

#e.g. demonstrating shallow copy using copy()
# Python code to demonstrate copy operations

# importing "copy" for copy operations
import copy

# initializing list 1
li1 = [1, 2, [3,5], 4]

# using copy to shallow copy
li2 = copy.copy(li1)

# original elements of list
print ("The original elements before shallow copying")
for i in range(0,len(li1)):
	print (li1[i],end=" ")

print("\r")

# adding and element to new list
li2[2][0] = 7

# checking if change is reflected
print ("The original elements after shallow copying")
for i in range(0,len( li1)):
	print (li1[i],end=" ")