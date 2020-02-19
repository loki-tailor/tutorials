#Difference between print when using eval() and w/o eval during int printing = 0.528969

from datetime import datetime
def strOfNos():
    s = []
    for x in range(100000):
        s.append(str(x))
    #print(s)
    return s

strOfNos()
print(datetime.now())
for x in strOfNos():
    print(x)
print(datetime.now())

#when using eval(int)
#2018-10-29 12:36:08.206022
#2018-10-29 12:36:10.407911
#diff = 2.201889 s

#when using int only
#2018-10-29 12:37:50.022753
#2018-10-29 12:37:51.090045
#diff = 1.67292