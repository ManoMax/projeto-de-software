let valor // não inicializada
console.log(valor)

valor = null // Ausencia de valor
// Não aponta para nenhum Local de Memória
console.log(valor)
// console.log(valor.toString()) // Erro!

const prod = {}
console.log(prod.preco)
console.log(prod)

prod.preco = 3.50
console.log(prod)

prod.preco = undefined
// Evitar atribuir como undefined, usar null ou 0 por exemplo

console.log(!!prod.preco)
console.log(prod)

delete prod.preco
console.log(prod)

prod.preco = null // Sem preço
console.log(prod)
console.log(!!prod.preco)