pin=2908
i=1 #counter variabe
while(i<=3)
{
pinno=as.integer(readline("enter ATM pin :"))
if(pinno==pin)
{
  print("process")
  print("balance:")
  print("1.withdrawl")
  break # exit
}else
{
  print("invaild pinno, please again try")
  i=i+1
}
}