function getInteiroAleatorioEntre(min, max) {
    // Math.random() gera um valor entre 0 e 1
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

let opcao = 0

while (opcao != -1) {
    opcao = getInteiroAleatorioEntre(-1, 10)
    console.log(`Opcao escolhido foi ${opcao}.`)
}

console.log('Até a próxima!')