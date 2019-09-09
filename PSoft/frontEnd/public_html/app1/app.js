console.log('app rodando!');

let disciplinas = [];
let $disciplinas = document.querySelector("div");
function fetch_disciplinas() {
    let URL = 'https://lab01-projsw-ufcg.herokuapp.com/api/disciplinas';
    fetch(URL)
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
        p.innerText = "Disciplina: " + disciplinas[indice].nome + " - Nota: " + disciplinas[indice].nota;
    });
}
fetch_disciplinas();