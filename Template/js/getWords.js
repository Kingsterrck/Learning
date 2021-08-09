

function getWords() {
    var langs = document.getElementsByClassName("lang-en TermText");
    var leng = langs.length;
    var result = [];
    for (i = 0; i < 10; i++) {
        var a = langs[parseInt(Math.random()*leng)].innerText;
        result.push(a);
    }
    console.log(result);
}