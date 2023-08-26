def fun_one():
    a = 45
    print(a)

    def fun_two():
        nonlocal a
        a = 90
        print(a)

    fun_two()
    print(a)

fun_one()



def fun_one():
    a = 45
    print(a)

    def fun_two(): 
        a = 90
        print(a)

    fun_two()
    print(a)

fun_one()