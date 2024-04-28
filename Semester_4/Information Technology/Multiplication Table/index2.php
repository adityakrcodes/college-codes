<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>
    <form action="index2.php" method="post">
        Number:
        <input type="number" name="number" id="number">
        <input type="submit" values="submit">
    </form>
    <?php
        if($_POST){
            $number=$_POST["number"];
            for($i=1;$i<=10;$i++){
                echo $number."X".$i."=".$number*$i."<br>";
            }
        }
    ?>
    
</body>
</html>