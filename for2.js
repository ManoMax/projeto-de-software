const notas = [6.7, 7.4, 9.8, 8.1, 7.7]

// Para Array, existem formas + interessante de percorrer:
for (i in notas) {
    console.log(i, notas[i])
}

const pessoa = {
    nome: 'Ana',
    sobrenome: 'Silva',
    idade: 29,
    peso: 64
}

// Para Objeto, é interessante:
for (atributo in pessoa) {
    console.log(`${atributo} = ${pessoa[atributo]}`)
}