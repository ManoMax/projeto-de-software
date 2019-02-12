const produto1 = {}

// O Objeto pode receber Atributos e Comportamentos Dinamincamente
produto1.nome = 'Novo Celular'
produto1.preco = 4998.90
produto1['Desconto'] = 0.40
console.log(produto1)

produto1['Desconto Legal'] = 0.60 // Evitar Atributos Com Espaço
console.log(produto1)

const produto2 = {
    nome: 'Camisa Polo',
    preco: 79.90,
    // Objeto dentro
    obj: {
        propriedade: 1,
        // Outro Objeto (Único)
        obj: {
            outraPropriedade: 2
        } 
    }
}

console.log(produto2)