function Carro(velocidadeMax = 200, delta = 5) {
    // Atributo Privado
    let velocidadeAtual = 0

    // Atributo Publico
    this.atributo = 55

    // Metodo Privado
    const calculaAlgo = function () {
        // Metodo
    }

    // Metodo Publico
    this.acelerar = function () {
        if (velocidadeAtual + delta <= velocidadeMax) velocidadeAtual += delta
        else velocidadeAtual = velocidadeMax
    }

    // Método Público
    this.getVelocidadeAtual = function () {
        return velocidadeAtual
    }
}

const uno = new Carro()
uno.acelerar()
console.log(uno.getVelocidadeAtual())
uno.acelerar()
console.log(uno.getVelocidadeAtual())

const palio = new Carro
palio.acelerar()
console.log(palio.getVelocidadeAtual())

const ferrari = new Carro(350, 20)
console.log(ferrari.getVelocidadeAtual())
ferrari.acelerar()
console.log(ferrari.getVelocidadeAtual())
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
console.log(ferrari.getVelocidadeAtual())

console.log(ferrari.atributo)

console.log(typeof Carro)
console.log(typeof ferrari)