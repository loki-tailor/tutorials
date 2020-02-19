def infiniteArgsFunction(**x):
    print("x - ", x)
    print("len(x) - ", len(x))


infiniteArgsFunction(q=10,p="string",a=False)
