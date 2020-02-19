import timeit

a = timeit.timeit(stmt='lst = []',number=100000000) ;  print(a)
b = timeit.timeit(stmt='lst = list()',number=100000000) ;  print(b)
