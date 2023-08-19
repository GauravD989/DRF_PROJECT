#write a program to check the given year is leap year or not
yr=as.integer(readline("enter year :"))
x=yr%%4
y=yr%%100
z=yr%%400
if((x==0 & y!=0)|(z==0))
{
  cat(yr,"is leap year")
}else
{
  cat(yr,"is not a leap year")
}

rm(x)
rm(y)
rm(z)

