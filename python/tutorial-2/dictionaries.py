"""
Dictionaries:
    - Consists of key-value paris separated by colon
    - They're called 'dict'
    - They can contain:
        - Strings and numbers
        - Tuples
        - Lists
        - Sets
        - Series
        - Dataframes
        - Nested dictionaries
"""

#simple example
d1 = {}
print(f'type(d1) - {type(d1)}')
d1["A"] = 10
d1["B"] = 20
d1["C"] = 30
print("d1 - ", d1)
print()

#another example of combining 2 dictionaries using update()
toys = {"robot":40,"car":50}
print("toys - ", toys)
toys.update(d1)
print("toys (after update(d1) - ", toys)
print()

#listing only values
print("toys.values() - ", toys.values())
print("list(toys.values()) - ", list(toys.values()))
print()

#listing only keys
print("toys.keys() - ", toys.keys())
print("list(toys.keys()) - ", list(toys.keys()))
print()

#pop() form dictionary
pop_dict = toys.pop("A")
print("pop_dict - ", pop_dict)

maze = {
    "k1": list(range(4)),
    "k2": tuple(range(4,8)),
    "k3": (1,2,3, {
        "k4": [1,2,3,"found you!",4,5]
    })
}
print("maze - ",maze)

print('maze["k3"][3]["k4"][3] - ', maze["k3"][3]["k4"][3])