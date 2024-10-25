year = as.integer(readline(prompt = "Enter year to be checked: "))
if (year%%4 == 0 && year%%100 != 0 || year%%400 == 0) {
  print(paste(year, " is a leap year"))
} else {
  print(paste(year, " is not a leap year"))
}