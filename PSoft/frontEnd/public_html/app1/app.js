console.log('app rodando!');

let disciplinas = [];
let $disciplinas = document.querySelector("div");
let URL = 'https://lab01-projsw-ufcg.herokuapp.com/api';

let $button = document.getElementById("botao");
let $mensagem = document.getElementById("mensagem");

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
    .then(r => r.json())
    .then(d => {
        console.log(d);
        $mensagem.innerText = 'Disciplina salva';
        setTimeout(_ => {
            $mensagem.innerText = '';
        }, 2000);
        fetch_disciplinas();
    })
    $mensagem.innerText = 'Salvando...';
}

fetch_disciplinas();
$button.onclick = save;