def is_valid_move(square, row, col, num):
    for i in range(len(square)):
        if square[row][i] == num or square[i][col] == num:
            return False
    return True

def latin_square(square, n, row, col):
    if row == n - 1 and col == n:
        return True
    if col == n:
        row += 1
        col = 0
    for num in range(1, n + 1):
        if is_valid_move(square, row, col, num):
            square[row][col] = num
            if latin_square(square, n, row, col + 1):
                return True
            square[row][col] = 0
    return False

def print_square(square):
    for row in square:
        print(" ".join(str(num) for num in row))

def main():
    n = int(input("Enter the size of the square: "))
    square = [[0 for _ in range(n)] for _ in range(n)]
    if latin_square(square, n, 0, 0):
        print("Latin square:")
        print_square(square)
    else:
        print("No latin square exists for the given size.")


if __name__ == "__main__":
    main()
