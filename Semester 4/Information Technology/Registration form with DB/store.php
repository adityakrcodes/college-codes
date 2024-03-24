<?php
    $conn = mysqli_connect('localhost', 'root', '', 'workshop');
    if ($conn === FALSE) {
        die("ERROR: Could not connect. " . mysqli_connect_error());
    }
    $first_name = mysqli_real_escape_string($conn, $_REQUEST['fname']);
    $last_name = mysqli_real_escape_string($conn, $_REQUEST['lname']);
    $email = mysqli_real_escape_string($conn, $_REQUEST['email']);
    $sql = "INSERT INTO persons (first_name, last_name, email) VALUES ('$first_name', '$last_name', '$email')";
    if(mysqli_query($conn, $sql)){
        echo "Records added successfully.";
    }else{
        echo"ERROR: Could not able to execute $sql.".mysqli_error($conn);
    }
?>