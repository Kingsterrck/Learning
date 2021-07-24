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
    for ($l = 1; $l < 2 * $i; ++$l)
    { if ($i == 3 and $l == 3) {
        echo "&nbsp;&nbsp;";
    } else {
        echo "*";
    }
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