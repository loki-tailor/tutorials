"""
LISTS EXERCISE
TASK 1: ADD ALL DICTIONARY VALUES
WORK WITH
toys = {"robot": "$40.0", "car": "$25", "ironman": "$12"}
DESIRED OUTPUT
77
HINTS?
1. Use the values() method.
2. Use list
3. Use the built-in Python function, eval() to convert a string to a number.
4. Use list slicing with the appropriate index to grab the numbers. Add them together.
5. Use the int type.
"""

#Task 1: Adding all dictionary values
toys = {"robot":"$40.0","car":"$25","ironman":"$12"}
list_toys = list(toys.values())
print(list_toys)
x = int(float((list_toys[0][1:])))
y = int(list_toys[1][1:])
z = int(list_toys[2][1:])
sum = x + y + z
print(sum)
#or#-as given in the solution
sum = int(eval(list_toys[0][1:]) + eval(list_toys[1][1:]) + eval(list_toys[2][1:]))
print(sum)
print()

#Task-2
#Use comparision operators in a list
questions = [10 != 4, 50 == 50, 90 == 10, "c" in ("a", "b", "c"), 100 != 100]
print(questions)

#Task-3
print()
#Len Key Values with comparison operator
films = {"k1": "blade runner 2049", "k2": "matrix", "k3": "terminator"}
print(len(films["k1"]) > len(films["k2"]) < len(films["k3"]))

#Task-4
print()
life_stages = {0: "embryo", 1: "fetus", 2:"baby", 3:"infant",4: "teen"}
print(life_stages)
midlife = {5:"adult",6:"big kid!"}
print(midlife)
life_stages.update(midlife)
print(life_stages)

#TASK 5: ADD ALL VALUES FROM LIST
print()
nest1 = [(1,2,3), {"k1": [8, 1, 300, 2, 77], "k2": [10,20,30]}, ["a","500", "c"]]
print(nest1)
sum = float(nest1[0][2] + list(sorted(nest1[1]["k1"]))[-1]) + nest1[1]["k2"][2] + eval(nest1[2][1])
print(sum)

#TASK 6: ADD ALL LIST VALUES INTO A STRING
print()
"""
DESIRED OUTPUT
prices = ["9", "FOUR", "2.5"]
'The bill for the pizza, chips and drink came to $15.5'
HINTS?
1. Use the format function.
Out[27]:
[(1, 2, 3), {'k1': [30, 1, 300, 2, 77], 'k2': [10, 20, 30]}, ['a', '500', '
c']]
1. Use the format function.
2. Use slicing and stride
3. Also use eval, len and str.
4. Add all the string numbers from the prices list.
5. Use the replace function twice.
"""
prices = ["a", "b", "9", "c", "d", "FOUR", "e", "f", "2.5"]
sentence = """The bill for the {}#!/,?? {}#!/ ??and drink came to {}??"""
print("prices - ",prices)
prices = prices[2::3]
total = eval(prices[0]) + len(prices[1]) + eval(prices[2])
print("prices after stride as [2::3] - ",prices)
print("sentence - ", sentence)
print(sentence.format("pizza","chips","$").replace("#!/","").replace("??","") + str(total))

