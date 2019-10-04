function Pessoa(nome) {
 // this = Object.create(Pessoa.prototype);
    this.nome = nome;
    this.fale = function () { return "oi, eu sou " + this.nome; }
 // return this;
}
let p1 = new Pessoa();