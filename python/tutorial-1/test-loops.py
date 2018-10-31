#------------------------------------------------------------------------------------------------

for x in range(10):
    print(x, end=" ")

for x in range(12,20):
    print(x, end=" ")

for x in range(1,10):
    print(13, "x", x,  "=", x*5)

for x in range(1,11):
    print()
    for y in range(x):
        print("*",end=" ")


print()
print()
for x in range(1000):
    if x==50:
        print('Reached the threshold of 50, hence breaking the loop...')
        break
    elif x%10==0:
        print('Skippiing values which are x%10...')
        continue
    else:
        print(x, end=" ")

#------------------------------------------------------------------------------------------------
print()
print()
#while loop
i='y'
while i=='y':

    choice = input('type "s" for addition and "m" for multiplication - ')

    if choice == "s":
        a=input("enter a int value - ")
        b=input('enter another int value - ')
        sum = int(a) + int(b)
        print('addition = ' + sum.__str__())
    elif choice == "m":
            a = input("enter a int value - ")
            b = input('enter another int value - ')
            mul = int(a) * int(b)
            print('addition = ' + mul.__str__())
    else:
        print("Invalid choice. closing application.")
        break
    i = input('press "y" to continue, or press any key and enter to exit - ')




#------------------------------------------------------------------------------------------------