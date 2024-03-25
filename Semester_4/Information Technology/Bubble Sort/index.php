<h1>Sorting using bubble sort function</h1>
<?php
$arr = array(3, 6, 1, 8, 6, 4);
$temp = 0;
echo "<h4>Before Sorting Array</h4>";
print_r($arr);

for($i=0; $i<count($arr); $i++){
    for($j=0; $j<count($arr)-1; $j++){
        if($arr[$j] > $arr[$j+1]){
            $temp = $arr[$j];
            $arr[$j] = $arr[$j+1];
            $arr[$j+1] = $temp;
        }
    }
}

echo "<h4>After Sorting Array</h4>";
print_r($arr);
?>