#defult arguments
#for eg. wap to find the sum of 2 nos.3nos. and 4nos
addition= function(a=0,b=0,c=0,d=0)
{
  return(a+b+c+d)
}

#MAIN PROGRAM 
result= addition(4,5) #sum of 2 nos.
cat("\n sum of 2 nos :",result)

#or

result=addition(c=9,a=10) #keyword arguments
cat("\n sum of 2 nos :",result)

# for 3 numbers addition
result=addition(50,60,60)
cat("\n sum of 3 nos :", result)



