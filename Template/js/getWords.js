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