const fabricantes = ['Mercedes', 'Audi', 'BMW']

function imprimir(nome, indice) {
    console.log(`${indice + 1}. ${nome}`)
}

// Para cada Elemento, ele ativa a função
fabricantes.forEach(imprimir)

fabricantes.forEach(function (a) {
    console.log(a)
})
fabricantes.forEach(fabricante => console.log(fabricante))

