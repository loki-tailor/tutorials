'''
* Built-in python function or method
* Adds a string to an empty "{}"
'''

student = input("Enter student's name: ")
grade = input("Enter student's grade: ")
print("The student's name: {}, grade is {}".format(student,grade))

#example of eval()
semester1 = eval(input("Enter semester1 grade: "))
semester2 = eval(input("Enter semester2 grade: "))
final_grades = "The total is {}".format(semester1 + semester2)
print(f'{final_grades}')

#more example of format()
animals = ["lion", "dog", "elephants"]
safari = "I saw a {}, {} and {}"
print(safari.format(animals[0], animals[1], animals[2]))
print(f'{safari}')
print(f'safari.format(*animals) - {safari.format(*animals)}')

#more example of eval() and format()
x = eval("{} + {} + {}".format(10,20,30))
print(f'x = {x}')
y = eval("{1} * {1} + {1}".format(*[10,20,30]))
print(f'y = {y}')

#examples of using %d
z: str = "%d + %d = %d" % (10,20, (10+20))
print(f'{z}')

#word length
word = "awesome"
print("The length of this word {} is {}".format(word, len(word)))

#float formatting
z = "days left are {num:.1f}".format(num = 300/9)
print(f'300/9 - {300/9}')
print(f'300/9 after formatting to .1f - {z}')

#more example of format()
print("{} {} {}".\
format("a","b","c"))

#more example of eval()
a = eval(f"{10/22 : .5f}")
b = eval(f"{10/22 : .5f}") + 100
print(f'10/22 with all decimals - {10/22}')
print(f'10/22 with .5f decimals - {a}')
print(f'10/22 with .5f decimals + 100 - {b}')

#more example of f-string formatting
p1 = "Python" ; p2 = "older"
print(f"""This is a docstring that uses {p1} 3.6 a
nd can't be used for
{p2} versions""".replace("\n","").upper())