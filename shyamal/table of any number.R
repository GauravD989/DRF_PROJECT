#WAP to print the table of any number
n=as.integer(readline("enter number"))
i=1
while(i<=10)
{
 ans=n*i
 cat("\n",n, "*", i ,"=", ans)
 i=i+1
}