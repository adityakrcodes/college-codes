<?php
    echo "<h1>Refresh the page</h1>";
    $file = "count.txt";
    $c = file_get_contents($file);
    file_put_contents($file, $c+1);
    echo "<h1>Visitor count: ".$c."</h1>";
?>