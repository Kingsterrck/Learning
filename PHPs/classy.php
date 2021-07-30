<?php
//class myClass {
//    public $public = 'public';
//    protected $protected = 'protected';
//    private $private = 'private';
//
//    function printHello() {
//        echo $this ->public;
//        echo $this ->protected;
//        echo $this ->private;
//    }
//}
//
//$obj = new myClass();
//echo $obj->public;
////echo $obj->protected;
////echo $obj->private;
//$obj->printHello();
//
//class myClass2 extends myClass {
//    public $public = 'public2';
//    protected $protected = 'protected2';
//
//    function printHello() {
//        echo $this ->public;
//        echo $this ->protected;
//        echo $this ->private;
//    }
//}
//
//$obj2 = new myClass2();
//echo $obj2 ->public;
////echo $obj2 ->protected;
////echo $obj2 ->private;
//$obj2->printHello();

//class myClass {
//    public function __construct() { }
//
//    public function myPublic() { }
//
//    protected function myProtected() { }
//
//    private function myPrivate() { }
//
//    function foo() {
//        $this->myPublic();
//        $this->myProtected();
//        $this->myPrivate();
//    }
//}
//
//$myClass = new myClass;
//$myClass ->myPublic();
////$myClass ->myProtected();
////$myClass ->myPrivate();
//$myClass ->foo();
//
//class myClass2 extends myClass {
//    function foo2() {
//        $this->myPublic();
//        $this->myProtected();
//        //$this->myPrivate();
//    }
//}
//
//$myClass2 = new myClass2();
//$myClass2->myPublic();
//$myClass2->foo2();
//
//class bar {
//    public function test() {
//        $this->testPublic();
//        $this->testProtected();
//        $this->testPrivate();
//    }
//
//    public function testPublic() {
//
//        echo "bar::testpublic\n";
//    }
//    protected function testProtected() {
//        echo "bar::testprotected\n";
//    }
//    private function testPrivate() {
//        echo "bar::testprivate\n";
//    }
//}
//class foo extends bar {
//    public function test() {
//        $this->testPublic();
//        $this->testProtected();
//        $this->testPrivate();
//        parent::testProtected();
//        parent::test();
//    }
//    public function testPublic() {
//        echo "foo::testpublic\n";
//    }
//    protected function testProtected()
//    {
//        echo "foo::testprotected\n";
//    }
//
//    private function testPrivate() {
//        echo "foo::testprivate\n";
//    }
//}
//$myFoo = new foo();
//$myFoo->test();

//class myClass {
//    public const myPublic = 'public';
//    protected const myProtected = 'protected';
//    private const myPrivate = 'private';
//    public function foo(){
//        echo self::myPublic;
//        echo self::myProtected;
//        echo self::myPrivate;
//    }
//}
//
//$myClass = new myClass();
//$myClass::myPublic;
////$myClass::myProtected;
////$myClass::myPrivate;
//$myClass->foo();
//
//class myClass2 extends myClass {
//    function foo2() {
//        echo self::myPublic;
//        echo self::myProtected;
//        echo self::myPrivate;
//    }
//}
//$myClass2 = new myClass2;
//echo myClass2::myPublic;
//$myClass2->foo2();

//class test {
//    private $foo;
//
//    public function __construct($foo) {
//        $this->foo = $foo;
//    }
//    private function bar() {
//        echo 'Accessed the private method.';
//    }
//    public function baz(test $other) {
//        $other->foo = 'hello';
//        var_dump($other->foo);
//        $other->bar();
//    }
//}
//$test = new test('test');
//$test->baz(new test('other'));
//
//class BaseClass {
//    public function test() {
//        echo "BaseClass::test() called\n";
//    }
//
//    final public function moreTesting() {
//        echo "BaseClass::moreTesting() called\n";
//    }
//}
//
//class ChildClass extends BaseClass {
//    public function moreTesting() {
//        echo "ChildClass::moreTesting() called\n";
//    }
//}

$paper = array('copier'=>"copier and multipurpose",
                'inkjet'=>"inkjet printer",
                'laser'=>"laser printer",
                'photo'=>"photographic paper");
//
$a["copier"]= "copier and multipurpose";
$a["inkjet"]= "inkjet printer";
$a["laser"]= "laser printer";
$a["photo"]= "photographic paper";
foreach ($a as $item => $description) {
    echo "$item : $description<br>";
}