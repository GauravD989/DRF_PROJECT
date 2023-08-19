#choice

#1. sum
#2. subtract
#3. multiply
#4. divide
# of 2 number
a=as.numeric(readline("enter first number a:"))
b=as.numeric(readline("enter second number b:"))
#\n new line
print("\n+. addition \n-. subtraction \n*. multiply \n/. divide")
ch=(readline("enter your choice :"))
switch(ch,
   "+"=cat("\n sum of 2 number :",a+b),
   "-"=cat("\n subtract of 2 number :",a-b),
   "*"=cat("\n multiply of 2 number :",a*b),
   "/"=cat("\n divide  of 2 number :",a/b ),
       cat("\n invalid choice")
) # end of switch

if(ch>5)
{
  print("\n invalid choice")
}
