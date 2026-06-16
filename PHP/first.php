<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
<pre>

<?php

echo "\n\t Hello World!";


/* Variables */

$greetings = 'meeee';

echo "\n\t hello $greetings!!";

echo "\n\t hello" . $greetings . "!!";

$num1 = 5;

$num2 = 10;

echo "\n\t $num1 + $num2";
  
$firstName = "John";
$int = 30;
$float = 2.43;
$bool = true;
$double = 1.24333;
$arr = array([["hello"],1,34,324.46564,'bye']);


var_dump($firstName);

var_dump($int);

var_dump($float);   

var_dump($bool);

var_dump($double);

var_dump($arr);


/* Global and Local Scope */


$h = "hello";
$d ="bye";

function test(){

    global $h, $d;

    $h = $h . $d;

    echo "\n\t$h";

} 

test();

echo "\n\t$h";

echo "\n\t" ."total characters : ". strlen("hello :") ;

echo $h;

?>


</pre>

</body>
</html>