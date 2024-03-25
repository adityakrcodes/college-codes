<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>
    <form action="index.php" method="post">
        Enter Number: <input type="number" name="number"><br><br>
        <input type="submit" value="submit">
</form>

<?php
    if($_POST){
        $number = $_POST["number"];
        for($i=1; $i<=10; $i++){
            echo $number." x ".$i." = ".$number*$i."<br>";
        }
    }
?> 

</body>
</html>