sub_marks <- c(57,98,59,89,78,90,57,96,45,75)
marks = sum(sub_marks)
print(paste(marks," is the total marks scored"))
if(marks >= 800 && marks <= 1000){
  grade <-'A+'
}else{
  if(marks >= 700 && marks <= 799){
    grade <-'A'
  }else {
    if(marks >= 500 && marks <= 700){
      grade <-'B+'
    }else{
      if(marks >= 400 && marks <= 500){
        grade <-'B'
      } else{
        if(marks >= 150 && marks <= 400){
          grade <-'C'
        } else{
          if(marks < 150){
            grade <-'D'
          }
        }
      }
    }
  }
}
print(paste(grade, "is the grade secured by the student"))