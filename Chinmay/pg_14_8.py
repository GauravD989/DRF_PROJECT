#filter()

# lst_1 = ['A' , 'X' , 'Y' , '3', 'M ' , '4' , 'D' ]

# f1 = filter(str.isalpha , lst_1)
# print(list(f1))

lst_2 = [5,10,18,27,35,40]


def func(n):
    if n % 5 == 0:
        return True
    
    else:
        return False

f1 = filter(func , lst_2)
print(list(f1))


def fil_test(f , l):
    lst =[]
    for i in l:
        if f(i):
            lst  = lst + [i]

        else:
            pass
    return lst



f8 = fil_test(func , lst_2)
print(list(f8))