"""
@author lokeshwar
@created 18 Feb 2020
"""

# basic print statements
print()
print("Hello")
print("My name is lokeshwar \n This is on new line")

# demonstration of 'sep' in print()
a, b = 10, 11
print(a, b)  # by default SPACE will be added while printing the 2 nos.
print(a, b, sep=",")  # this will have comma as the separator between the 2 nos.

# Print formatting
name = "Lokeshwar"
marks = 90.523423
print("Name =", name, " Marks are ", marks)
print("Name is %s, Marks are %.3f" % (name, marks))
print("Name is {}, Marks are {}".format(name, marks))
print("Name is {0}, Marks are {1}".format(name, marks))
# print(name + marks)  # this will give error: TypeError: must be str, not float
print(name + str(marks))  # we need to convert all vars to string, if we are using '+" while printing
print(name, marks) # this will not require to convert float to str
