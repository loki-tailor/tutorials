"""
@author lokeshwar
@created 19 Feb 2020
"""

str1 = "You are learning Python"
str2 = "There are 256 programming languages in the world"
str3 = "You are the best"

# Python is the best programming language in the world

# my approach
word1 = str1.split(" ")[len(str1.split(" ")) - 1]
word2 = str1.split(" ")[2][-3:][:1] + str3.split(" ")[3][:3][-1:]
word3 = str3[-8:]
word4 = str2[-34:].replace("languages", "language")
print(word1, word2, word3, word4)

# their approach
result = str1[-6:] + str2[-13:-11] + str3[-2:-1] + str3[-9:] + str2[13:34] + str2[35:]
print(result)
