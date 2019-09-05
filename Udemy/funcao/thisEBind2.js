/*
function Pessoa() {
    this.idade = 0

    setInterval(function() {
        this.idade++
        console.log(this.idade)
    }.bind(this), 1000)
}
*/

function Pessoa() {
    this.idade = 0

    const self = this
    // Dispara outra função a partir de um Intervalo Determinado
    setInterval(function() {
        self.idade++
        console.log(self.idade)
    }, 1000)
}

new Pessoa