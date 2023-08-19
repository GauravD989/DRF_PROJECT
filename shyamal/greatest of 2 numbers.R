#write a program to find the greatest of 2 numbers
a=as.integer(readline("enter no a"))
b=as.integer(readline("enter no b"))
if(a>b)
{
  print("a is greatest number")
}else
  if(a==b)
  {
    print("both number a and b are same")
  }else
  {
    print("b is greatest number")
  }

#to remove variable
rm(a)
rm(b)