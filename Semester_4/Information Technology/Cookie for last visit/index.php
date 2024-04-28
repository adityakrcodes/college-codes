<html>
<body>
    <center><h2>Last Visitor Time on webpage</h2></center>
    <br>

<?php
    if (isset($_COOKIE["time"])) {
        $time = $_COOKIE["time"];
        echo "<h3>Last time Stored in cookie: $time</h3>";
    }
    else{
        echo "<h3>You are visiting for first time</h3>";
    }
    $time = date("d-m-Y h:i:s");
    setcookie("time", $time);
?>
</body>
</html>