<?php
$var = 2.23;
echo $var;
echo " ".gettype($var)."<br>";

settype($var, "string");
echo $var;
echo " ".gettype($var)."<br>";

settype($var, "integer");
echo $var;
echo " ".gettype($var)."<br>";

settype($var, "float");
echo $var;
echo " ".gettype($var)."<br>";

settype($var, "boolean");
echo $var;
echo " ".gettype($var)."<br>";

settype($var, "null");
echo $var;
echo " ".gettype($var)."<br>";
?>