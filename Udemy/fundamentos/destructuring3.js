function rand({ min = 0, max = 1000 }) {
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

const obj = { max: 50, min: 40 }
console.log(rand(obj)) // Gera valor aleatorios entre 40 e 50
console.log(rand({ min: 955 })) // Como o valor Padrão Máximo é 1000, gera valores de 955 a 1000
console.log(rand({}))
// console.log(rand())