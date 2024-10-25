setwd('~/Code/R/Part-B/PG-7_barchart/')

data <- read.csv('data.csv')
print(data)

# Create a bar chart
barplot(data$Profit, names.arg = data$Month, xlab = 'Month', ylab='Profit', col = 'blue', main = 'Monthly Sales')