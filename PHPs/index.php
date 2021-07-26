<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

  <style>
    * {
    padding:0;
    margin:0;
}
    a {
    float:left;
    text-decoration: none;
    }
  </style>
</head>
<body>
<?php
$username = "Fred Smith";
echo $username;
echo "<br>";
$current_user = $username;
echo $current_user;
echo "<a href='#'>dsfsdfsdf</a>";
echo "my name is $username";
$aa =[1,2,3,4,5];
echo $aa;
print($aa);
print_r($aa);
echo "<br>";
$n = 10;
for ($i = 1; $i < $n; ++$i) {
    for ($k = 0; $k < 10 - $n; ++$k)
    {echo " ";}
    for ($l = 1; $l < 2 * $i; ++$l) {
        if ($i == 3 and $l == 3) {
            continue;

        }
        echo "*";
    }
    for ($k = 0; $k < 10 - $n; ++$k)
    {echo " ";}
    echo "<br>";
}
$num = 1;
function sum(){
    global $num;
    echo $num;
}

$a1 = "WILLIAMS";
$a2 = "henry";
$a3 = "gatES";

echo $a1 . " " . $a2 . " " . $a3 . "<br>";
// fix_names2($a1, $a2, $a3);
fix_names3();
echo $a1 . " " . $a2 . " " . $a3;

function fix_names2 (&$n1, &$n2, &$n3) {
    $n1 = ucfirst(strtolower($n1));
    $n2 = ucfirst(strtolower($n2));
    $n3 = ucfirst(strtolower($n3));
}

function fix_names3 (){
    global $a1; $a1 = ucfirst(strtolower($a1));
    global $a2; $a2 = ucfirst(strtolower($a2));
    global $a3; $a3 = ucfirst(strtolower($a3));
}

//function fix_names($n1, $n2, $n3) {
//    $n1 = ucfirst(strtolower($n1));
//    $n2 = ucfirst(strtolower($n2));
//    $n3 = ucfirst(strtolower($n3));
//    return array($n1,$n2,$n3);
//}
//
//$names = fix_names($a1, $a2, $a3);
//echo $names[0] . " " . $names[1] . " " . $names[2];
?>
<div id="window_box">
  <div id="container">

    <img src="slide1.jpg"><!-- 0 -->
    <img src="slide2.jpg"><!-- -1000 -->
<!--    <img src="slide1.jpg">&lt;!&ndash; -2000 &ndash;&gt;-->
  </div>
<!--  <div id="arrowlist">-->
<!--    <div>-->
<!--      <a onclick="left()">&#8592;</a>-->
<!--    </div>-->
<!--    <div id="rightarrow">-->
<!--      <a onclick="right()">&#8594;</a>-->
<!--    </div>-->
<!--  </div>-->
<!--  <div id="pointList">-->
<!--    <a onclick="switchall(this)" href="#" data="1" id="dot1" class="dots">&#9899;</a>-->
<!--    <a onclick="switchall(this)" herf="#" data="2" id="dot2" class="dots">&#9898;</a>-->
<!--  </div>-->
</div>
<script src="picTemplate.js"></script>
</body>
</html>