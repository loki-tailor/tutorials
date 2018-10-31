"""
TASK 1: CONTROL FLOW WITH DICTIONARY
"""
d1 = { "k1": [1,2,3,(100,300,500)], "k2": [4,5,6,["phone","computer","robot"]]}
var = eval(input("Enter a number: "))
if var in d1["k1"] :#add code here
    print("found you!")
    num = input("Enter a number: ")
    #Add code VV
    if eval(num) in d1["k2"][:3]:
        print("Found another one!")

        item = input("Enter an item: ")

        if item in d1["k2"][3]:
            print("Got a", item)
        else:
            print("Can't find a",item)
    else:
        print("Can't find anything")
elif var in d1["k1"][3]: #add code here
    print("can't hide!")
else:
    print("Where are you?")