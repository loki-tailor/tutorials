"""
ZIP : zip can combine elements from two or more lists into nested tuples.
ENUMERATE : enumerate can generate an integer number next to each output.
"""

#e.g.1
print()
for i in enumerate(range(10,40,5)):
    print(i)

#e.g.2
print()
for count,i in enumerate(range(10,40,5)):
    print(count, i)

#e.g.3 : zip()
print()
tup1 = (33,49,55)
myList = [10,20,30]
z = list(zip(tup1,myList))
print("tup1 =", tup1)
print("myList =", myList)
print("z =",z)
for k,v in z:
    print("k -",k,"v -",v,"k+v - ",k+v)

#e.g.4 : zip()
print()
groceries = ["apple","chips","bread","icecream"]
price = [2,3,1.2,4.25]
print("groceries = ",groceries,"and price =",price)

zip_shop = zip(groceries,price)

print("zip_shop =", zip_shop,"and type(zip_shop) =",type(zip_shop),"and id(zip_shop) = ",id(zip_shop))
#print("list(zip_shop)=", list(zip_shop),"and type(zip_shop) =",type(zip_shop),"and id(zip_shop) = ",id(zip_shop))

for g, p in zip_shop:
    print(g,"=",p)

#another example of zip()
print()
num1 = [100,2,90,10] ; num2 = [12,7,90,50]
zip_num = zip(num1,num2)
for i,j in zip_num:
    if i > j:
        print(i)
    elif i < j:
        print(j)
    else:
        print(i,j)

print()
#another example of zip() and itertools cycle()
from itertools import cycle as cy
numbers = list(range(10,70,10))
print("numbers = ",numbers)
val1 = [2] ; val2 = [5]
zip_val = list(zip(numbers,cy(val1),cy(val2)))
print("zip_val = ",zip_val)

