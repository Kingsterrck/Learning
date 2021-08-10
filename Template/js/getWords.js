function getWords() {
    var title = document.getElementsByTagName("h1");
    for (i = 0;i<title.length;i++) {
        var b = title[i].innerText;
    }
    var langs = document.getElementsByClassName("lang-en TermText");
    var leng = langs.length;
    var output = "@ " + b + "\n";
    for (i = 1; i < 11; i++) {
        var a = langs[parseInt(Math.random()*leng)].innerText;
        output += i + ", " + a + "\n";
    }
    console.log(output);
}