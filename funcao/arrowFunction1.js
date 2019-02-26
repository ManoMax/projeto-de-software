// Primeira Função
let dobro = function (a) {
    return 2 * a
}

// Rescrevendo a Função
dobro = (a) => {
    return 2 * 2
}

// Como só tem 1 parâmetro
dobro = a => 2 * a // Return implícito
console.log(dobro(Math.PI))

// Segunda Função
let ola = function () {
    return 'Olá'
}

ola = () => 'Olá'
ola = _ => 'Olá' // Tbm pode
console.log(ola())
