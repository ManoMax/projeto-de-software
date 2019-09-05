// Novo recurso do ES2015

const pessoa = {
    nome: 'Ana',
    idade: 5,
    endereco: {
        logradouro: 'Rua ABC',
        numero: 1000
    }
}

// Tire de dentro do Objeto, Pessoa, o nome e a idade
const { nome, idade } = pessoa
console.log(nome, idade)

const { nome: n, idade: i } = pessoa
console.log(n, i)

// Atributos inexistentes
const { sobrenome, bemHumorada = true } = pessoa
// Mas se o atributo não existir, bemHumorada(Por exemplo) recebe o valor True
console.log(sobrenome, bemHumorada)

const { endereco: { logradouro, numero, cep } } = pessoa
console.log(logradouro, numero, cep)

// const { conta: { agencia, numer }} = pessoa
