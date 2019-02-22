function area(largura, altura) {
    const area = largura * altura
    if (area > 20) {
        console.log(`Valor acima do permitido: ${area}m^2.`)
    } else {
        return area
    }
}

console.log(area(2, 2))
console.log(area(2)) // 2 * undefined = NaN
console.log(area())
console.log(area(2, 3, 17, 22, 44))
console.log(area(5, 5)) // Printou por conta da função e Returnou undefined