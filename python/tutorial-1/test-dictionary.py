#----------------------------------------------------------------------------------------------------------------

dictionary = {"fruit":"apple","car":"audi"}
print("dictionary - " + dictionary.__str__())

#Calling constructor dict() method to create a dictionary
A = dict(name="Lokeshwar", language="python")
print("dictionary using dict() - " + A.__str__())

#change any value by refering to it's key name
dictionary['fruit'] = 'orange'
print('dictionary value after change - ' + dictionary.__str__())

#accessing values of dictionary
x = dictionary['fruit']
print('value of x - ' + x.__str__())
print('type of x - ' + str(type(x)))

#dict.get() to fetch the value of a string
y = dictionary.get('car')
print('value of fetched from dictionary after using get() - ' + y.__str__())

#len()
print('length of dictionary - ' + len(dictionary).__str__())

#adding new value to dict
dictionary['temperature'] = 'cold'
print('dictionary after adding new value - ' + dictionary.__str__())

#removing value from dictionary
del dictionary['temperature']
print('dictionary after using "del" - ' + dictionary.__str__())

#deleting the whole dictionary
del(dictionary)
#print('value of dictionary after deleting all - ' + dictionary.__str__())
#above line will give below error, since the var dictionary is deleted
#NameError: name 'dictionary' is not defined

#----------------------------------------------------------------------------------------------------------------