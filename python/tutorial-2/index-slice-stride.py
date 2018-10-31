'''
indexing: "Hello"[0] => H
slicing: "Hello World"[6:] => World
stride: "abcdef"[1::2] => bdf
'''

robot = "technologically"
print(f'robot - {robot}')
print(f'len(robot) - {len(robot)}')
print(f'robot[0:6] - {robot[0:6]}')
print(f'robot[10:14] - {robot[10:14]}')
print()

console_wards = "playstation is superior, xbox inferior!"

print(f'console_wards - \n{console_wards}')
for x in range(len(console_wards)):
    if x %5 == 0:
        print()
    print(x, ":", console_wards[x],end=", ")
print()

print(f'console_wards.endswith("!") - {console_wards.endswith("!")}')
print(f'len(console_wards) - {len(console_wards)}')
print(f'console_wards[38] - {console_wards[38]}')
#counting backwards
print(f'console_wards[-1] - {console_wards[-1]}')
print(f'console_wards[15:23] - {console_wards[15:23]}')
print(f'console_wards[15:-16] - {console_wards[15:-16]}')
print(f'console_wards[-24:-16] - {console_wards[-23:-16]}')

print()
code = "p1y2t3h4o5n6i7c8"
print(f'code - {code}')
print(f'method 1 - using replace() - {code.replace("1","").replace("2","")}')
print(f'method 2 - using slicing - {code[0:1] + code[2:3] + code[4:5]}')
print(f'method 3 - using stride - {code[0::2].upper()}')
print(f'stride e.g. - code[1:2] - {code[1::2]}')
print(f'stride e.g - code[::-1] - {code[::-1]}')
print(f'stride e.g - code[::-1][0::2] - {code[::-1][0::2]}')

print()
words = "I saw a cat jump over the moon and into the clouds"
print(f'words - {words}')
print(f'words.split()[3:8] - {words.split()[3:8]}')
print(f'len(words) - {len(words)}')
print(f'len(words.split()) - {len(words.split())}')
w_list = words.split()
print(f'w_list (i.e. words.split()) - {w_list}')
print(f'w_list[3:8:2] - {w_list[3:8:2]}')
print(f'w_list[3:12:2][::-2] - {w_list[3:12:2][::-2]}')
print(f'len(w_list) - {len(w_list)}')
print(f'"cat" in w_list - {"cat" in w_list}')
print(f'"cat" not in w_list or "dog" not in w_list - {"cat" not in w_list or "dog" not in w_list}')
print(f'"dog" in w_list or "cat" in w_list - {"dog" in w_list or "cat" in w_list}')
print(f'" ".join(w_list) - {" ".join(w_list)}')

print()
new_words = "I saw a cow fly over the gates and into the forest"
print(f'new_words - {new_words}')
cow = new_words.split()
print(f'cow = new_words.split() - {cow}')
cat = words.split()
print(f'cat = words.split() - {cat}')
s1 = slice(3,12,2)
print(f'cow[s1] - {cow[s1]}')
print(f'cat[s1] - {cat[s1]}')

print()
pay = "I recieved a total of $5000"
print(f'pay - {pay}')
print(f'pay.split("$") - {pay.split("$")}')
