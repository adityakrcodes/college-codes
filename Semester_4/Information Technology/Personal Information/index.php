<!DOCTYPE html>
<html lang="en">
<head>
    <title>Personal Information Form</title>
</head>
<body>
    <form action="index.php?course=BCA&college=Presidency" method="post">
        First Name: <input type="text" name="fname"><br><br>
        Last Name: <input type="text" name="lname"><br><br>
        Email id: <input type="email" name="email"><br><br>
        Select Gender: <input type="radio" id="" name="gender" value="female"> Female
        <input type="radio" id="" name="gender" value="male"> Male <br><br>
         Age: <input type="number" name="age"><br><br>
         Address: <input type="text" name="address"><br><br>
         <input type="submit" value="submit">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $fname = $_POST["fname"];
        $lname = $_POST["lname"];
        $email = $_POST["email"];
        $gender = $_POST["gender"];
        $age = $_POST["age"];
        $address = $_POST["address"];
        echo "<br>Your First Name: ".$fname."<br>";
        echo "Your Last Name: ".$lname."<br>";
        echo "Your Email: ".$email."<br>";
        echo "Your gender: ".$gender."<br>";
        echo "Your age: ".$age."<br>";
        echo "Your address: ".$address."<br>";
    }
    ?> 

</body>
</html>