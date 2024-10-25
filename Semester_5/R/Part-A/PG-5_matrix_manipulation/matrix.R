# Create vectors for each row
a<-c('c#','java','COBOL','.Net')
b<-c('javascript','Nodejs','R','Azure')
c<-c('Power BI','ASP.Net','Unity','Block chain')
# create matrix using rbind() function
x<-rbind(a,b,c)
print(x)
#rename the rows using rownames() function
rname<-c('Lang1','Lang2','Lang3')
rownames(x)<-rname
print(x)
# Access the 3rd element in the second row
cat("\n\n The third element in the second row is \n")
print(x["Lang2",3])