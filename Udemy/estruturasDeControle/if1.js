function soBoaNoticia(nota) {
    if(nota >= 7) {
        console.log('Aprovado com', nota)
    }
}

soBoaNoticia(8.1)
soBoaNoticia(6.1)

function seForVerdadeEuFalo(valor) {
    if (valor) {
        console.log('É verdade... ' + valor)
    }
}

seForVerdadeEuFalo() // undefined é False
seForVerdadeEuFalo(null)
seForVerdadeEuFalo(undefined)
seForVerdadeEuFalo(NaN)
seForVerdadeEuFalo('')
seForVerdadeEuFalo(0)
seForVerdadeEuFalo(-1)
seForVerdadeEuFalo(' ')
seForVerdadeEuFalo('String Preenchida')
seForVerdadeEuFalo([])
seForVerdadeEuFalo([1, 2, 3])
seForVerdadeEuFalo(Object)