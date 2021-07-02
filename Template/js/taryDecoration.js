var timer1, timer2;
var topspace = -230;
function dropdown() {
    if (timer2) {
        clearInterval(timer2);
    }
    timer1 = setInterval(down, 1);
    function down(){
        if (topspace == 0) {
            document.getElementById("curtain").style.top= topspace + "px";
            clearInterval(timer1);
        }
        else {
            document.getElementById("curtain").style.top= topspace + "px";
            topspace++;
        }
    }
}
function goUp() {
    if (timer1) {
        clearInterval(timer1);
    }
    timer2 = setInterval(up, 1);
    function up(){
        if (topspace == -230) {
            document.getElementById("curtain").style.top= topspace + "px";
            clearInterval(timer2);
        }
        else {
            document.getElementById("curtain").style.top= topspace + "px";
            topspace--;
        }
    }
}
scroll()
var leftspace;
document.getElementById("imgContainer").style.left=leftspace + "px";
function scroll() {
    var scrollTimer;
    scrollTimer = setInterval(move, 1);
    function move() {
        if (leftspace == -180) {
            clearInterval(scrollTimer);
        } else {
            leftspace--;
            document.getElementById("imgContainer").style.left=leftspace + "px";
        }
    }
}


