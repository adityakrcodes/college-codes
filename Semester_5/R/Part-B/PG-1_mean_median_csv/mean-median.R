setwd('/home/adityakrcodes/Code/R/Part-B')
x<-read.csv("marks.csv")
print(x)
m<-mean(x$marks)
cat("\n\nMean of Student marks is\t\t", m)
med<-median(x$marks)
cat("\n\nMedain of Student marks is\t\t", med)