function soma() {
    let soma = 0
    // arguments é um Array
    for (i in arguments) {
        soma += arguments[i]
    }
    return soma
}

console.log(soma())
console.log(soma(2))
console.log(soma(2, 3))
console.log(soma(2, 3, 4))
console.log(soma(2.2, 3.3, 4.4))
console.log(soma('Teste'))
console.log(soma(2.2, 3.3, 'Teste'))
console.log(soma('a', 'b', 'c'))
console.log(soma(true))
console.log(soma(true, true))
console.log(soma(true, false))
console.log(soma(function () { }))
console.log(soma(new function () { }))
