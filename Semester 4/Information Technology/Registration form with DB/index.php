<!DOCTYPE html>
<html lang="en">
<head>
    <title>Registration form</title>
</head>
<body>
    <form action="store.php">
        <div class="fname">
            <label for="fname">First Name:</label>
            <input type="text" name="fname" id="fname" placeholder="First Name">
        </div>
        <div class="lname">
            <label for="lname">Last Name:</label>
            <input type="text" name="lname" id="lname" placeholder="Last Name">
        </div>
        <div class="email">
            <label for="email">Email:</label>
            <input type="email" name="email" id="email" placeholder="Email">
        </div>
        <input type="submit" value="Submit">
    </form>
</body>
</html>