let a = 3
console.log(a)
console.log(this.a)
console.log(global.a) // Global, no Node, equivale ao Window no Browser

global.b = 123
console.log(b)
console.log(this.b)
console.log(global.b)

this.c = 456
// console.log(c)
console.log(this.c)
console.log(module.exports.c)
console.log(global.c)
console.log(module.exports === this)

this.d = true
this.e = 'Texto'
console.log(module.exports)

abc = 3 // Criando variável no Global do Node, sem var ou let
// Não fazer isso acima
console.log(global.abc)