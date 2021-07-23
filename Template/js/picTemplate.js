/*
Author: Kingsterrck
contact at kingsterrck@126.com
Frontend requirement:
            <div id="window_box">
              <div id="container">
                <img src="XXX.jpg">
                <img src="XXX2.jpg">
              </div>
            </div>
#window_box is the displayed frame for pictures on the website
#container is the tray for all the images
Insert the above into <body> and the width will be automatically adjust to fit the window
*/



var win_width = window.innerWidth;
var windox_box = document.getElementById("window_box");
var numberOfPic = windox_box.getElementsByTagName("img");
var container = document.getElementById("container");
arrowsAndDots();
autoSize();

window.onresize=function(){
    autoSize();
}

function autoSize(){
    win_width = window.innerWidth;
    windox_box.style.width = win_width+"px";
    windox_box.style.overflow="hidden";
    windox_box.style.position="relative";


    console.log(container);
    container.style.width= numberOfPic.length * win_width + "px";
    container.style.position="relative";
    container.style.overflow="hidden";
    container.style.zoom=1;
    for (i=0;i<numberOfPic.length;i++) {
        numberOfPic[i].style.width=win_width + "px";
        numberOfPic[i].style.float= "left";
    }
    document.getElementById("arrowList").style.left = 10 + "px";
    document.getElementById("arrowList").style.top = 0.4* container.clientHeight + "px";
    document.getElementById("arrowList").style.width = win_width-30 + "px";
    document.getElementById("pointList").style.zIndex = 10000;
    document.getElementById("pointList").style.left= (win_width - pointList.clientWidth) /2 + "px";
}
function arrowsAndDots() {
    //create arrows
    var arrowList = document.createElement("div");
    arrowList.id = "arrowList";
    windox_box.appendChild(arrowList);
    var leftArrowBox = document.createElement("div");
    leftArrowBox.id="leftArrowBox";
    var rightArrowBox = document.createElement("div");
    rightArrowBox.id = "rightArrowBox";
    arrowList.appendChild(leftArrowBox);
    arrowList.appendChild(rightArrowBox);
    var leftArrow = document.createElement("a");
    leftArrow.innerHTML="&#8592;";
    leftArrow.id = "leftArrow";
    leftArrow.onclick=function(){goPrevious()};
    var rightArrow = document.createElement("a");
    rightArrow.innerHTML = "&#8594;";
    rightArrow.id = "rightArrow";
    rightArrow.onclick=function(){goNext()};
    leftArrowBox.appendChild(leftArrow);
    rightArrowBox.appendChild(rightArrow);

//styling arrows
    arrowList.style.position = "absolute";
    arrowList.style.zIndex = "100000";
    arrowList.style.left = 10 + "px";
    arrowList.style.top = 0.4* container.clientHeight + "px";
    arrowList.style.width = win_width-30 + "px";
    leftArrowBox.style.position = "absolute";
    rightArrowBox.style.position = "absolute";
    rightArrowBox.style.right = 0 + "px";
    leftArrow.style.fontSize = "50px";
    rightArrow.style.fontSize = "50px";
    leftArrow.style.color="white";
    rightArrow.style.color="white";

//creating dots
    var pointList = document.createElement("div");
    pointList.id = "pointList";
    windox_box.appendChild(pointList);
    for (i = 0; i < numberOfPic.length; i++) {
        var point = document.createElement("a");
        point.setAttribute("class","dots");
        point.innerHTML="&#9898;";
        point.style.float = "left";
        point.style.fontSize = 20+"px";
        point.setAttribute("data",i);
        point.onclick=function(){dotsOnclick(this)};
        pointList.appendChild(point);
    }
    pointList.firstChild.innerHTML = "&#9899;";

//styling dots
    pointList.style.overflow = "hidden";
    pointList.style.zoom = 1;
    pointList.style.position = "absolute";
    pointList.style.zIndex = 10000;
    pointList.style.left= (win_width - pointList.clientWidth) /2 + "px";
    pointList.style.bottom = 0 + "px";
    pointList.style.lineHeight = "40px";
    pointList.style.height = "40px";

    //creating pictures
    var clone_pic = numberOfPic[0].cloneNode();
    container.appendChild(clone_pic);
}


var leftspace=0;
var timer, pauseTimer, backTimer;
goLeft();
function goLeft() {
    timer = setInterval(move, 10);
}
function move() {
    leftspace--;
    document.getElementById("container").style.left=leftspace + "px";
    if (leftspace % win_width == 0){
        if (-leftspace == (numberOfPic.length-1) * win_width) {
            document.getElementById("container").style.left=0 + "px";
            leftspace = 0;
        }
        clearInterval(timer);
        changeDots();
        pauseTimer = setInterval(pause, 3000);
    }
}
function pause() {
    timer = setInterval(move, 10);
    clearInterval(pauseTimer);
}

function goNext() {
    console.log("right arrow");
    if (pauseTimer) {
        clearInterval(pauseTimer);
    }
    if (timer) {
        clearInterval(timer);
    }

    goLeft();
}
function goPrevious() {
    console.log("left arrow");
    if (backTimer) {
        clearInterval(backTimer);
    }
    if (timer) {
        clearInterval(timer);
    }

    backTimer = setInterval(goBack, 10);
}
function goBack() {
    if (timer) {
        clearInterval(timer);
    }
    if (pauseTimer) {
        clearInterval(pauseTimer);
    }
    leftspace++;
    document.getElementById("container").style.left=leftspace + "px";
    if (leftspace % win_width == 0){
        if (leftspace == 0) {
            leftspace = -win_width * (numberOfPic.length-2);
            document.getElementById("container").style.left=leftspace + "px";
        }
        if (-leftspace == (numberOfPic.length-1) * win_width) {
            document.getElementById("container").style.left=0 + "px";
            leftspace = 0;
        }
        clearInterval(backTimer);
        clearInterval(timer);
        pauseTimer = setInterval(pause, 3000);
    }
}

function changeDots() {
    if (-leftspace % win_width == 0) {
        var position = -leftspace / win_width;
        var dotList = document.getElementsByClassName("dots");
        for (i = 0;i < dotList.length;i++) {
            dotList[i].innerHTML = "&#9898;";
        }
        console.log(dotList[position])
        dotList[position].innerHTML = "&#9899;";
    }
}

function dotsOnclick(element) {
    var target = win_width * element.getAttribute("data");
    if (timer) {
        clearInterval(timer);
    }
    if (backTimer) {
        clearInterval(backTimer);
    }
    if (pauseTimer) {
        clearInterval(pauseTimer);
    }
    container.style.left = -target + "px";
    leftspace = -target;
    changeDots();
    pauseTimer = setInterval(pause, 3000);
}