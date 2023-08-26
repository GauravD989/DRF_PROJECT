print()
#--------------------------------------------------

a = 20
b = 3.14
s = "Python"

lst = ['a' , 'b' , 's' ]

for var in lst:
    print(globals()[var])

print(
    globals()[input("Enter the variables : ")]
    )


def fun_one():
    print("Inside fun_one ")


def fun_two():
    print("Inside fun_two ")


def fun_three():
    print("Inside fun_three ")


lst  = ['fun_one' , 'fun_two' , 'fun_three']

for var in lst:
    globals()[var]()
