<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>

.pre{

height: 100vh; width: 100vw;

display: flex; justify-content: center; margin-top: 49vh;

}

    </style>

</head>

<body>
    
<div class="pre">


<?php 

//question 1

$num = 123;
$sum = 0;

while($num>0){

$sum += ($num % 10);
$num = (int) ($num / 10);

}

echo $sum;

?>

<?php 

     //armstring number

     $num1 = 153;
     $sum = 0;
     $temp =$num1;

     while($temp >0){

     
     $digits = $temp % 10;
     $sum += ($digits * $digits * $digits);
     $temp = (int) ($temp/10);
 

     }

     if ($sum === $sum) {
        
     echo "its armstrong number";

     }else{

     echo " its not";

     }


?>


<?php 

//String

$str = "Hello world";
$count = 0;

for($i = 0 ; $i <strlen($str); $i++){

$ch = strtolower($str[$i]);
 
if($ch == 'a' || $ch == 'e' || $ch == 'i' || $ch == 'o' || $ch=='u' ){

$count++;

}

}


echo "".$count;


?>


<?php 

//fibonacci 

$num11 = 5;


$sum = 0;
$sum1  = 1;


for($i =1; $i < $num11 ; $i++ ){

$c = $sum + $sum1;

echo $c;

$sum = $sum1;
$sum1 = $c;

}

?>

<?php 

$txt = "Hello world";

echo strlen($txt);
echo str_word_count($txt);
echo strrev($txt);
echo strtolower($txt);
echo strtoupper($txt);
echo strpos($txt, "world");
echo trim($txt);
echo str_replace("hello", "world", $txt);
echo strcmp($txt , "hhhh");


?>



<?php 



$arr = array(1,2,3,4,5,6,4356);

$max = $arr[0];

foreach($arr as $nums){

if($nums > $max){

$max = $nums;

}


}

echo $max;

?>




</div>

</body>
</html>