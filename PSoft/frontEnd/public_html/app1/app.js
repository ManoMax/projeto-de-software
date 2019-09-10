let disciplinas = [];
const URL = 'https://lab01-projsw-ufcg.herokuapp.com/api';

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
    let $disciplinas = document.getElementById("divDisciplina");
    $disciplinas.innerHTML = '';
    disciplinas.forEach((element, indice)  => {
        let divDisciplina = document.createElement("div");
        let p = document.createElement("p");
        let botaoDelete = document.createElement("button");
    
        botaoDelete.innerText = "Apagar Disciplina";
        botaoDelete.addEventListener('click', () => {
            deleteDisciplina(disciplinas[indice].id);
        }
        );
        p.innerText = "Disciplina: " + disciplinas[indice].nome + ", Nota: " + disciplinas[indice].nota;
    
        divDisciplina.appendChild(p);
        divDisciplina.appendChild(botaoDelete);      
        
        $disciplinas.appendChild(divDisciplina);
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

function deleteDisciplina(indice) {
    fetch(URL + `/disciplinas/${indice}`, {
        'method': 'DELETE',
        'headers': {'Content-Type': 'application/json'}
    })
    .then(r => r.json())
    .then(d => {
        console.log(d);
        $mensagem.innerText = 'Disciplina removida';
        setTimeout(_ => {
            $mensagem.innerText = '';
        }, 2000);
        fetch_disciplinas();
    })
    $mensagem.innerText = 'Removendo...';
}

(function init() {
    console.log('app rodando!');
    let $button = document.getElementById("botao");
    $button.addEventListener('click', save);
    fetch_disciplinas();
}());