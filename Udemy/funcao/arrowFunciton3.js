// Função Genérica
let comparaComThis = function (param) {
    console.log(this === param)
}

comparaComThis(global)
// comparaComThis(this)

const obj = {}
comparaComThis = comparaComThis.bind(obj)
comparaComThis(global)
comparaComThis(obj)

let comparaComThisArrow = param => console.log(this === param)
comparaComThisArrow(global)
comparaComThisArrow(module.exports)
comparaComThis(this)

comparaComThisArrow = comparaComThisArrow.bind(obj)
comparaComThisArrow(obj) // Arrow Function é mais forte que o Bind
comparaComThisArrow(module.exports)