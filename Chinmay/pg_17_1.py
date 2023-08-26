#global variable and local variable

# def func():
#     a = 45
    
#     global b
#     b = 6.28
    
#     print(a,b,s)

# a = 20
# b = 3.14
# s = 'python'

# print(a,b,s)
# func()
# print(a,b,s)

# |---------------------------------------------------


def func(d , e , f):
    global a 
    a = d + e + f
    print(a , b  , c )

a = 10
b = 20
c = 30

print(a , b , c )
func(a , b , c )
print(a , b , c )