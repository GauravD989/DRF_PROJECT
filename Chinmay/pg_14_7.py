#map()

import math 

lst = [5,10,15,20,25]
m1 = map(math.radians , lst)
print(list(m1))


def func(n):
    return n * n

m3 = map(func , lst)
print(list(m3))


def map_test(f , l):
    lst = []
    for i in l :
        lst  = lst + [f(i)]
    return lst

var  = map_test(math.radians , lst)
print(list(var))