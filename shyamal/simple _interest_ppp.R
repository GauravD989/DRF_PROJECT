#WAP to find the simple interest when given principal .rate of interest and time 
#using keyword arguments
interest=function(x,y,z)  #here interest () user defined function and x for principala arguments
  #y for rate on interest arguments and z for time arguments
{
  #x,y,and z are local variable and s is also local variables or formal parameter
  s=x*y*z/100
  return(s)
}#end of function


#main program
p=as.numeric(readline("enter principal amount :"))
r=as.numeric(readline("enter rate of interest :"))
t=as.numeric(readline("enter years :"))
#call function
si=interest(p,r,t)
cat("simple interest :",si)

#find amount

amt=p+si
cat("\n amount :",amt)
