// Definindo uma variável
var a = 3
// Melhor usar let
let b = 4

console.log(a, b)

// Isso abaixo é possível
var a = 30
// Embora não tenho motivo para isso
b = 40
// 'let b = 40' - Não é possível

console.log(a, b)

const c = 5

// 'c = 50' - Não é possível
console.log(c)