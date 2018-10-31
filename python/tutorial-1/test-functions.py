#Functions

def calculator(a=1,b=1):
    print("This is the start of calculator function")
    print("Multiplication = " + str(int(a)*int(b)))
    print()

calculator(10,20)
calculator()

def add(a=1,y=2):
    return int(a)+int(y)

x = add(10,20)
print("Default Addition - " + str(add()))
print("Addition - " + str(x))