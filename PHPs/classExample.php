<?php
$object = new User;
print_r($object);echo "<br>";
$object -> name = "joe";
$object->password = "mypass";
print_r($object); echo "<br>";
$object->save_user();


class User {
    public $class, $password;
    function save_user() {
        echo "Save user codes go here";
    }
}

echo "<br>----------------<br>";

$object1 = new User2;
$object1 -> name = "Alice";
$object2 = $object1;
$object2 -> name = "Amy";
echo "object1 name = " . $object1->name . "<br>";
echo "object2 name = " . $object2->name;

echo "<br>----------------<br>";


$object3 = new User2;
$object3 -> name = "Alice";
$object4 = clone $object3;
$object4 -> name = "Amy";
echo "object3 name = " . $object3->name . "<br>";
echo "object4 name = " . $object4->name;

class User2 {
    public $name;
}

echo "<br>----------------<br>";

$rand = new User3;
class User3 {
    function __construct(){
        // public $username = "Guest";
        echo "This is new user";
    }
    function __destruct(){
        echo "Destructed";
    }
}
echo "<br>----------------<br>";

$object5 = new User3;
$object6 = $object5;

echo "<br>";

$object7 = new User3;
$object7 = "";
//$object8 = clone $object7;

echo "<br>----------------<br>";

$rand2 = new User4;
$rand2::pwd_string();
class User4 {
    static function pwd_string() {
        echo "please enter your password";
    }
}
echo "<br>----------------<br>";
