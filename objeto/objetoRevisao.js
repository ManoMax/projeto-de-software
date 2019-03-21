// Coleção Dinâmica de pares chave/valor
const produto = new Object
produto.nome = 'Cadeira'
produto['marca'] = 'Genérica'
produto.preco = 220

console.log(produto)

delete produto.preco
delete produto['marca']
console.log(produto)

const carro = {
    modelo: 'A4',
    valor: 89000,
    // Objeto dentro do Objeto
    proprietario: {
        nome: 'Raul',
        idade: 56,
        endereco: {
            logradouro: 'Rua ABC',
            numero: 123
        }
    },
    // Array de Objetos
    condutores: [{
        nome: 'Junior',
        idade: 19
    }, {
        nome: 'Ana',
        idade: 42
    }],
    // Função dentro do Objeto
    calcularValorDoSeguro: function() {
        // ...
    }
}

carro.proprietario.endereco.numero = 1000
carro['proprietario']['endereco']['logradouro'] = 'Av. Gigante'
console.log(carro)

delete carro.condutores
delete carro.proprietario.endereco
delete carro.calcularValorDoSeguro
console.log(carro)
console.log(carro.condutores)
// console.log(carro.condutores.length)