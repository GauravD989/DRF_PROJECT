A=c(87L,54L,66L,30L,79L,90L,75L,88L)
print(A)
#to check the datatype of vector A
print(class(A))
#Access data from vecotr A
#first method : through indexing
#in R,only positive indexing is possible\
#Access fourth element from vector A then use indexing
print(A[4])
#note: in R , indexing start from

#access all elements except 4the element from vector A
print(A[-4]) #here - sign means except element from given index
#skip the 4th  element(-4)


#--TO access multiple element from vecotr A
#-in python A[[index1, index2,.......]]
#in R , A[c(index1, index2,...)]\

#suppose we want of access elemtent at 2nd index , 5th index and 8th  index from
#vector A

print(A[c(2,4,7)])  # in python a[[2,4,8]]

#suppose we want to access all element from vector A except element at
#2nd and 5th index

print(A[-c(2,5)])  #or print(A[c(-2,-5)])

#second method to access data from existing vector : through slicing:
#if data access in continuation from vector A
#syntax exist vecotr name[start index : stop index] # step by default +1 fix
#suppose we want to access element from 2nd index to 6th index one by one from
#exist vector A
print(A[2:6]) #2nd index, 3rd index ,4th index, 5th index, 6th index