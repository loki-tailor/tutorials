class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def myFunction(thisClassObj):
        print("Print my name is - " + thisClassObj.name)

p1 = Person("Lokeshwar","Infinity")
print("p1.name - " + p1.name)

p1.myFunction()

