/*
 * function criarProduto(nome, preco) {
 *     return {
 *         nome: nome,
 *         preco: preco
 *     }
 * }
 */

function criarProduto(nome, preco) {
    return {
        nome,
        preco,
        desconto: 0.1
    }
}

console.log(criarProduto('Chocolate', 2))