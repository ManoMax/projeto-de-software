let isAtivo = false
console.log(isAtivo)

isAtivo = true
console.log(isAtivo)

isAtivo = 1
console.log(isAtivo)
console.log(!!isAtivo)

console.log('Os verdadeiros: ')
console.log(!!3) // Positivos
console.log(!!-1) // Negativos
console.log(!!' ') // Espaços Vazios
console.log(!!'texto') // String
console.log(!![]) // Arrays
console.log(!!{}) // Objetos
console.log(!!Infinity)
console.log(!!(isAtivo = true)) // Valor a direita da Atribuição

console.log('Os falsos: ')
console.log(!!0)
console.log(!!'')
console.log(!!null)
console.log(!!NaN)
console.log(!!undefined)
console.log(!!(isAtivo = false)) // Valor a direita da Atribuição

console.log('Para finalizar: ')
console.log('' || null || 0 || 'Unico Positivo')
console.log('' || null || 0)
console.log('' || 0 || null)

let nome = ''
console.log(nome || 'desconhecido')
nome = 'Lucas'
console.log(nome || 'desconhecido')