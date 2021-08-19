// version 1, random 10 words from the list
function getWords() { 
    var title = document.getElementsByTagName("h1");
    for (i = 0;i<title.length;i++) {
        var b = title[i].innerText; //b is title
    }
    var wordList = document.getElementsByClassName("lang-en TermText"); //get all the words
    var list = [];
    for (i=0;i<wordList.length;i++){ // copy words to list
        list.push(wordList[i]);
    }
    var output = "@ " + b + "\n";
    var bfleng = list.length;
    for (i = 1; i < 11; i++) {
        if (list.length < 10 && i > bfleng){break}
        var pos = parseInt(Math.random()*list.length);
        var a = list[pos].innerText;
        output += i + ". " + a + "\n";
        list.splice(pos,1);
    }
    console.log(output);
}
//version 1.1 (or 2), choose the 10 longest words
function getWords2() { 
    var title = document.getElementsByTagName("h1");
    for (i = 0;i<title.length;i++) {
        var b = title[i].innerText; //b is title
    }
    var wordList = document.getElementsByClassName("lang-en TermText"); //get all the words
    var list = [];
    for (i=0;i<wordList.length;i++){ // copy words to list
        list.push(wordList[i].innerText);
    }
    var bfleng = list.length;
    if (bfleng > 10) {
        for (i = 0;i<list.length;i++) {
        for (k = 1;k < list.length;k++){
            if (list[k-1].length < list[k].length) { // if the latter word is longer than the former one
                list.splice(k-1,0,list[k]);
                list.splice(k+1,1);
                }
            }
        }
        for (i=1;i<bfleng-11;i++){
        list.pop();//get rid of extra words
    }
    }
    var output = "@ " + b + "\n";
    for (i = 1; i < 11; i++) {
        if (list.length < 10 && i > bfleng){break}
        var pos = parseInt(Math.random()*list.length);
        var a = list[pos];
        output += i + ". " + a + "\n";
        list.splice(pos,1);
    }
    console.log(output);
}