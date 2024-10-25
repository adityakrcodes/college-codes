# Sample data
study_hours <- c(5,7,3,8,6,9)
exam_score <- c(80,85,60,90,75,95)

# Calculate the Pearson correlation
correlation <- cor(study_hours, exam_score)
print(round(correlation,2))

