<?php
    // $time = $_COOKIE['time'];
    $time = date('d/m/y h:i:s');
    echo"<h3>Last time stored in cookie: ".$time."</h3>";
    echo"<h3>You are visiting for the first time</h3>";
    $_COOKIE['time'] = $time;
    // setcookie('time', $time, time() + 60);
    // setcookie('visit_time', date('d/m/y h:i:s'), time() + 60);
?>