"""
@author lokeshwar
@created 19 Feb 2020
"""

str = 'The development of Android started in 2003 by Android, Inc., ' \
      'which was purchased by Google in 2005.[1] There were at least two ' \
      'internal releases of the software inside Google and the OHA before the ' \
      'beta version was released.[2][3] The beta was released on November 5, ' \
      '2007,[4][5] while the software development kit (SDK) was released on ' \
      'November 12, 2007.[6] Several public beta versions of the SDK were released.[7] ' \
      'These releases were done through software emulation as physical devices ' \
      'did not exist to test the operating system. \ The first public release of ' \
      'Android 1.0 occurred with the release of the T-Mobile G1 (aka HTC Dream) in ' \
      'October 2008.[8] Android 1.0 and 1.1 were not released under specific code names. ' \
      'The code names "Astro Boy" and "Bender" were tagged internally on some of the early ' \
      'pre-1.0 milestone builds and were never used as the actual code names of the 1.0 and 1.1 ' \
      'releases of the OS.[9]'

characters = {}

# ******************* My approach: Traditional way *******************

# normal printing using each char
for char in str:
    print(char, end="")

for char in str:
    if characters.keys().__contains__(char):
        characters[char] += 1
    else:
        characters[char] = 1
print("\nTraditional way :\t", characters)

# ******************* Python way *******************

char_count = {}
for char in str:
    char_count[char] = char_count.get(char, 0) + 1
print("Python way\t\t:\t", char_count)
