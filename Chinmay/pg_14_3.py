#Assigning a function to a variable and calling a  function using the variable name.


def fun():
    print("Hello")


def sum(x ,y):
    print(x +y)

f = fun            #Assigning function "fun" to variable "f"
f()

g = sum
g(10 , 20)
