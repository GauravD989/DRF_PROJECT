#Lambda function

# x = (lambda n : n * n * n) (5)
# print(x)


# #Using Regular function ....

# def cube(n):
#     p = (n*n*n)
#     return p

# x = cube(5)
# print(x)

# #-----------------------------------------------------------------

# t = (lambda a , b , c : (a * b * c )/(a + b + c))(5,10,15)
# print(t)

# y = (lambda n :int(n.strip()) + int(n.strip()))(" 5 ")
# print(y)

# z = (input(lambda n : n + n ))()
# print(z)



# lambda inside lambda 

t = (lambda x : (lambda y : y + 5 )(x))(55)
print(t)


t = (lambda x : (lambda y : y + 7 )(x))(17)
print(t)



def sum(z):
    y = z * z
    return y

s = (lambda n : sum(n))(25)
print(s)