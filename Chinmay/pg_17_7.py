# a  = 10 
# b  = 20
# c  = 30

# globals()['a'] = 25
# globals()['b'] = 50
# globals()['c'] = 75


# print( a , b , c )


a  = 10 
b  = 20
c  = 30

locals()['a'] = 25
locals()['b'] = 50
locals()['c'] = 75


print( a , b , c )