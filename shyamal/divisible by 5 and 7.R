#WAP  to check the given number is divisible by 5 and 7
#nestet    cond^n


n=as.integer(readline("enter no:"))
x=n%%5
y=n%%7
if(x==0)  # outer if
{
  if(y==0)  #inner if
  {
    print("number is divisible by 5 and 7 both")
  }else  #else innner if
  {
    print("number is divisible by 5 but not divisible by7 ")
  }
}else# else of outer if
  if(y==0)
  {
    print("number is  divisible by 7 but not divisible by5")
  }else
  {
    print("number is not divisible by 7 and 5 both")
  }