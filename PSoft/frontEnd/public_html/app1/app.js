console.log('app rodando!');

let disciplinas = [];
let $disciplinas = document.querySelector("div");
let URL = 'https://lab01-projsw-ufcg.herokuapp.com/api';

let $button = document.getElementById("botao");

function fetch_disciplinas() {
    fetch(URL + '/disciplinas')
    .then(response => response.json())
    .then(dados => {
        console.log(dados);
        handler(dados);
    })
}

function handler(dados) {
    disciplinas = dados;
    $disciplinas.innerHTML = '';
    disciplinas.forEach((element, indice)  => {
        let p = document.createElement("p");
        $disciplinas.appendChild(p);
        p.innerText = "Disciplina: " + disciplinas[indice].nome + ", Nota: " + disciplinas[indice].nota;
    });
}

function save() {
    let nome = document.getElementById("nome").value;
    let nota = document.getElementById("nota").value;
    fetch(URL + '/disciplinas', 
    {
        'method': 'POST',
        'body': `{"nome": "${nome}", "nota": ${nota}}`,
        'headers': {'Content-Type': 'application/json'}
    })
    .then(r => {
        r.json();
        console.log(r);
    })
    .then(d => {
        console.log(d);
    })
}

fetch_disciplinas();
$button.onclick = save;