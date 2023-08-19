#create a dataframe with the help of vector
#first create a vector of id of student

id=110:120  #110 111 112 113 ....120

#create vecotr for name of student
name=c("Deepak","ANu","ROHan","Suresh","pankaj","reema","roma","karan","mona","anupriya","rakesh")

#create vector for marks of student
marks=c(35,78,89,56,45,67,54,78,67,45,52)

#collection of 3 vectors are stores in a dataframe
student=data.frame(id,name,marks)
student

#to show the type of student dataframe
class(student)
#to show the structure of table,or to show the all information of datafram
#in sql desc tablename in python dataframe.info()
#in R, use str(object of dataframe)
str(student)

#how many rows in given dataframe
#in python shape and in R dim()
dim(student)

#how many row in given dataframe
#in python student.shape[0]
#but in R,use inbuilt method nrow()
nrow(student)

#how many col given dataframe
#in python student.shape[1]
#but in R,use inbuilt method  ncol()
ncol(student)

#or use inbuilt length() : to find the no. columns in given dataframe
length(student)

student

#to show the summary of given dataframe 
#in python , dataframe.describe()
#in r , use  inbuilt method summary ()
summary(student)

#to extract name of all student from given dataframe
#1.method
student$name  #return in vector dataframename$exist colname

#2  To extract name of all student from givn dataframe but hold in dataframe
student["name"]

#but extract ALL rows of multiple columns
#suppose we want to acces name and marks of all student from given dataframe
 
#in python student [["name","marks"]]
#but in R
student[c("name","marks")]

#TO SHOW ALL details of particulat student  means particular row
#suppose we want to extract all detils of 5th studnt means 5th record
student[5,]
 
#to show all the all students except 3rd record
student[-3] #here - sign means exclude given record no.

#record   extract from dataframe through slicing start row index:stop rowindex ,start ,start colindex:stop col index
#to show all details for 3rd ,4th,5h, and 6th student
student[3:6,]
student

#to show name and marks of 3rd , 4th,5th and 6th students
student[3:6,c("name","marks")]

#1.through idexing
#2.through slicing
#3.through conditional filtering (unknow rows index

#for eg.to extract those records from student dataframe whose marks >60
#student[condition]
student[student["marks"]>60] # but retrun  answer in vector

student[student["marks"]>60,]

#or 
student[student$marks>60,]

#modify the particular record
#SUPPOSE we want to change the marks with 70 of 4th record
student[4,"marks"]=70 #dataframe[rowindex ,"colname]=new value
student

#create a new datafram with the help of vector id,name,marks
id=130:132 # 130 131 132
name=c("heena","sohan","kiran")
marks=c(56,78,90)
 #
student1=data.frame(id,name,marks)
student1

#to maege both datafRMAE row wise means rbind() and hold in new dataframe
new_student=rbind(student,student1)  #rbind (exist dataframe .exist dataframe2)
new_student

student

#add new column age in exist dataframe student
#first create a age of all students
age=c(23,32,23,23,21,24,24,25,21,20,24)
#add column age in exist  dataframe student
student=cbind(student,age)
student

#to remove exist age column from given dataframe
student$age=NULL #null inbuilt
#or student['Age']=NULL
student

#to  show name AND MARKS OF ALLLLLL STUDENTS means all rows
student[,c("name","marks")]
 
#subset()
#dplyr library in R prog
