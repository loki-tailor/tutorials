#----------------------------------------------------------------------------------------------------------------

#If we do not want to add a new line after 1st print for the 2nd print statement
print('Hello dear',5)
print('This is to be the next line after 1st line')

#string conversion
print("using str() to convert int to string - " + str(5))
s="5"
sum = 5+int(s)
print("using int() to convert string to int, final value = " + str(sum))

#taking inputs from user
n = input('Please enter your name: ')
print('You entered your name as - ' + n)

#----------------------------------------------------------------------------------------------------------------

#Number data-type
x = 1

#Float data-type
y = 5.3

#Complex number data-type
z = 5 + 7j

#Printing the type of above variables
print(type(x))
print(type(y))
print(type(z))

#Addition
print(x+y)

#Explicitly telling intepreter to use int
y = int(5.36546)
print(y)

#----------------------------------------------------------------------------------------------------------------

#Strings
x="Lokeshwar"
print(x)

#printing only 2nd character
print(x[1])

#printing first 2 characters
print(x[0:2])

print("length of str - " + str(len(x)))
print("upper case - " + x.upper())
print("lower case - " + x.lower())
print("str replace - " + x.replace('L','O'))

#----------------------------------------------------------------------------------------------------------------