#Passing a function as arguement to a function

# def fun():
#     print("Hello")

# f = fun

# def sum(x , y , u):
#     print(x  +  y)
#     u()                # u  > f   >>>> fun()

# g = sum
# g(10 , 20 ,f)



#-----------------------------------------------------------------------------

def sum(x , y , u):
    z  = x  +  y
    u()

g = sum
