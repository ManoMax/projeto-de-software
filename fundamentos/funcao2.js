// Armazenando uma Funcao numa Variavel/Constante
const imprimirSoma = function (a, b) {
    console.log(a + b)
}

imprimirSoma(2, 3)

// Armazendo uma Funcao arrow em uma variavel
const soma = (a, b) => {
    return a + b
}

console.log(soma(2, 4))

// Retorno Implícito
const subtracao = (a, b) => a - b
console.log(subtracao(2, 3))

const imprimir2 = a => a
console.log(imprimir2('Legal!'))