'''
Letters and numbers in a string are called elements
Strings are immutable
'''

cat = "meow" ; dog = "woof" ; parrot = 'hello'
print(cat, dog, parrot)
print()
print(cat, dog, parrot, sep = ",")
print()
print(cat, dog, parrot, sep = " - ")
print()
print(cat, dog, parrot, end = "!!!!")

print()
print()
day = "Good Day"
print(f'{day.lower()}')
print(f'{day.upper()}')
print(f'{day.capitalize()}')

print(f'{type(eval)}')
print(f'{type(eval("20"))}')
print(f'eval("20 * 100") - {eval("20 * 100")}')

check = "a a a b b b c B B a a C C C"
print(f'check - {check}')
print(f'check.count("C") - {check.count("C")}')

#indexing starts at zero
print()
code = "P-Y-T-H-O-N-I-C"
print(code)
# STRIDE
print(f'{code[0::2]}')
print(f'{code[1::2]}')

print()
words = "I saw a cat jump over the moon and into the clouds"
print(f'words - {words}')
print(f'words.split()[3:8] - {words.split()[3:8]}')

# NEGATIVE INDEX COUNTS BACKWARDS WITH -1, INDEXIN STARTS AT ZERO, 0
