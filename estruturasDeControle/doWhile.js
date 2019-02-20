function getInteiroAleatorioEntre(min, max) {
    // Math.random() gera um valor entre 0 e 1
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

// Mesmo que não fosse True
let opcao = -1

// O Do While Obriga pelo menos uma varredura no código
do {
    opcao = getInteiroAleatorioEntre(-1, 10)
    console.log(`Opcao escolhido foi ${opcao}.`)
} while (opcao != -1)

console.log('Até a próxima!')