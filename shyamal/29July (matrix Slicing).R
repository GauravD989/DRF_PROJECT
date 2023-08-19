# To eccess data from matrix A
# 1. Throught indexing
# martix [row index,col index]
# Access data through Indexing from matrix
# Suppose we want to access data at 2nd row index and 3rd col index from inbuilt matrix A
A[2,3 ] #matrixname[rowIndex , colIndex]

# Through Slicing Start row index : stop rowIndex, start col index: stop col index]

# Access element at 2nd and 3rd col index of 2nd , 3rd and 4th row index from exist matrix A
A[2:4,2:3]

# Suppose we want to access all details of(all col index) 2nd and 3rd row index from exit matrix A
A[2:3]

#create a vector
V=c(30,45,67,76,54,43,40,50,60,60,70,80)
rowname=c("Deepak","anu","Ram","abhi")
colname=c("python","ml","R")
#create a matrix with the help of vector v
A=matrix(V,nrow=4,ncol=3,byrow=TRUE,dimnames=list(rowname,colname))
print(A)

#to access all details of Ram
A["Ram",]
#A[rowindex,colindex]

#access marks of ml R of abhi from exist matrix A
A["abhi",c("ml","R")]

A
#to update the old value into new value 
#suppose change the marks of ml from 54 to 60 for"Anu"
A["anu","ml"]=60
A

#suppose we create a matrix from vector
V=c(30,45,67,76,54,43,40,50,60,60,70,80)
A=matrix(V,nrow=4,ncol=3,byrow=FALSE)
A

# to add new row in exist matrix A store data of each  columns for new rows then use inbuilt
#function rbind()
rbind(A,c(45,65,87))#but new rows temporary
A

#but add new rows permanently in exist matrix A
A=rbind(A,c(45,45,87))
A

#to add new column in existing matrix A ,use inbuilt function cbind(
A=cbind(A,c(54,67,87,99,77))
A

#to show  all details of all rows except 2nd rows
A[-2,]

#1. sum of 2 matrix 
#operations on matrix A 2*2
#first
V=c(10,20,30,40)
A=matrix(V,nrow=2,ncol=2,byrow=TRUE)
A

#create a second matrix B 2*2
V=c(5,6,7,8)
B=matrix(V,nrow=2,ncol=2,byrow=TRUE)
B

#sum of 2 matrix A and B
A+B

#subtract of 2 matrix
A-B

#cross mutiplication
A*B

#Dot multiplication %*%
A%*%B

#transpose of matrix : use t() inbuilt function
#find transpose of matrix A 
t(A) #temporary
A

A=t(A)#permanent transpose
A
 
# create a 3 vectors
V1=c(50,78,90,45)  # first student means first rows in vector

V2=c(34,78,97,43) # second student means second rows in vector

V3=c(56,46,58,68) #third student means third rows in vector
 
#bind the 3 vectors and HOLD IN MATRIX
x=rbind(V1,V2,V3)
x

