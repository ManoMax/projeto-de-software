var numero = 1
let numero2 = 1
var numero3 = 1
{
    let numero = 2
    let numero2 = 2
    console.log('Numero Dentro: ', numero)
    console.log('Numero2 Dentro: ', numero2)
    console.log('Numero3 Dentro: ', numero3) // Procura internamente, na ausencia, imprime o Global
}
console.log('Numero Fora: ', numero)
console.log('Numero2 Fora: ', numero2)