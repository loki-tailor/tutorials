#TASK 2: CONTROL FLOW WITH ONLY ONE IF STATEMENT
choose_dish = eval(input("Enter a number 0 to 2: "))
pick_sauce = eval(input("Enter a number 0 to 2: "))

cooked_pasta = ["hot","cold","over cooked"]
sauce = ["spicy","sweet","savoury"]

if (choose_dish < len(cooked_pasta) and choose_dish < 0) or (pick_sauce > len(sauce) or pick_sauce < 0):
    print(None)
else:
    print("My meal is",cooked_pasta[choose_dish],"and very",sauce[pick_sauce],"!")

"""
#Alternate to what was implented:
choose = eval(input("Enter a number 0 to 2: "))
pick = eval(input("Enter a number 0 to 2: "))
if (choose >2 and pick >2)or (choose <=2 and pick >2)or (choose >2 and pick<=2):
    None
else:
    meal = []
    cooked_pasta = ["hot", "cold", "over cooked"][choose]
    sauce = ["spicy", "sweet", "savoury"][pick]
    print("My meal is", cooked_pasta, "and very", sauce, "!")
"""