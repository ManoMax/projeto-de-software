// Estratégia 1 para gerar valor padrão
function soma1(a, b, c) {
    a = a || 1 // 'a recebe a' ou 'a recebe 1'
    b = b || 1
    c = c || 1
    return a + b + c
}

// O problema está no ultimo exemplo
console.log(soma1(), soma1(3), soma1(1, 2, 3), soma1(0, 0, 0))

// Estratégia 2, 3 e 4 para gerar valor padrão
function soma2(a, b, c) {
    a = a !== undefined ? a : 1
    b = 1 in arguments ? b : 1 // Se houver índice 1 in arguments
    c = isNaN(c) ? 1 : c // Mais segura quanto a verificação de Tipos
    return a + b + c
}

console.log(soma2(), soma2(3), soma2(1, 2, 3), soma2(0, 0, 0))

// Valor Padrão do es2015 (ECMAScript 2015)
function soma3(a = 1, b = 1, c = 1) {
    return a + b + c
}

console.log(soma2(), soma2(3), soma2(1, 2, 3), soma2(0, 0, 0))