
<?php 

$db_server = "localhost";
$db_user  = "root";
$pass = "";
$dbname = "msydb";
$conn = "";

try {

$conn =mysqli_connect($db_server , $db_user , $pass , $dbname);

} catch (mysqli_sql_exception $th) {
    echo "Page not found";
} finally{

echo "</br>"."The code runs";

}

if ($conn) {
    echo "successful";
}

?>